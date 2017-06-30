<%@page import="com.CollegeMS.bean.Money"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改财务信息</title>
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
       <form method="get" action="com.College.controller.UpdateMoney">
<%
    Money money=(Money)request.getAttribute("money");
%>
<div class="col-lg-3">
编号<input type="text" name="id" value="<%=money.getMID()%>" readonly="true" class="form-control">
</div>
<div class="col-lg-3">
教材费<input type="text" name="book" value="<%=money.getBook()%>"class="form-control">
</div>
<div class="col-lg-3">
英语等级考试费用<input type="text" name="en" value="<%=money.getEnexam()%>" class="form-control">
</div>
<div class="col-lg-3">
计算机等级考试费用<input type="text" name="ma" value="<%=money.getMaExam()%>" class="form-control">
</div>
<div class="col-lg-3">
报名费<input type="text" name="register" value="<%=money.getRegister()%>" class="form-control">
</div>
<br>
<br>
<input type="submit" value="修改" class="btn btn-danger">
</form>
        <br>
        
  </body>
</html>
