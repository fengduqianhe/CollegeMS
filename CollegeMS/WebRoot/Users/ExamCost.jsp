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

<title>等级考试报名</title>
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
		String Sno = (String) request.getAttribute("sno");
		System.out.println(Sno);
		int macost = (int) request.getAttribute("macost");
		System.out.println(macost);
		int encost = (int) request.getAttribute("encost");
		System.out.println(macost);
	%>
	等级考试报名
	<form action="com.College.buy.BuyMaexam">
		计算机等级考试你需要缴费
		<div class="col-lg3">
			<input type="text" value="<%=macost%>" readonly="true" name="macost"
				class="form-control">
		</div>
		<div class="col-lg3">
			请确认你的账户 <input type="text" value="<%=Sno%>" readonly="true"
				name="sno" class="form-control">
		</div>

		<input type="submit" value="支付" class="btn btn-danger">
	</form>
	<form action="com.College.buy.BuyEnexam">
		<div class="col-lg3">
			英语等级考试 你需要缴费<input type="text" value="<%=encost%>" readonly="true"
				name="encost"  class="form-control">
		</div>
		<div class="col-lg3">
		请确认你的账户 <input type="text" value="<%=Sno%>" readonly="true" name="sno" class="form-control">
		</div>
		 <input type="submit" value="支付" class="btn btn-danger">
	</form>
	<br>
</body>
</html>
