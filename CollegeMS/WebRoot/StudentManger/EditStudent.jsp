<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改学生信息</title>
    <script src="<%=path%>/lib/JQuery/jquery-3.2.1.min.js"></script> 
<link rel="stylesheet" href="<%=path%>/lib/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=path%>/lib/style.css"/>
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
   <form method="get" action="com.College.controller.UpdateStudent">
<%
     String Sno=(String)request.getAttribute("Sno");
     String College=(String)request.getAttribute("College");
     String Major=(String)request.getAttribute("Major");
%>
 <div class="col-lg-3">
学生学号<input type="text" name="sno" value="<%=Sno%>" class="form-control">
</div>
<div class="col-lg-3">
学生学院<input type="text" name="college" value="<%=College%>" class="form-control">
</div>
<div class="col-lg-3">
学生专业<input type="text" name="major" value="<%=Major%>" class="form-control">
</div>
<br>
<input type="submit" value="修改" class="btn btn-danger">
</form>
  </body>
</html>
