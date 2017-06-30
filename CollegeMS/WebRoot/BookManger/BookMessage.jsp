<%@page import="com.CollegeMS.bean.Book"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教材信息</title>
    
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
  	 <form method="get" action="com.College.search.SearchBook">	
  	 <div class="col-lg3">
   <input type="text" name="major" class="form-control" placeholder="专业名"></div>
    <div class="col-lg3">
      <input type="text" name="name" class="form-control" placeholder="教材名"></div>
    <input type="text" name="message" class="form-control" placeholder="教材信息"></div>
    <br>
    <br>
	<input type="submit" value="搜索" class="btn btn-success"> 
    教材信息表<br>
 <%
		/**
	     * 初始化List对象
	     * 接受值后进行强转
	     */
	    List<Book> book= (List<Book>) request.getAttribute("book");
	%>
	
	<table border="1" cellpadding="10" cellspacing="0" class="table">
		<tr class="danger">
		    <th>编号</th>
			<th>专业</th>
			<th>书名</th>
			<th>书籍信息</th>
			<th>书籍费用</th>
			<th>DELETE</th>
		</tr>
		<%
			/**
		         * 直接遍历集合
		         * 置入表格
		         */
		        for(Book fbook:book){
		%>
		<tr class="active">
		    <td><%=fbook.getId()%></td>
			<td><%=fbook.getMajor()%></td>
			<td><%=fbook.getName()%></td>
			<td><%=fbook.getMessage()%></td>
			<td><%=fbook.getCost()%></td>
			<td><a href="com.College.controller.DeleteBook?bid=<%=fbook.getId()%>">DELETE</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="BookManger/AddBook.jsp">增加</a>
</body>
</html>
