<%@page import="com.CollegeMS.bean.NewStudent"%>
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

<title>新生数据</title>

<script src="<%=path%>/lib/JQuery/jquery-3.2.1.min.js"></script> 
<link rel="stylesheet" href="<%=path%>/lib/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=path%>/lib/style.css"/>
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
	新生数据
	<br>
	<br>
	<%
		/**
		 * 初始化List对象
		 * 接受值后进行强转
		 */
		List<NewStudent> lnewstudent = (List<NewStudent>) request.getAttribute("newstudent");
	%>
	<form method="get" action="com.College.search.SearchNewStudent">
	<div class="col-lg-3">
		<input type="text" name=search class="form-control" placeholder="姓名"><br> 
		<input type="submit"class="btn btn-default"
			value="搜索">
	</form>


	<table border="1" cellpadding="10" cellspacing="0" class="table">
	 <thead>
		<tr class="success">
			<th>编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>出生年月</th>
			<th>电话号码</th>
			<th>所报学院</th>
			<th>所报专业</th>
			<th>分数</th>
			<th>操作项</th>
		</tr>
		   </thead>
		<%
			/**
			 * 直接遍历集合
			 * 置入表格
			 */
			for (NewStudent fnewstudent : lnewstudent) {
		%>
		<tr class="active">
			<td><%=fnewstudent.getNID()%></td>
			<td><%=fnewstudent.getNName()%></td>
			<td><%=fnewstudent.getNsex()%></td>
			<td><%=fnewstudent.getNTime()%></td>
			<td><%=fnewstudent.getNPhone()%></td>
			<td><%=fnewstudent.getNCollege()%></td>
			<td><%=fnewstudent.getNMajor()%></td>
			<td><%=fnewstudent.getNScore()%></td>

			<td><a
				href="com.College.process.AdmitNewStudent?nid=<%=fnewstudent.getNID()%>">录取</a>
			</td>
			</td>
		</tr>
		<%
			}
		%>
	
</body>
</html>

