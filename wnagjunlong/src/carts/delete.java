package carts;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("id");
		HttpSession session = request.getSession();
		Map<String, Integer> map = (Map<String, Integer>) session.getAttribute("c");
		if (map.get(key)>1) {
			int value = map.get(key);
			value = value-1;
			map.put(key, value);
			session.setAttribute("c", map);
			response.sendRedirect("gwc.jsp");
		}else{
			map.remove(key);
			session.setAttribute("c", map);
			response.sendRedirect("gwc.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
