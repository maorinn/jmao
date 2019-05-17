<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.*" %>
<%@page import="com.accident.*" %>
<%@page import="jdbctool.*" %>
<%@page import="dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>顺通物流管理系统</title>
   <style type="text/css">
    .bg{
        background-image: url(img/bg.jpg);
        background-size: 100% 100%;
        height: 140px;
        width: 100%;
    }
    .bg p{
  
        position: absolute;
        bottom: 83%;
        color: aliceblue;
    }
    .bg-left{
        float: left;
        background-image: url(img/bg-left.jpg);
        background-size: 100%;
        height: 625px;
        width: 16%;
        
    }
    .bg-left center p{
        color: black;
        font-size: 17px
    }
    .bg-rigth{
        background-color: #ffffff;
    }
    .bg-rigth span{
        margin-top: 20px;
        margin-bottom: 100px
    }
    .cc{
        background-color: #cccccc;
        float: right
    }
    .bg-rigth2{
    	float: right;
    }
    .bg-rigth3{
    	background-color: cornflowerblue;
    	height: 27px;
    	width: 100%;
    	color: #FFFFFF;
    }
    </style>
</head>
<body>
    <div class="bg">
        <p>承运管理      运输管理      系统管理      调度管理      财务管理</p>
    </div>
    <div class="bg-left">
        <center>
                <p>>>车辆类型</p>
                <p>>>车队管理</p>
                <p style="color:aliceblue;">>>事故记录</p>
        </center>
        
            
    </div>
    <div class="bg-rigth">
            <span>运输管理</span>
			<div class="bg-rigth2">
				<form action="showw" method="post">
					<p>事故时间：<input type="text" name="date" /><input type="submit" value="查找" /></p>
				</form>
			</div>
			<p><hr /></p>
			<div class="bg-rigth3">
				事故列表
			</div>
			<center>
			<table border="1">
				<tr>
				<th>选择</th>
				<th>事故时间</th>
				<th>事故地点</th>
				<th>驾驶员</th>
				<th>事故时间</th>
				<th>操作</th>
				</tr>
				<%	
					ArrayList<accident> arrayList = new ArrayList();
					Logistics_AccidentDao logistics_AccidentDao = new Logistics_AccidentDao();
					arrayList = logistics_AccidentDao.Inquire();
					for(accident cc:arrayList){
				%>
				<tr>
				<td>选择</td>
				<td><%=cc.getAccident_Time() %>></td>
				<td><%=cc.getAccident_PlaceAddress() %>></td>
				<td>驾驶员</td>
				<td>操作</td>
				</tr>
				<%} %>
				</table>
			
			
			
			
			
			
			</center>
    </div>
</body>
</html>