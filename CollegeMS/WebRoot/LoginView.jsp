<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <!--判断是否为空-->
    <script type="text/javascript">
        function login(form){
            if(form.username.value == ""){
                alert("用户不能为空！");
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
    <form method="post" action="com.College.controller.LoginServlet" onSubmit="return login(this);">
        用户名：<input type="text" name="username" ><br>
        密码：<input type="password" name="password" ><br>
        登录角色：<select value="role">
        <option value="普通用户" selected>普通用户</option>
        <option value="管理员">管理员</option>
    </select>
        <br>
        <input type="submit" value="登录">
        <input type="reset"  value="重置">
        <a href="Register.jsp">注册</a>
    </form>



</body>
</html>
