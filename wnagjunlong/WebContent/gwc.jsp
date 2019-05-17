<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>商品列表</h1>
	<c:forEach var="key" items="c">
	<p>商品名称:<c:out value="key"></c:out> 个数:<c:out value="c.key"></c:out><a href="delete?id=<c:out value="key"></c:out>">删除</a></p>
	</c:forEach>
	
</body>
</html>