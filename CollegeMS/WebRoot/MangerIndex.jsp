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
<script
	src="<%=path%>/lib/JQuery/jquery-3.2.1.min.js"></script> 
<link rel="stylesheet"
	href="<%=path%>/lib/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=path%>/lib/style.css" />
<script src="<%=path%>/lib/bootstrap/js/bootstrap.min.js"></script>

<title>首页</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body onload="collection()">
	<div class="page-header">
		<h1>重庆文理学院</h1>
		<p>
			欢迎你</p>
	</div>
	<script>
		$(function() {
			// 默认显示
			$(".dropdown-toggle").dropdown('toggle');
		});
	</script>
	
	<script>
	 function draw1() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>专业管理</a></li><li><a href='#'>招生信息 </a></li><li><a href='#'>招生管理</a></li></ul>";
	 }
	</script>
	<script>
	 function draw2() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>教材费用</a></li><li><a href='#'>等级考试费用</a></li></ul>";
	 }
	</script>
	<script>
	 function draw3() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>奖学金管理</a></li><li><a href='#'></a></li><li><a href='#'>处分管理</a></li></ul>";
	 }
	</script>
	<script>
	 function draw4() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>宿舍信息</a></li><li><a href='#'>学生宿舍信息</a></li></ul>";
	 }
	</script>
	<script>
	 function draw5() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>学生信息</a></li><li><a href='#'>人才培养</a></li></ul>";
	 }
	</script>
	<script>
	 function draw6() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>成绩信息</a></li></ul>";
	 }
	</script>
<script>
	 function draw7() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>岗位管理</a></li></ul>";
	 }
	</script>
	<script>
	 function draw8() { 
	   document.getElementById('menu').innerHTML="<ul class='nav nav-pills nav-stacked'> <li class='active'><a href='#'>毕业登记信息</a></li><li><a href='#'>校友信息</a></li></ul>";
	 }
	</script>
	<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">首页</a>
		</div>
		<div id="myexample">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">招生管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowClass" target="right" onclick="draw1()">专业管理</a></li>
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowAnnoucent" target="right" onclick="draw1()">招生信息</a></li>
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowNewStudent" target="right" onclick="draw1()">新生信息</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="mye">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">财务管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowBook" target="right" onclick="draw2()">教材费用</a></li>
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowMoney" target="right" onclick="draw2()">等级考试费用</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my2">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">奖惩管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowReward" target="right" onclick="draw3()">奖学金管理</a></li>
						<li class="divider"></li>
						<li><a href="#">处分管理</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my3">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">宿舍管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowRoom" target="right" onclick="draw4()">宿舍信息</a></li>
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowStudentRoom" target="right"  onclick="draw4()">学生宿舍信息</a></li>
					</ul></li>
			</ul>
		</div>

		<div id="my5">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">学生管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowStudent" target="right" onclick="draw5()">学生信息</a></li>
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowTalent" target="right"  onclick="draw5()">人才培养</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="my4">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">成绩管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowScore" target="right" onclick="draw6()">成绩信息</a></li>
						<li><a href="FileUp.jsp" target="right" onclick="draw6()">成绩录入</a></li>
					</ul></li>
			</ul>
		</div>

		<div id="my5">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">勤工俭学<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowWorking" target="right" onclick="draw7()">岗位管理</a></li>
					</ul></li>
			</ul>
		</div>
		
		<div id="my6">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">就业管理<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowLeavStudent" target="right" onclick="draw8()">毕业登记信息</a></li>
						<li class="divider"></li>
						<li><a href="com.College.controller.ShowFriend" target="right" onclick="draw8()" >校友信息</a></li>
					</ul></li>
			</ul>
		</div>

	</div>
	</nav>
	 <div class="container-fluid">
        <div class="row">
            <div id="menu" class="span2  col-xs-12 col-sm-3 col-md-2">
                <ul class="nav nav-pills nav-stacked">
                    <li class="active"><a href="#">专业管理</a></li>
                    <li><a href="#">招生信息</a></li>
                    <li><a href="#">新生信息</a></li>
                </ul>
            </div>
             <div class="span2  col-xs-12 col-sm-3 col-md-2">
                	<iframe width="900" border="0" height="900" align="centre"
		                name="right"> </iframe>
            </div>
        </div>
    </div>

 

	
	<div>

		<a href="com.College.controller.ShowMoney" target="right">财务管理</a> <a
			href="com.College.controller.ShowStudent" target="right">学生管理</a> <a
			href="com.College.controller.ShowClass" target="right">招生管理</a> <a
			href="com.College.controller.ShowBook" target="right">教材管理</a> <a
			href="com.College.controller.ShowRoom" target="right">宿舍管理</a> <a
			href="com.College.controller.ShowStudentRoom" target="right">学生宿舍管理</a>
		<a href="com.College.controller.ShowTalent" target="right">人才培养</a> <a
			href="com.College.controller.ShowNewStudent" target="right">新生信息</a>
		<a href="com.College.controller.ShowReward" target="right">奖学金管理</a> <a
			href="com.College.controller.ShowWorking" target="right">勤工俭学岗位管理</a>
		<a href="#" target="right">处分管理</a> <a
			href="com.College.controller.ShowScore" target="right">成绩录入</a> <a
			href="com.College.controller.ShowLeavStudent" target="right">学生离校管理</a>
		<a href="#" target="right">学生就业管理</a> <a
			href="com.College.controller.ShowFriend" target="right">校友管理</a>
	</div>
</body>
</html>
