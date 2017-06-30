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

<title>文件上传</title>
<script src="<%=path%>/lib/JQuery/jquery-3.2.1.min.js"></script>
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
<body>
	<FORM action="com.College.file.FileUploadServlet" method="post"
		enctype="multipart/form-data">
		<div>
          <div class="col-lg-3">
			<input name="File" type="file" class="form-control" />
		</div>
		<div class="col-lg-3">
			 <input name="File" type="file" class="form-control" />
		</div>
		<div class="col-lg-3">
			<input name="b" type="file" class="form-control" />
		</div>
		<div class="col-lg-3">
			<input name="b" type="file" class="form-control" />
		</div>
		</div>
		<br>
		<br>
		<br>
		<input type="submit" value="多文件上传" class="btn btn-default" />
	</FORM>


	<FORM action="com.College.file.UploadServlet" method="post"
		enctype="multipart/form-data">
		<div class="col-lg-3">
		<input type="file" name="file" /> 
		</div>
		<br>
		<br>
		<input type="submit" value="单文件上传"  class="btn btn-default"/>
	</FORM>


</body>
</html>
<br>
</body>
</html>
