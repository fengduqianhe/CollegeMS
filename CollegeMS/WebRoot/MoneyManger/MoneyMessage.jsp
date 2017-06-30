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
    
    <title>财务管理界面</title>
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
    财务管理<br>
	<%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<Money> lmoney= (List<Money>) request.getAttribute("money");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="success">
		    <th>编号</th>
			<th>教材费</th>
			<th>英语等级考试</th>
			<th>计算机等级考试</th>
			<th>报名费</th>
			<th>EDIT</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(Money fmoney:lmoney){
		%>
		<tr class="warning">
		    <td><%=fmoney.getMID()%></td>
			<td><%=fmoney.getBook()%></td>
			<td><%=fmoney.getMaExam()%></td>
			<td><%=fmoney.getEnexam()%></td>
			<td><%=fmoney.getRegister()%></td>
			<td><a href="com.College.controller.EditMoney?id=<%=fmoney.getMID()%>&&book=<%=fmoney.getBook() %>&&en=<%=fmoney.getEnexam() %>&&ma=<%=fmoney.getMaExam()%>&&register=<%=fmoney.getRegister()%>">EDIT</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
