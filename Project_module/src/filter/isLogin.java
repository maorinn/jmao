package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user;

/**
 * Servlet Filter implementation class isLogin
 */
@WebFilter(filterName="/isLogin",urlPatterns="/*")
public class isLogin implements Filter {



	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest req = (HttpServletRequest) request;
		 HttpSession session = req.getSession();
		 HttpServletResponse resp = (HttpServletResponse)response;
		 String requestURI = req.getRequestURI();
		 String url = requestURI.split("/")[2];
		 user attribute = (user)session.getAttribute("user");
		 System.out.println(url);
		 if (attribute!=null||"login.html".equals(url)||"assets".equals(url)||"login".equals(url)) {
			 chain.doFilter(request, response);
		}else {
			resp.sendRedirect("login.html");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
