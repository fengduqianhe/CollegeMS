<%@page import="com.CollegeMS.bean.Working"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>修改岗位信息</title>
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
	<%
		Working working = (Working) request.getAttribute("working");
	%>
	岗位信息
	<form action="com.College.controller.UpdateWorking">
        <div class="col-lg-3">
		<input type="text" name="id" value="<%=working.getID()%>" class="form-control"> 
		</div>
		<div class="col-lg-3">
		<input type="text" name="job" value="<%=working.getJob()%>" class="form-control"> 
		</div>
		<div class="col-lg-3">
		<input type="text" name="place" value="<%=working.getPlace()%>" class="form-control">
		</div>
		<div class="col-lg-3">
		 <input type="text" name="salery"
			value="<%=working.getSalery()%>" class="form-control"> 
			</div>
			<Br><br> <input
			type="submit" value="修改" class="btn btn-success">
	</form>
	<br>
</body>
</html>
