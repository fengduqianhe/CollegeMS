<%@page import="com.CollegeMS.bean.Annoucent"%>
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

<title>招生信息发布</title>
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
	/**
	 * 初始化t对象
	 * 接受值后进行强转
	 */
	Annoucent annoucent = (Annoucent) request.getAttribute("annoucent");
%>
<body>
	<form action="com.College.controller.UpdateNotice">

		<div class="col-lg-3">
		    编号<input type="text" value="<%=annoucent.getId()%>"
				onlyread="true" name="id" class="form-control">
		</div>
		<div class="col-lg-3">
			招生信息<input type="text" value="<%=annoucent.getNotice()%>" onlyread="true"
				name="notice" class="form-control">
		</div>
		<div class="col-lg-3">
			招生时间<input type="text" value="<%=annoucent.getTime()%>" onlyread="true"
				name="noticetime" class="form-control"><br> 
				</div>
				<input type="submit" value="修改"
				class="btn btn-danger">
	</form>
</body>
</html>
