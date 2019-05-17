<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.*" %>
<%@page import="com.emp.emp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>查询指定员工信息</h1>
<form action="desemp">
请输出员工工号：<input type="text" name="id">
<button type="submit">查询</button>
<%
emp emp = (emp) session.getAttribute("cc");
if(emp!=null){
	%>
	<p><%=emp %>
<%
}

%>
</form>
</body>
</html>