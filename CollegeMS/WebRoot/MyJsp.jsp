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

<title>登录界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link
	href="<%=basePath%>/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!--font-awesome 核心ownCSS 文件-->
<link href="<%=basePath%>/lib/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<!-- 在bootstrap.min.js 之前引入 -->
<script src="<%=basePath%>/lib/JQuery/jquery-3.2.1.min.js"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script src="<%=basePath%>/lib/bootstrap/js/bootstrap.min.js"></script>
<!--jquery.validate-->
<script type="text/javascript"
	src="<%=basePath%>/lib/JS/jquery.validate.min.js"></script>
<style type="text/css">
body {
	background: url("<%=basePath%>/lib/image/name.jpg") no-repeat;
	background-size: cover;
	font-size: 16px;
}

.form {
	background: rgba(255, 255, 255, 0.2);
	width: 400px;
	margin: 100px auto;
}

#login_form {
	display: block;
}

#register_form {
	display: none;
}

.fa {
	display: inline-block;
	top: 27px;
	left: 6px;
	position: relative;
	color: #ccc;
}

input[type="text"],input[type="password"] {
	padding-left: 26px;
}

.checkbox {
	padding-left: 21px;
}
</style>
</head>

<body>
	<!--
    基础知识：
    网格系统:通过行和列布局
    行必须放在container内
    手机用col-xs-*
    平板用col-sm-*
    笔记本或普通台式电脑用col-md-*
    大型设备台式电脑用col-lg-*
    为了兼容多个设备，可以用多个col-*-*来控制；
-->
	<!--
    从案例学知识，来做一个登录，注册页面
    用到font-awesome 4.3.0；bootstrap 3.3.0；jQuery Validate
-->
	<div class="container">
		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3"
				id="login_form" action="com.College.controller.LoginServlet">
				<h3 class="form-title"></h3>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i> <input
							class="form-control required" type="text" placeholder="Username"
							name="username" autofocus="autofocus" maxlength="20" />
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="password"
							placeholder="password" name="password" maxlength="8" />
					</div>
					<div class="form-group">
						<label class="checkbox"> <input type="checkbox"
							name="remember" value="1" /> Remember me
						</label>
						<hr />
						<a href="javascript:" id="register_btn" class="">Create an
							account</a>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success pull-right"
							value="Login " />
					</div>
				</div>
			</form>
		</div>

		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3"
				id="register_form" action="com.College.controller.MangerRegister">
				<h3 class="form-title">Login to your account</h3>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i> <input
							class="form-control required" type="text" placeholder="username"
							name="username" autofocus="autofocus" />
					</div>
					<div class="form-group">
						<i class="fa fa-lock fa-lg"></i> <input
							class="form-control required" type="password"
							placeholder="Password" id="register_password" name="password" />
					</div>
					<div class="form-group">
						<i class="fa fa-check fa-lg"></i> <input
							class="form-control required" type="password"
							placeholder="Re-type Your Password" name="rpassword" />
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success pull-right"
							value="Sign Up " /> <input type="submit"
							class="btn btn-info pull-left" id="back_btn" value="Back" />
					</div>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript" src="<%=basePath%>/lib/JS/main.js"></script>
</body>
</html>