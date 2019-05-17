package registeredServers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import dao.loginDao;
import dao.registeredDao;

/**
 * Servlet implementation class registered
 */
@WebServlet("/registered")
public class registered extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user = request.getParameter("user");
		String psw = request.getParameter("psw");
		empdao empdao = new empdao();
		int cc = empdao.registereUser(user, psw);
		if (cc>0) {
			System.out.println("×¢²á³É¹¦");
		}else {
			System.out.println("×¢²áÊ§°Ü");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
