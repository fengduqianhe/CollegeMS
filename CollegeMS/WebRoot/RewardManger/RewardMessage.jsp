<%@page import="com.CollegeMS.bean.Reward"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>奖学金管理</title>
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
	奖学金管理
	<br>
	<%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<Reward> reward= (List<Reward>) request.getAttribute("reward");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="active">
		    <th>编号</th>
		    <th>学号</th>
			<th>姓名</th>
			<th>奖金</th>
			<th>奖项</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(Reward freward:reward){
		%>
		<tr>
		    <td><%=freward.getId()%></td>
		    <td><%=freward.getSno()%></td>
			<td><%=freward.getName()%></td>
			<td><%=freward.getMoney()%></td>
			<td><%=freward.getMessage()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="RewardManger/AddReward.jsp" class="btn btn-info btn-lg">增加</a>
</body>
</html>