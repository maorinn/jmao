package com.emp;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.emp.emp;

@WebServlet("/desemp")
public class desemp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		HttpSession session =  request.getSession();
		Map<Integer, emp> map = (Map<Integer, emp>) session.getAttribute("c");
		emp emp = map.get(id);
		session.setAttribute("cc", emp);
		request.getRequestDispatcher("desemp.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
