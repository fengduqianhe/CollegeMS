<%@page import="com.CollegeMS.bean.ClassMessage"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>招生管理</title>
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
	招生管理
	<br>
	<%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<ClassMessage> classmessage= (List<ClassMessage>) request.getAttribute("classMessage");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="active">
		    <th>编号</th>
			<th>学院</th>
			<th>学院号</th>
			<th>专业</th>
			<th>专业信息</th>
			<th>专业招生人数</th>
			<th>专业号</th>
			<th>班级</th>
			<th>已有人数</th>
			<th>删除</th>
			<th>修改</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(ClassMessage classmesage:classmessage){
		%>
		<tr class="success">
		    <td><%=classmesage.getCid()%></td>
			<td><%=classmesage.getCollege()%></td>
			<td><%=classmesage.getNumcollege()%></td>
			<td><%=classmesage.getMajor()%></td>
			<td><%=classmesage.getMessage()%></td>
			<td><%=classmesage.getNumber()%></td>
			<td><%=classmesage.getNumajor()%></td>
			<td><%=classmesage.getNumclass()%></td>
			<td><%=classmesage.getNumpeople()%></td>
			<%
			 /* String numclass=new String(fclassmesage.getNumclass().getBytes("UTF-8"),"ISO-8859-1");
			  String college=new String(fclassmesage.getCollege().getBytes("UTF-8"),"ISO-8859-1");
			  String cid =new String(fclassmesage.getCid().getBytes("UTF-8"),"ISO-8859-1");*/
			 %>
			<td><a href="com.College.controller.DeletClass?cid=<%=classmesage.getCid()%>">DELETE</a>
			</td>
			<td><a href="com.College.controller.EditClassport?numclass=<%=classmesage.getMajor()%>
			&&college=<%=classmesage.getCollege()%>
			&&cid=<%=classmesage.getCid()%>">EDIT</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="RecruitManger/AddClass.jsp" class="btn btn-info btn-lg" role="button">增加</a>
	<a href="com.College.controller.ShowAnnoucent" class="btn btn-info btn-lg" role="button">招生信息</a>
</body>
</html>
