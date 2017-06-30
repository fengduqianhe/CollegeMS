<%@page import="com.CollegeMS.bean.Annoucent"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>招生信息</title>
    <link rel="stylesheet" href="<%=basePath%>/lib2/HomeCSS/layout.css" type="text/css" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body id="top">
  <%
	/**
	 * 初始化t对象
	 * 接受值后进行强转
	 */
	Annoucent annoucent = (Annoucent) request.getAttribute("annoucent");
%>
<div class="wrapper row1">
    <div id="header" class="clear">
        <div class="fl_left">
            <h1><a href="#">重庆文理学院</a></h1>
            <p>欢迎查看招生信息</p>
        </div>
        <div class="fl_right">
            <p><a href="#">A - Z Index</a> | <a href="#">学生管理</a> | <a href="#">管理员管理</a></p>
            <form action="#" method="post" id="sitesearch">
                <fieldset>
                    <legend>Site Search</legend>
                    <input type="text" value="Search Our Website&hellip;" onfocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;" />
                    <input type="image" src="WEB-INF/image/search.gif" id="search" alt="Search" />
                </fieldset>
            </form>
        </div>
        <div id="topnav">
            <ul>
                <li class="active"><a href="Users/SchoolIndex.jsp">学校概况</a></li>
                <li><a href="#">组织机构</a></li>
                <li><a href="#">师资队伍</a></li>
                <li><a href="#">人才培养</a></li>
                <li><a href="#">招生就业</a></li>
                <li><a href="#">科学研究</a></li>
                <li><a href="#">数字校园</a></li>
                <li><a href="Success.jsp">图书资源</a></li>
                <li><a href="#">校园文化</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- ####################################################################################################### -->

<div class="wrapper row2">
    <div id="hpage_featured" class="clear">
        <div id="featured_slide">
            <ul>
                <li>办学理念：学校前身重庆师范高等专科学校和渝州教育学院分别创办于1976年和1972年；2001年5月经教育部批准两校合并组建为渝西学院；2005年4月，教育部批准学校更名为重庆文理学院。

办学类型及层次：公办全日制普通本科高校。
                </li>
                <li>招生章程</li>主要类别有：普通高考生文史类、理工类、艺术类、体育类、高水平运动员（篮球）、对口高职本科。
                <li>组织机构：成立专门的招生工作领导小组，负责对学校招生工作的领导，讨论决定招生重大事宜。学校纪委、监察部门全程监督招生工作。
                </li>
                <li>招生政策：对实行“顺序志愿”填报的省（市、区），我校按考生填报的学校志愿优先的原则，按投档分数从高分到低分择优录取符合条件的上线考生；若第一志愿生源不足，则录取非第一志愿的上线考生，直至招生计划完成。对实行“平行志愿”填报的省（市、区），我校按相关省（市、区）的规定执行。
                </li>
            </ul>
        </div>
        <!-- ###### -->
        <div class="intro clear">
            <div class="welcome clear"><img class="imgl" src="#" alt="" />
                <div class="fl_right">
                    <h2>招生信息</h2><br>
                 
	  
	              <h1> <%=annoucent.getNotice()%></h1>
	             
		         <h1><%=annoucent.getTime()%></h1>
		         <h4><a href="video.html">招生视频一</a></h4><br>
                <h4><a href="video2.html">招生视频二</a></h4>
                </div>
            </div>
           
            </div>
        </div>
    </div>
</div>
<!-- ####################################################################################################### -->
</body>
</html>