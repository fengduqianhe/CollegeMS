<%@page import="com.CollegeMS.bean.Working"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>勤工检学</title>
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

                 岗位表 <br>
  <br>
	<%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<Working> working= (List<Working>) request.getAttribute("working");
	%>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="success">
		    <th>编号</th>
			<th>职位</th>
			<th>地点</th>
			<th>薪水</th>
			<th>DELETE</th>
			<th>EDIT</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(Working fworking:working){
		%>
		<tr class="active">
		    <td><%=fworking.getID()%></td>
			<td><%=fworking.getJob()%></td>
			<td><%=fworking.getPlace()%></td>
			<td><%=fworking.getSalery()%></td>
	
			<td><a href="com.College.controller.DeleteWorking?HID=<%=fworking.getID()%>">DELETE</a>
			</td>
            <td><a href="com.College.controller.EditWorkingport?HID=<%=fworking.getID()%>&&place=<%=fworking.getPlace()%>&&salery=<%=fworking.getSalery()%>&&job=<%=fworking.getJob()%>">EDIT</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	
	<a href="WorkingManger/AddWorking.jsp">增加</a>
</body>
</html>
