package carts;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class cartss
 */
@WebServlet("/cartss")
public class cartss extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String[] commodity = {"苹果","华为","三星","诺基亚"};
		int id = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession(); 
		Map<String, Integer> map = (Map<String, Integer>) session.getAttribute("c");
		if(map==null){
			//Set<String> set =  map.keySet();
			map = new HashMap<String, Integer>();
		}
		
		if (map.get(commodity[id]) == null) {
			map.put(commodity[id], 1);
			session.setAttribute("c", map);
			response.sendRedirect("gwc.jsp");
		}else {
			if (map.get(commodity[id])>=1) {
				int value = map.get(commodity[id]);
				value = value+1;
				map.put(commodity[id], value);
				session.setAttribute("c", map);
				response.sendRedirect("gwc.jsp");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
