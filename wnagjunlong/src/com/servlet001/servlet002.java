package com.servlet001;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

/**
 * Servlet implementation class servlet002
 */
@WebServlet("/servlet002")
public class servlet002 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String use = request.getParameter("use");
		String psw = request.getParameter("psw");
		Cookie[] cook= request.getCookies();
		Cookie cookie = null;
		String sctime = null;
		System.out.println("username:"+use);
		System.out.println("password:"+psw);
		
		Map<String, String> map = new HashMap<>();
		map.put("张", "111");
		map.put("李", "222");
		if (psw.equals(map.get(use))) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String date = simpleDateFormat.format(new Date());
			if (cook!=null) {
				for(Cookie c : cook){
					sctime = c.getValue();
					cookie = c;
					if (c.getName().equals("time")) {
						System.out.println("登陆成功，你上次的登陆时间为:"+sctime);
						cookie.setValue(date);
						cookie.setMaxAge(60*60*24*30);
						response.addCookie(cookie);
					}else{
						cookie.setMaxAge(60*60*24*30);
						cookie = new Cookie("time", date);
						response.addCookie(cookie);
						System.out.println("登陆成功(第一次登陆");
					}
				}
			}else {
				cookie = new Cookie("time", date);
				cookie.setMaxAge(60*60*24*30);
				response.addCookie(cookie);
				System.out.println("登陆成功(第一次登陆");
			}
			request.getRequestDispatcher("mao.html").forward(request, response);
		}else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.write("登录失败！");
		}
		HttpSession si = request.getSession();
		si.setAttribute("name", 3333);
		Object name1 = si.getAttribute("name");
		System.out.println(name1);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
