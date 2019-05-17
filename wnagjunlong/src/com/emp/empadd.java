package com.emp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class empadd
 */
@WebServlet("/empadd")
public class empadd extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		Integer id = Integer.valueOf(request.getParameter("id"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		HttpSession session =  request.getSession();
		Map<Integer, emp> map = (Map<Integer, emp>)session.getAttribute("c");
		if(map==null){
			map = new HashMap<Integer, emp>();
		}
		emp emp = new emp(id, salary, name);
		map.put(id,emp);
		session.setAttribute("c", map);
		request.getRequestDispatcher("empindex.html").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
