package com.servlet001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

public class servle extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail = req.getParameter("mail");
		String pws = req.getParameter("pws");
		String mail1 = "maoring@gmail.com";
		String pws1 = "926458";
		PrintWriter xy = resp.getWriter();
		if(mail.equals(mail1)&&pws.equals(pws1)){
			System.out.println("µÇÂ¼³É¹¦£¡");
			xy.write("ture");
		}else {
			System.out.println("µÇÂ¼Ê§°Ü£¡");
			xy.write("fas");
			
		}
		
	}
}
