<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <base href="<%=basePath%>">
    
     <title>学生登录界面</title>
     
     
    <link rel="stylesheet" href="<%=path%>/lib/bootstrap/css/bootstrap.min.css"/>
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
<script type="text/javascript">
        function login(form){
            if(form.username.value == ""){
                alert("学号不能为空！");
                return false;
            }
            if(form.password.value == ""){
                alert("密码不能为空！");
                return false;
            }
        }
    </script>
</head>

<body>
  
     <form action="com.College.controller.StudentLogin"  onSubmit="return login(this);">
       <div class="mycenter">
        <div class="mysign">
            <div class="col-lg-11 text-center text-info">
                <h2>学生登录</h2>
            </div>
            <div class="col-lg-10">
                <input type="text" class="form-control" name="Sno" placeholder="请输入账户名" required autofocus/>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="password" class="form-control" name="password" placeholder="请输入密码" required autofocus/>
            </div>
            <div class="col-lg-10 mycheckbox checkbox">
                <input type="checkbox" class="col-lg-1"> 记住密码
            </div>
            <div class="col-lg-10">
               <input type="submit" class="btn btn-success col-lg-12" value="登录">
            </div>
        </div>
    </div>
</form>
</body>
</html>
