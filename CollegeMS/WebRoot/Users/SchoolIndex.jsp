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
 <meta charset="utf-8"/>
<title>重庆文理学院</title>
<link rel="stylesheet" href="<%=basePath%>/lib2/HomeCSS/layout.css" type="text/css" />
</head>
<body id="top">
<div class="wrapper row1">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1><a href="index.html">重庆文理学院</a></h1>
      <p>Free CSS Website Template</p>
    </div>
    <div class="fl_right">
      <p><a href="#">A - Z Index</a> | <a href="Users/Student.jsp">登录</a> | <a href="MyJsp.jsp">管理员登录</a></p>
      <form action="#" method="post" id="sitesearch">
        <fieldset>
          <legend>Site Search</legend>
          <input type="text" value="Search Our Website&hellip;" onfocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;" />
          <a href="">搜索</a>
        </fieldset>
      </form>
    </div>
    <div id="topnav">
      <ul>
        <li class="active"><a href="index.html">学校概况</a></li>
        <li><a href="style-demo.html">组织机构</a></li>
        <li><a href="full-width.html">师资队伍</a></li>
        <li><a href="3-columns.html">人才培养</a></li>
        <li><a href="gallery.html">科学研究</a></li>
        <li><a href="com.College.controller.ShowNews">招生信息</a></li>
		<li><a href="#">公共服务</a></li>
		<li><a href="#">校园文化</a></li>
      
      </ul>
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper row2">
  <div id="hpage_featured" class="clear">
    <!-- ####################################################################################################### -->
    <div id="featured_slide" class="gallery" style="visibility: visible; padding: 0px; position: relative; width: 450px; height: 412px;"><div class="panel" style="width: 430px; height: 300px; position: absolute; overflow: hidden; top: 0px; left: 0px; display: none;"><img src="<%=basePath%>/lib/image/1.jpg" style="height: 320px; width: 568.533px; position: relative; top: 0px; left: -59.2667px;"><div class="panel-overlay" style="position: absolute; z-index: 999; width: 440px; left: 0px; bottom: 0px;">
          </div><div class="overlay-background" style="position: absolute; z-index: 998; width: 450px; left: 0px; opacity: 0.7; bottom: 0px;"></div></div><div class="panel" style="width: 430px; height: 300px; position: absolute; overflow: hidden; top: 0px; left: 0px; display: none;"><img src="lib/image/2.jpg" style="height: 320px; width: 512px; position: relative; top: 0px; left: -31px;"></div><div class="panel" style="width: 430px; height: 300px; position: absolute; overflow: hidden; top: 0px; left: 0px; display: block;"><img src="/lib/image/3.jpg" style="height: 320px; width: 512px; position: relative; top: 0px; left: -31px;"><div class="panel-overlay" style="position: absolute; z-index: 999; width: 440px; left: 0px; bottom: 0px;">
          </div><div class="overlay-background" style="position: absolute; z-index: 998; width: 450px; left: 0px; opacity: 0.7; bottom: 0px;"></div></div><div class="panel" style="width: 430px; height: 300px; position: absolute; overflow: hidden; top: 0px; left: 0px; display: none;"><img src="lib/image/1.jpg" style="height: 320px; width: 533.333px; position: relative; top: 0px; left: -41.6667px;"><div class="panel-overlay" style="position: absolute; z-index: 999; width: 440px; left: 0px; bottom: 0px;">
          </div><div class="overlay-background" style="position: absolute; z-index: 998; width: 450px; left: 0px; opacity: 0.7; bottom: 0px;"></div></div><div class="strip_wrapper" style="position: absolute; overflow: hidden; top: 320px; left: 38px; width: 374px; height: 77px;"><div class="filmstrip" style="visibility: visible; margin: 0px; list-style: none; padding: 0px; width: 384px; position: absolute; z-index: 900; top: 0px; left: 0px; height: 77px;">
      <ul>
        <li class="frame" style="float: left; position: relative; height: 62px; width: 86px; z-index: 901; padding: 0px; cursor: pointer; margin-top: 15px; margin-right: 10px;"><div class="img_wrap" style="height: 47.2795px; width: 84px; position: relative; top: 6.36023px; left: 0px; overflow: hidden;"><img src="./Education Board_files/1.jpg" alt="" style="opacity: 0.3; height: 47.2795px; width: 84px; position: relative; top: 0px; left: 0px;"></div>
          
        </li>
        <li class="frame" style="float: left; position: relative; height: 62px; width: 86px; z-index: 901; padding: 0px; cursor: pointer; margin-top: 15px; margin-right: 10px;"><div class="img_wrap" style="height: 52.5px; width: 84px; position: relative; top: 3.75px; left: 0px; overflow: hidden;"><img src="./Education Board_files/2.jpg" alt="" style="opacity: 0.3; height: 52.5px; width: 84px; position: relative; top: 0px; left: 0px;"></div></li>
        <li class="frame current" style="float: left; position: relative; height: 62px; width: 86px; z-index: 901; padding: 0px; cursor: pointer; margin-top: 15px; margin-right: 10px;"><div class="img_wrap" style="height: 52.5px; width: 84px; position: relative; top: 3.75px; left: 0px; overflow: hidden;"><img src="./Education Board_files/3.jpg" alt="" style="opacity: 1; height: 52.5px; width: 84px; position: relative; top: 0px; left: 0px;"></div>
          
        </li>
        <li class="frame" style="float: left; position: relative; height: 62px; width: 86px; z-index: 901; padding: 0px; cursor: pointer; margin-top: 15px; margin-right: 10px;"><div class="img_wrap" style="height: 50.4px; width: 84px; position: relative; top: 4.8px; left: 0px; overflow: hidden;"><img src="./Education Board_files/4.jpg" alt="" style="opacity: 0.3; height: 50.4px; width: 84px; position: relative; top: 0px; left: 0px;"></div>
          
        </li>
      </ul>
    </div></div><div class="loader" style="position: absolute; z-index: 32666; opacity: 1; top: 0px; left: 0px; width: 450px; height: 412px; display: none;"></div><div class="pointer" style="position: absolute; z-index: 1000; width: 0px; font-size: 0px; line-height: 0%; border-width: 0px; border-style: solid; top: 335px; left: 273px; border-top-color: transparent; border-right-color: transparent; border-left-color: transparent;"></div><img class="nav-next" src="./Education Board_files/next.gif" style="position: absolute; cursor: pointer; top: 355px; right: 6px;"><img class="nav-prev" src="./Education Board_files/prev.gif" style="position: absolute; cursor: pointer; top: 355px; left: 6px;"></div>
    <!-- ###### -->
    <div class="intro clear">
      <div class="welcome clear"><img class="imgl" src="./Education Board_files/5.jpg" alt="">
        <div class="fl_right">
          <h2>重庆文理学院</h2>
          <p>学校是重庆区非物质文化遗产研究基地、中山大学中国非物质文化遗产研究中心重庆工作站所在地，现设有非物质文化遗产研究中心、高教研究所、高校财务经营研究所、花卉研究所、中小学发展研究所、儿童心理发展与教育研究所、巴渝文化研究所、区域经济研究所、化学应用技术研究所、数学研究所、中美文化比较研究所、信息技术研究所、民族音乐研究所、职业教育研究所、（大足）石刻艺术研究所、现代教育技术研究所、体育与健康研究所、教育法规研究所、“两课”改革与发展研究所、传媒研究所、吴芳吉研究所、（江津）四面山教学科研基地和生态园等21个科研机构，并在这些领域取得了丰硕的科研成果。</p>
        </div>
      </div>
      <div class="popular">
        <h2>公共服务</h2>
        <ul class="clear">
          <li><a href="./Education Board_files/Education Board.html">» 参观校园</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 本科课程</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 研究生课程</a></li>
          <li><a href="./Education Board_files/Education Board.html">»研究生研究</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 授课型硕士</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 国际学生</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 终身学习</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 研究生健康服务</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 毕业生住宿</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 研究生课程</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 研究生协会</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 校园生活一瞥</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 校园娱乐</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 校园安全与安全</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 课程表</a></li>
          <li><a href="./Education Board_files/Education Board.html">»比赛说明&amp;amp；目录</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 住宿学院</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 学校和学院</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 学生活动</a></li>
          <li><a href="./Education Board_files/Education Board.html">» 学生事务</a></li>
        </ul>
      </div>
    </div>
    <!-- ####################################################################################################### -->
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper row3">
  <div id="container" class="clear">
    <!-- ####################################################################################################### -->
    <div id="homepage" class="clear">
      <!-- ###### -->
      <div id="content">
        <div id="top_featured" class="clear">
          <ul class="clear">
            <li>
              <h2>课堂浏览</h2>
              <img src="./Education Board_files/6.jpg" alt="">
              <p>学校现有教职员工1200余人，其中中国工程院院士1名、高级职称人员300余人，博士、硕士600余人，外籍教师15人，外聘专家教授100余人。学校设有计算机学院、数学与财经学院、文学与传媒学院、外国语学院、材料与化工学院、林学与生命科学学院、公共管理学院、经济管理学院、电子电气工程学院、体育学院、音乐学院、美术学院、教育学院、基础学院、旅游学院、应用技术师范学院、服务外包学院等17个二级学院。
</p>
              <p class="readmore"><a href="./Education Board_files/Education Board.html">更多内容 »</a></p>
            </li>
            <li class="last">
              <h2>校园浏览</h2>
              <img src="./Education Board_files/7.jpg" alt="">
              <p>庆文理学院设有：文学与传媒学院、公共管理学院(原政法学院)、教育科学学院、经济管理学院、旅游学院、外国语学院（国际学院&lt;筹&gt;）、音乐学院、体育学院、美术学院、数学与统计学院、计算机学院、化学与环境工程学院、生命科学与技术学院、电子电气工程学院（机械工程学院&lt;筹&gt;）、应用技术师范学院、基础学院16个二级学院。
</p>
              <p class="readmore"><a href="./Education Board_files/Education Board.html">更多内容»</a></p>
            </li>
          </ul>
        </div>
        <div id="latestnews">
          <h2>校园新闻</h2>
          <ul>
            <li>
              <p><strong>重庆文理学院设有：文学与传媒学院、公共管理学院(原政法学院)、教育科学学院、经济管理学院、旅游学院、外国语学院（国际学院&lt;筹&gt;）、音乐学院、体育学院、美术学院、数学与统计学院、计算机学院、化学与环境工程学院、生命科学与技术学院、电子电气工程学院（机械工程学院&lt;筹&gt;）、应用技术师范学院、基础学院16个二级学院。
</strong><br>
                . This template is distributed using a <a href="./Education Board_files/Education Board.html">Website Template Licence</a>…</p>
              <p class="readmore"><a href="./Education Board_files/Education Board.html">阅读全文 »</a></p>
            </li>
            <li>
              <p><strong>学校关于开设汉语言文学、数学与应用数学、英语等31个全日制普通本科专业，设置职教师资本科专业方向和应用技术本科专业方向各4个、全日制专科专业20个，专业涵盖：文学、理学、工学、管理学、农学、教育学、法学七大学科门类。

</strong><br>
                   <a href="./Education Board_files/Education Board.html">Free Website Templates</a>…</p>
              <p class="readmore"><a href="./Education Board_files/Education Board.html">阅读全文 »</a></p>
            </li>
            <li class="last">
              <p><strong>学校在重庆、山东、湖南、湖北、河南、河北、四川等20多个省（区、市）招生，目前共有全日制普通本、专科在校生14000余人。学校本科毕业生平均就业率达93%以上。学校还遴选优秀本科学生到国内著名高校学习深造。2013年新增加专业：软件工程、机械电子工程 、风景园林
</strong><br>
                Vestassapede et donec ut est liberos sus et eget sed eget. Quisqueta habitur augue magnisl magna phasellus sagittitor…</p>
              <p class="readmore"><a href="./Education Board_files/Education Board.html">阅读全文 »</a></p>
            </li>
          </ul>
        </div>
        <div id="quicklinks">
          <h2>快速点击</h2>
          <ul>
            <li>
              <p><a href="./Education Board_files/Education Board.html">招生计划 <img src="./Education Board_files/8.jpg" alt=""></a></p>
            </li>
            <li>
              <p><a href="./Education Board_files/Education Board.html">投递录取信息 <img src="./Education Board_files/9.jpg" alt=""></a></p>
            </li>
            <li class="last">
              <p><a href="./Education Board_files/Education Board.html">支持我们 <img src="./Education Board_files/10.jpg" alt=""></a></p>
            </li>
          </ul>
        </div>
      </div>
      <!-- ###### -->
      <div id="column">
        <div class="holder">
          <h2>公告栏</h2>
          <!-- Begin Flash Here - This is the correct method for W3C validation -->
          <object type="application/x-shockwave-flash" data="https://www.youtube.com/v/vxAU88LxLis?version=3&hl=en_US&fs=1&rel=0" width="300" height="250">
            <param name="movie" value="https://www.youtube.com/v/vxAU88LxLis?version=3&amp;hl=en_US&amp;fs=1&amp;rel=0">
            <param name="wmode" value="opaque">
            <param name="quality" value="high">
            <param name="bgcolor" value="#E9E9E9">
            <param name="allowfullscreen" value="false">
            <param name="allowscriptaccess" value="never">
          </object>
          <!-- End Flash Here -->
          <p>
关于举办中小学教师资格证书考试专题讲座的通知

发布时间：2017-06-20 09:14 浏览：79次 来源： 

各二级学院：

根据教育部规定，自2016级开始，师范生和非师范生均须通过国家考试，方能获得教师资格证书。

为了帮助我校学生了解教师资格证书国考有关信息，继续教育学院和教学部将于6月21日（本周三）晚19:00点在知津楼三阶联合举办中小学教师资格证书考试专题讲座。请各二级学院积极组织相关学生参加讲座。

 

参加对象：全校非师范学生、2016级师范学生。

时间：6月21日（本周三）晚19:00点

地点：知津楼三阶

 

继续教育学院

教学部

      2017年6月19日
</p>
          <p class="readmore"><a href="./Education Board_files/Education Board.html">查看更多通知 »</a></p>
        </div>
        <div class="holder last">
          <h2>学生及员工代表</h2>
          <ul class="staffmembers">
            <li class="clear"><img class="imgl" src="./Education Board_files/11.jpg" alt="">
              <div class="fl_left">
                <p><strong>优优秀代表</strong></p>
                <p><a href="./Education Board_files/Education Board.html">优秀 »</a></p>
              </div>
            </li>
            <li class="clear"><img class="imgl" src="./Education Board_files/12.jpg" alt="">
              <div class="fl_left">
                <p><strong>重庆文理学院</strong></p>
                <p>全体师生</p>
                <p><a href="./Education Board_files/Education Board.html">View Full Profile »</a></p>
              </div>
            </li>
            <li class="clear"><img class="imgl" src="./Education Board_files/13.jpg" alt="">
              <div class="fl_left">
              </div>
            </li>
          </ul>
        </div>
      </div>
      <!-- ###### -->
    </div>
    <!-- ####################################################################################################### -->
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper row4">
  <div id="footer" class="clear">
    <!-- ####################################################################################################### -->
    <div class="footbox">
      <h2>快速点击</h2>
      <ul>
        
        <li><a href="./Education Board_files/Education Board.html">» 联系我们</a></li>
        <li><a href="./Education Board_files/Education Board.html">» 复制信息</a></li>
        <li><a href="./Education Board_files/Education Board.html">» 网站事项</a></li>
      </ul>
    </div>
    <div class="footbox">
      <h2>如何找到我们</h2>
      <address>
      重庆文理学院<br>
     
      Tel: xxxx xxxx xxxxxx<br>
      Email: <a href="./Education Board_files/Education Board.html">contact@domain.com</a>
      </address>
    </div>
    <div class="fl_right">
      <div id="social">
        <h2>联系我们</h2>
        <ul>
          <li><a href="./Education Board_files/Education Board.html"><img src="./Education Board_files/facebook.gif" alt=""></a></li>
          <li><a href="./Education Board_files/Education Board.html"><img src="./Education Board_files/twitter.gif" alt=""></a></li>
          <li><a href="./Education Board_files/Education Board.html"><img src="./Education Board_files/flickr.gif" alt=""></a></li>
          <li><a href="./Education Board_files/Education Board.html"><img src="./Education Board_files/youtube.gif" alt=""></a></li>
          <li class="last"><a href="./Education Board_files/Education Board.html"><img src="./Education Board_files/rss.gif" alt=""></a></li>
        </ul>
      </div>
      <div id="newsletter" class="clear">
        <form action="./Education Board_files/Education Board.html" method="post">
          <fieldset>
            <legend>Subscribe To Our Newsletter:</legend>
            <input type="text" id="subscribe" value="Submit">
          </fieldset>
        </form>
      </div>
    </div>
    <!-- ####################################################################################################### -->
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="copyright" class="clear">
    <p class="fl_left">Copyright © 2011 - All Rights Reserved - <a href="./Education Board_files/Education Board.html">Domain Name</a></p>
    <p class="fl_right">Template from <a href="http://www.cssmoban.com/" title="模板之家">网站模板</a></p>
  </div>
</div>

</body></html>