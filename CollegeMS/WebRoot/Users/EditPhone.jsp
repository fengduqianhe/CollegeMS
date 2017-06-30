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

<title>修改预留手机号</title>
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
	<form method="get" action="com.College.process.UpdatePhone">

		<%
			String phone = (String) request.getAttribute("Phone");
			String sno = (String) request.getAttribute("sno");
		%>
		<div class="col-lg-3">
			手机号<input type="text" name="phone" value="<%=phone%>"
				class="form-control">
		</div>
		<div class="col-lg-3">
			学号<input type="text" name="sno" value="<%=sno%>" readonly="true"
				class="form-control">
		</div>
		<br> <input type="submit" value="修改" class="btn btn-danger"> <br>
	</form>
</body>
</html>
