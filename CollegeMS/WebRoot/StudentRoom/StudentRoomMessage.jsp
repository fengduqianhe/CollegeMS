<%@page import="com.CollegeMS.bean.StudentRoom"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生宿舍信息表</title>
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
                 学生宿舍信息显示表 <br>
   <br>
	<%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<StudentRoom> studentRoom= (List<StudentRoom>) request.getAttribute("studentRoom");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="active">
		    <th>编号</th>
			<th>学号</th>
			<th>宿舍楼</th>
			<th>宿舍号</th>
			<th>EDIT</th>
		</tr class="success">
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(StudentRoom fstudentRoom:studentRoom){
		%>
		<tr>
		    <td><%=fstudentRoom.getId()%></td>
			<td><%=fstudentRoom.getSno()%></td>
			<td><%=fstudentRoom.getDorm()%></td>
			<td><%=fstudentRoom.getNumber()%></td>
		
			<td><a href="#?sno=<%=fstudentRoom.getId()%>">EDIT</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
