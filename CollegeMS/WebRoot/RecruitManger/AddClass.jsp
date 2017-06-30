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

<title>增加专业</title>
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
	<form action="com.College.controller.AddClass">
		学院<input type="text" name="college"><br> 专业 <input
			type="text" name="major"><br> 专业信息 <input type="text"
			name="message"><br> 招生人数 <input type="text"
			name="number"><br> 学院号<input type="text"
			name="numcollege"><br> 专业号 <input type="text"
			name="nummajor"><br> 班级号 <input type="text"
			name="numclass"><br> 班级已有人数 <input type="text"
			name="numpeople"><br> <input type="submit" value="增加">
		<br>
	</form>
	<a
			href="com.College.controller.ShowClass" target="right">返回查看</a>
</body>
</html>
