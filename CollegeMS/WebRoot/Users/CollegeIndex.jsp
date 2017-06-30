<%@page import="com.CollegeMS.bean.Student"%>
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

<title>我的主页</title>
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
	<%
		Object message = request.getAttribute("message");
		Student student = (Student) request.getAttribute("student");
		System.out.println(student.getSno());
		System.out.println(student.getName());
	%>

	<script type="text/javascript">
              alert("<%=message%>");
	</script>

	<div class="welcome-info">
		<div>
			亲爱的同学，你好<span id="weather"></span>
		</div>
	</div>

	<script type="text/javascript">
		$('#weather')
				.leoweather(
						{
							format : '，{时段}好！，<span id="colock">现在时间是：<strong>{年}年{月}月{日}日 星期{周} {时}:{分}:{秒}</strong>，</span> <b>{城市}天气</b> {天气} {夜间气温}℃ ~ {白天气温}℃'
						});
	</script>

	<div class="page-header">
		<h1>学生首页</h1>
		<p>
			欢迎您！！
			<%=student.getName()%></p>
	</div>
	<nav class="navbar navbar-inverse nav-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">首页</a>
		</div>
		<div id="myexample">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">充值<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.process.UpMoney?sno=<%=student.getSno()%>&&money=<%=student.getCard()%>" target="right">充值一卡通</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="mye">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">修改操作<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.process.StudentEditPsd?psd=<%=student.getPasswords()%>&&sno=<%=student.getSno()%>" target="right">修改密码</a></li>
						<li class="divider"></li>
						<li><a href="com.College.process.StudentEditPhone?phone=<%=student.getSphone()%>&&sno=<%=student.getSno()%>" target="right">修改预留手机号</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my2">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">报到操作<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a  href="com.College.buy.JumpRegister?Sno=<%=student.getSno()%>" target="right">报名费缴纳</a></li>
						<li class="divider"></li>
						<li><a href="#">购买资料</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my3">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">勤工俭学<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="">岗位申请</a></li>
					</ul></li>
			</ul>
		</div>

		<div id="my5">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">等级考试报名<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.buy.JumpExam?sno=<%=student.getSno()%>" target="right">报名</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my4">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">成绩管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowClass">成绩查询</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my5">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">毕业申请<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.process.StudentLeaving?sno=<%=student.getSno()%>&&sname=<%=student.getName()%>&&scollege=<%=student.getCollege()%>&&smajor=<%=student.getMajor()%>"  target="right">申请毕业</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container-fluid">
		<div class="row">
			<div class="span2  col-xs-12 col-sm-3 col-md-2">
				学号:
				<%=student.getSno()%>  <br>
				姓名 :
				<%=student.getName()%> <br>
				性别:
				<%=student.getSex()%> <br>
				<br> <br> 出生年月:
				<%=student.getStime()%><br>
				学院 :
				<%=student.getCollege()%><br>
				专业:
				<%=student.getMajor()%><br>
				班级:
				<%=student.getSClass()%><br>
				手机号码:
				<%=student.getSphone()%><br>
				<br> <br> 一卡通余额:
				<%=student.getCard()%><br>
				<a href="com.College.process.UpMoney?sno=<%=student.getSno()%>&&money=<%=student.getCard()%>" target="right">充值</a>
			</div>
			<div class="span2  col-xs-12 col-sm-3 col-md-2">
				<iframe width="900" border="0" height="900" align="centre"
					name="right"> </iframe>
			</div>
		</div>
	</div>



	<div>

		<a
			href="com.College.process.StudentEditPhone?phone=<%=student.getSphone()%>&&sno=<%=student.getSno()%>" target="right">修改预留手机号</a>
		<a
			href="com.College.process.StudentEditPsd?psd=<%=student.getPasswords()%>&&sno=<%=student.getSno()%>" target="right">修改密码</a>
		<a href="com.College.buy.JumpRegister?Sno=<%=student.getSno()%>" target="right">报到</a>
		<a href="#?Sno=<%=student.getSno()%>" target="right">教材购买</a> <a
			href="com.College.buy.JumpExam?sno=<%=student.getSno()%>" target="right">等级考试报名</a>
		<a href="#?Sno=<%=student.getSno()%>"  target="right">勤工助学岗位申请</a> <a
			href="#?Sno=<%=student.getSno()%>" target="right">成绩查询</a> <a
			href="com.College.process.StudentLeaving?sno=<%=student.getSno()%>&&sname=<%=student.getName()%>&&scollege=<%=student.getCollege()%>&&smajor=<%=student.getMajor()%>"  target="right">申请毕业</a>
</body>
</html>