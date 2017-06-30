<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>交易界面</title>
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
  <%
       String Sno=(String)request.getAttribute("Sno");
       System.out.println(Sno);
       int cost=(int)request.getAttribute("cost");
       System.out.println(cost);
   %>
  <body>
  <form action="com.College.buy.BuyRegister">
  <div class="col-lg3">
            你需要缴费
            <input type="text" value="<%=cost%>" readonly="true" name="cost" class="form-control">
            </div>
            <div class="col-lg3">
         请确认你的账户          <input type="text" value="<%=Sno%>" readonly="true" name="sno" class="form-control">
            </div>   
            <br>
       <input type="submit" value="支付" class="btn-info">
  </form>
                    
  </body>
</html>
