<%@page import="com.CollegeMS.bean.Score"%>
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

<title>学生成绩录入表</title>
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
	学生成绩录入
	<br>
	<%
		/**
		 * 初始化List对象
		 * 接受值后进行强转
		 */
		List<Score> lscore = (List<Score>) request.getAttribute("score");
		System.out.println("ok");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="success">
			<th>编号</th>
			<th>学号</th>
			<th>姓名</th>
			<th>数学</th>
			<th>英语</th>
			<th>物理</th>
			<th>体育</th>
			<th>概率论</th>
			<th>数值计算</th>
			<th>Java</th>
			
		</tr>
		<%
			/**
			 * 直接遍历集合
			 * 置入表格
			 */
			for (Score fscore : lscore) {
		%>
		<tr class="active">
			<td><%=fscore.getId()%></td>
			<td><%=fscore.getSno()%></td>
			<td><%=fscore.getSname()%></td>
			<td><%=fscore.getMa()%></td>
			<td><%=fscore.getEn()%></td>
			<td><%=fscore.getPh()%></td>
			<td><%=fscore.getPe()%></td>
			<td><%=fscore.getCe()%></td>
			<td><%=fscore.getMe()%></td>
			<td><%=fscore.getGd()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>

