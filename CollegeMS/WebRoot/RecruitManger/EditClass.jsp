<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改界面</title>
    <script
	src="<%=path%>/lib/JQuery/jquery-3.2.1.min.js"></script> 
<link rel="stylesheet"
	href="<%=path%>/lib/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=path%>/lib/style.css" />
<script src="<%=path%>/lib/bootstrap/js/bootstrap.min.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
<form method="get" action="com.College.controller.UpdateClass">
<%
     String major=(String)request.getAttribute("major");
     String college=(String)request.getAttribute("college");
     String cid=(String)request.getAttribute("cid");
%>
学院<input type="text" name="college" value="<%=college%>">
专业<input type="text" name="major" value="<%=major%>">
编号<input type="text" name="cid" value="<%=cid%>">
<input type="submit" value="修改">
</form>

		<a	href="com.College.controller.ShowClass" target="right">返回查看</a>
</body>
