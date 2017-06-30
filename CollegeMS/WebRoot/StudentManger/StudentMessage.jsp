<%@page import="com.CollegeMS.bean.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息</title>
    
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
	学生管理
	<br>
	<%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<Student> student= (List<Student>) request.getAttribute("student");
	%>
	 <form method="get" action="com.College.search.SearchStudent">	
	 <div class="col-lg-3">
     <input type="text" name="sno" class="form-control" placeholder="学号">
     </div>
     <br>
     <div class="col-lg-3">
   <input type="text" name="sname" class="form-control" placeholder="学生姓名">
    </div><br>
	<input type="submit" value="搜索"  class="btn btn-info"> 
	</form>
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="success">
		    <th>学号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>出生年月</th>
			<th>学院</th>
			<th>专业</th>
			<th>班级</th>
			<th>DELETE</th>
			<th>EDIT</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(Student fstudent:student){
		%>
		<tr>
		    <td><%=fstudent.getSno()%></td>
			<td><%=fstudent.getName()%></td>
			<td><%=fstudent.getSex()%></td>
			<td><%=fstudent.getStime()%></td>
			<td><%=fstudent.getCollege()%></td>
			<td><%=fstudent.getMajor()%></td>
			<td><%=fstudent.getSClass()%></td>
	
			<td><a href="com.College.controller.DeleteStudent?sno=<%=fstudent.getSno()%>">DELETE</a>
			</td>
			<td><a href="com.College.controller.EditStudentport?Sno=<%=fstudent.getSno()%>
			&&College=<%=fstudent.getCollege()%>&&Major=<%=fstudent.getMajor()%>" >EDIT</a>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
