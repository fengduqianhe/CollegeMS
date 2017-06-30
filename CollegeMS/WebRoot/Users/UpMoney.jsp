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

<title>充值界面</title>
<script src="<%=path%>/lib/JQuery/jquery-3.2.1.min.js"></script>
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
	<%
		String sno = (String) request.getAttribute("sno");
		String card = (String) request.getAttribute("card");
	%>
	<form action="com.College.process.UpCard">
		<div class="col-lg-3">
			请输入充值金额 <input type="text" name="cost" class="form-control">
		</div>
			<div class="col-lg-3">
		请确认你的账户  <input type="text" value="<%=sno%>" readonly="true"
			name="sno" class="form-control"> </div>
				<div class="col-lg-3">
			 账户余额 <input type="text"
			value="<%=card%>" readonly="true" name="card" class="form-control"> 
			</div>
			<input
			type="submit" value="充值" class="btn btn-info">
	</form>
</body>
</html>
