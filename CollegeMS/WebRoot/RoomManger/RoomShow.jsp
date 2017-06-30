<%@page import="com.CollegeMS.bean.Room"%>
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

<title>宿舍管理</title>
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
	宿舍管理
	<br>
	<%
		/**
		 * 初始化List对象
		 * 接受值后进行强转
		 */
		List<Room> lroom = (List<Room>) request.getAttribute("room");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="active">
			<th>编号</th>
			<th>宿舍</th>
			<th>栋数</th>
			<th>房间数</th>
			<th>删除</th>
		   <th>修改</th>
		</tr>
		<%
			/**
			 * 直接遍历集合
			 * 置入表格
			 */
			for (Room froom : lroom) {
		%>
		<tr class="danger">
			<td><%=froom.getID()%></td>
			<td><%=froom.getFloor()%></td>
			<td><%=froom.getDorm()%></td>
			<td><%=froom.getDormNum()%></td>
			<td><a
				href="com.College.controller.DeleteRoom?id=<%=froom.getID()%>">DELETE</a>
			</td>
			<td><a
				href="#?id=<%=froom.getID()%>&&id=<%=froom.getID()%>
			  &&floor=<%=froom.getFloor()%>dorm=<%=froom.getDorm()%>&&dormnum=<%=froom.getDormNum()%>">EDIT</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="#" class="btn btn-info btn-lg" role="button">增加</a>
</body>
</html>

