package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IsUser;
import dao.daopswmodify;

/**
 * Servlet implementation class modify
 */
@WebServlet("/modify")
public class modify extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String oldpsw = request.getParameter("oldpsw");
		String newpsw = request.getParameter("newpsw");
		String newpsws = request.getParameter("newpsws");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		IsUser isuser = new IsUser();
		PrintWriter writer = response.getWriter();
		boolean cc = isuser.IsUsers(user, oldpsw);
		if (cc) {//验证用户名密码
			boolean isNewpsw = isuser.IsNewpsw(newpsw, newpsws);
			if (isNewpsw) {
				daopswmodify daopswmodify = new daopswmodify();
				if (daopswmodify.pswmodify(user, newpsws)) {
					writer.println("修改成功");
				}else {
					writer.println("修改失败");
				}
			}else {
				writer.print("两次输入密码不一致");
			}
		}else {
			writer.println("旧密码错误");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
