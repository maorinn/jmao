package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user;

import dao.loginDao;
import dao.registeredDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(email);
		System.out.println(password);
		loginDao loginDao = new loginDao();
		boolean logon = loginDao.isLogon(email, password);
		if (logon) {
			HttpSession session = request.getSession();
			user user = new user(email, password);
			session.setAttribute("user", user);
			request.getRequestDispatcher("index.html").forward(request, response);
		}else {
			PrintWriter writer = response.getWriter();
			writer.print("µÇÂ¼Ê§°Ü£¡");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
