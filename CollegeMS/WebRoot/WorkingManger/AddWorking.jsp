<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加岗位信息</title>
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
               增加岗位信息 <br>
               
   <form action="com.College.controller.AddWorking">
    <div class="col-lg-3">
             <input type="text" name="job" class="form-control" placeholder="工作">
             </div>
              <div class="col-lg-3">
                <input type="text" name="place" class="form-control" placeholder="地点">
             </div>
              <div class="col-lg-3">
             <input type="text" name="salery" class="form-control" placeholder="薪水 ">
             </div>
             <input type="submit" value="增加" class="btn-info">
          </form>
          <a
			href="com.College.controller.ShowWorking" target="right">返回界面</a>
  </body>
</html>
