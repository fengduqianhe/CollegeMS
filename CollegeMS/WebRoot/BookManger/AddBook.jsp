<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加教材信息</title>
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
           增加教材信息 <br>
                       
   <form action="com.College.controller.AddBook">
   <div class="col-lg3">
        <input type="text" name="major" placeholder="专业" class="form-control"></div>
         <div class="col-lg3">
              <input type="text" name="name" placeholder="教材名" class="form-control"></div>
              <div class="col-lg3">
              <input type="text" name="message" placeholder="教材信息" class="form-control"></div>
              <div class="col-lg3">
              <input type="text" name="cost" placeholder="教材费用"class="form-control"></div>
             <br>
             <br>
             <input type="submit" value="增加" class="btn btn-info">
          </form>
  </body>
</html>
