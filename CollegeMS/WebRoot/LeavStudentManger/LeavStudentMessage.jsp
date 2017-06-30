<%@page import="com.CollegeMS.bean.LeavStudent"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>离校登记信息表</title>
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
	离校登记信息表
	<br>
	<%
		/**
		     * 初始化List对象
		     * 接受值后进行强转
		     */
		    List<LeavStudent> lstudent= (List<LeavStudent>) request.getAttribute("leastudent");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="warning">
			<th>编号</th>
			<th>学号</th>
			<th>学生姓名</th>
			<th>学院</th>
			<th>专业</th>
			<th>操作</th>
		</tr>
		<%
			/**
				         * 直接遍历集合
				         * 置入表格
				         */
				for(LeavStudent leavstudent:lstudent){
		%>
		<tr class="active">
			<td><%=leavstudent.getId()%></td>
			<td><%=leavstudent.getSno()%></td>
			<td><%=leavstudent.getSname()%></td>
			<td><%=leavstudent.getCollege()%></td>
			<td><%=leavstudent.getMajor()%></td>
			<td><a href="com.College.process.AdmitFriend?lid=<%=leavstudent.getId()%>&&sno=<%=leavstudent.getSno()%>&&name=<%=leavstudent.getSname()%>
			&&college=<%=leavstudent.getCollege()%>&&major=<%=leavstudent.getMajor()%>">批准离校</a></td>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
