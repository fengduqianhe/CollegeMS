<%@page import="com.CollegeMS.bean.Friend"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>校友信息</title>
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
             校友信息表<br>
  <%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<Friend> lfriend= (List<Friend>) request.getAttribute("friend");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="success">
		    <th>编号</th>
			<th>校友学号</th>
			<th>校友姓名</th>
			<th>校友学院</th>
			<th>校友专业</th>
			<th>DELETE</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(Friend ffriend:lfriend){
		%>
		<tr class="active">
		    <td><%=ffriend.getFid()%></td>
			<td><%=ffriend.getFno()%></td>
			<td><%=ffriend.getFname()%></td>
			<td><%=ffriend.getFcollege()%></td>
			<td><%=ffriend.getFmajor()%></td>
			<td><a href="com.College.controller.DeleteFriend?id=<%=ffriend.getFid()%>">DELETE</a>
			</td>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
