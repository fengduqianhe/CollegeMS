<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<title>重庆文理学院</title>
<link rel="stylesheet" href="lib/style.css" />
<script type="text/javascript" src="lib/jQuery/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="lib/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="lib/chart/echarts.min.js"></script>

<script type="text/javascript" src="lib/JQuery/jquery.leoweather.min.js"></script>



<script type="text/javascript">
	function collection() {
		draw1();
		draw2();
		draw3();
		draw4();
		draw5();
		draw6();
		setInterval(collection, 200000);
	}
</script>



</head>
<body>

	<nav class="navbar navbar-inverse nav-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a href="#" class="navbar-brand">Library</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="welcome-info">
		<div>
			尊敬的会员<span id="weather"></span>
		</div>
	</div>

	<script type="text/javascript">
		$('#weather')
				.leoweather(
						{
							format : '，{时段}好！，<span id="colock">现在时间是：<strong>{年}年{月}月{日}日 星期{周} {时}:{分}:{秒}</strong>，</span> <b>{城市}天气</b> {天气} {夜间气温}℃ ~ {白天气温}℃'
						});
	</script>

	<div class="page-header">
		<h1>重庆文理学院图书馆即时数据</h1>
		<p>欢迎你</p>
	</div>
	<div class="page-header">
		<h1>
			您是今天第<B class="text-danger">3823</B>位读者
		</h1>
	</div>

	<div class="container">
		<div id="charts1">
			<div id="main" style="width:100%;height:300px;"></div>
			<script type="text/javascript">
					var myChart = echarts.init(document.getElementById('main'));
					

					// 模拟数据

					// 指定图表的配置项和数据
					var option = {
						title : {
							text : ''
						},
						tooltip : {},
						legend : {
							data : [ '销量' ]
						},
						xAxis : {},

						yAxis : {
							data : [ "本周到馆人数", "上月到馆人数", "本月到馆人数", "累计到馆人数" ]
						},
						series : [ {
							name : '人数',
							type : 'bar',
							data : [ 200, 800, 480, 1050 ]
						} ]
					};

					// 使用刚指定的配置项和数据显示图表。
					myChart.setOption(option);
			</script>
		</div>
		<div id="charts2">
			<div id="main1" style="width:100%;height:200px;"></div>
			<script type="text/javascript">
					var myChart = echarts
							.init(document.getElementById('main1'));

					//模拟数据
					var option = {
						title : {
							text : '南丁格尔玫瑰图----QHZ',
							subtext : '纯属虚构',
							x : 'center'
						},
						tooltip : {
							trigger : 'item',
							formatter : "{a} <br/>{b} : {c} ({d}%)"
						},
						legend : {
							x : 'center',
							y : 'bottom',
							data : [ 'rose1', 'rose2', 'rose3', 'rose4',
									'rose5', 'rose6', 'rose7', 'rose8' ]
						},
						toolbox : {
							show : true,
							feature : {
								mark : {
									show : true
								},
								dataView : {
									show : true,
									readOnly : false
								},
								magicType : {
									show : true,
									type : [ 'pie', 'funnel' ]
								},
								restore : {
									show : true
								},
								saveAsImage : {
									show : true
								}
							}
						},
						calculable : true,
						series : [ {
							name : '半径模式',
							type : 'pie',
							radius : [ 20, 110 ],
							center : [ '25%', '50%' ],
							roseType : 'radius',
							label : {
								normal : {
									show : false
								},
								emphasis : {
									show : true
								}
							},
							lableLine : {
								normal : {
									show : false
								},
								emphasis : {
									show : true
								}
							},
							data : [ {
								value : 10,
								name : 'rose1'
							}, {
								value : 5,
								name : 'rose2'
							}, {
								value : 15,
								name : 'rose3'
							}, {
								value : 25,
								name : 'rose4'
							}, {
								value : 20,
								name : 'rose5'
							}, {
								value : 35,
								name : 'rose6'
							}, {
								value : 30,
								name : 'rose7'
							}, {
								value : 40,
								name : 'rose8'
							} ]
						}, {
							name : '面积模式',
							type : 'pie',
							radius : [ 30, 110 ],
							center : [ '75%', '50%' ],
							roseType : 'area',
							data : [ {
								value : 10,
								name : 'rose1'
							}, {
								value : 5,
								name : 'rose2'
							}, {
								value : 15,
								name : 'rose3'
							}, {
								value : 25,
								name : 'rose4'
							}, {
								value : 20,
								name : 'rose5'
							}, {
								value : 35,
								name : 'rose6'
							}, {
								value : 30,
								name : 'rose7'
							}, {
								value : 40,
								name : 'rose8'
							} ]
						} ]
					};
					// 使用刚指定的配置项和数据显示图表。
					myChart.setOption(option);
			</script>
		</div>
	</div>
	<div id="message">
		<h3 class="text-warning">入馆指南</h3>
		<ol>
			<li>首都图书馆接待年满13岁（含）以上读者，少年儿童图书馆接待18岁以下的未成年读者和教师。</li>
			<li>建议将随身携带的书包及其他物品寄存在存包处，贵重物品请随身携带。</li>
			<li>请注意仪表着装，衣冠不整者谢绝入馆。</li>
			<li>阅览区域内请保持安静，并将手机置于静音状态。</li>
			<li>B座仅提供18岁（含）以上读者的电子阅览服务。</li>
			<li>请爱护馆内文献和一切公共财产，损坏须按规定赔偿。</li>
			<li>请维护环境卫生，保持整洁。</li>
			<li>请勿携带宠物入馆。</li>
			<li>请勿在阅览区内餐饮。</li>
			<li>馆内严禁吸烟和使用明火，勿带易燃、易爆品入馆。</li>
			<li>除特别批准外，阅览区内禁止照相、摄影。</li>
			<li>请自觉遵守公共秩序和首都图书馆各项管理规定，服从工作人员管理。</li>
		</ol>
	</div>
	<div id="people">
		<ul class="list-inline">
			<li>入馆人数</li>
			<li>出馆人数</li>
			<li>在馆人数</li>
		</ul>
	</div>

	<div id="charts3">
		<div id="main3" style="width:50%;height:200px;"></div>
		<script type="text/javascript">
				var myChart = echarts.init(document.getElementById('main3'));

				//模拟数据
				var option = {
					title : {
						text : '图书馆借阅次数排行'
					},
					tooltip : {
						trigger : 'axis'
					},

					toolbox : {
						feature : {
							saveAsImage : {}
						}
					},
					grid : {
						left : '3%',
						right : '4%',
						bottom : '3%',
						containLabel : true
					},
					xAxis : [ {
						type : 'category',
						boundaryGap : false,
						data : [ 'java', 'C++', 'C#', 'JQuery', 'ASP',
								'Python', 'JS' ]
					} ],
					yAxis : [ {
						type : 'value'
					} ],
					series : [ {
						name : '邮件营销',
						type : 'line',
						stack : '总量',
						areaStyle : {
							normal : {}
						},
						label : {
							normal : {
								show : true,
								position : 'inside'
							}
						},
						data : [ 120, 132, 101, 134, 90, 230, 100 ]
					} ]
				};

				// 使用刚指定的配置项和数据显示图表。
				myChart.setOption(option);
		</script>
	</div>
	<div id="charts4">
		<div id="main4" style="width:50%;height:200px;"></div>
		<script type="text/javascript">
	
				var myChart = echarts.init(document.getElementById('main4'));

				//模拟数据
				var option = {

					backgroundColor : '#f7f8fa',
					//    color: ['#dd4444', '#fec42c', '#80F1BE'],

					title : {
						text : '实时出入馆数据',
						left : 'center',
						textStyle : {
							color : '#6c6c6c'
						}
					},
					tooltip : {
						trigger : 'axis'
					},
					legend : {
						//        orient: 'vertical',
						//        left: 'left',
						top : '10%',
						data : [ '到馆人数', '出馆人数', '在馆人数' ]
					},
					grid : {
						left : '3%',
						right : '4%',
						bottom : '3%',
						containLabel : true
					},
					toolbox : {
						feature : {
							saveAsImage : {}
						}
					},
					xAxis : {
						type : 'category',
						boundaryGap : false,
						data : [ '周一', '周二', '周三', '周四', '周五', '周六', '周日' ]
					},
					yAxis : {
						type : 'value'
					},
					series : [ {
						name : '到馆人数',
						type : 'line',
						smooth : true,
						symbolSize : 8,
						symbol : 'circle',
						//            stack: '总量',
						data : [ 120, 132, 101, 134, 90, 230, 210 ]
					}, {
						name : '出馆人数',
						type : 'line',
						//            stack: '总量',
						data : [ 220, 182, 191, 234, 290, 330, 310 ]
					}, {
						name : '在馆人数',
						type : 'line',
						//            stack: '总量',
						data : [ 150, 232, 201, 154, 190, 330, 410 ]
					} ]
				};
				// 使用刚指定的配置项和数据显示图表。
				myChart.setOption(option);
		</script>
	</div>


	<div style="width:500px">
		<div style="float:left;width:200px">
			<div id="charts5">
				<div id="main5" style="width:100%;height:200px;"></div>
				<script type="text/javascript">
						var myChart = echarts.init(document
								.getElementById('main5'));

						//模拟数据
						var option = {
							tooltip : {
								formatter : "{a} <br/>{b} : {c}%"
							},
							series : [ {
								name : '指标',
								type : 'gauge',
								axisLine : {
									show : true,
									lineStyle : {
										width : 30,
										shadowBlur : 0,
										color : [ [ 0.2, '#90ee90' ],
												[ 0.4, '#ffa500' ],
												[ 0.6, '#87ceeb' ],
												[ 0.8, '#87ceeb' ],
												[ 1, '#ff4500' ] ]
									}
								},
								startAngle : 140,
								endAngle : -140,
								axisTick : {
									splitNumber : 5
								},
								detail : {
									formatter : '{value}%',
									textStyle : {
										fontSize : 2,
										fontWeight : ""
									}
								},
								data : [ {
									value : 4.46,
									name : '仪表盘'
								} ]
							} ]
						};
						// 使用刚指定的配置项和数据显示图表。
						myChart.setOption(option);
					
				</script>
			</div>
		</div>

		<div style="float:left;width:200px">
			<div id="charts6">
				<div id="main6" style="width:100%;height:200px;"></div>
				<script type="text/javascript">
						var myChart = echarts.init(document
								.getElementById('main6'));

						//模拟数据
						var option = {
							tooltip : {
								formatter : "{a} <br/>{b} : {c}%"
							},
							series : [ {
								name : '指标',
								type : 'gauge',
								axisLine : {
									show : true,
									lineStyle : {
										width : 30,
										shadowBlur : 0,
										color : [ [ 0.2, '#90ee90' ],
												[ 0.4, '#ffa500' ],
												[ 0.6, '#87ceeb' ],
												[ 0.8, '#87ceeb' ],
												[ 1, '#ff4500' ] ]
									}
								},
								startAngle : 140,
								endAngle : -140,
								axisTick : {
									splitNumber : 5
								},
								detail : {
									formatter : '{value}%',
									textStyle : {
										fontSize : 2,
										fontWeight : ""
									}
								},
								data : [ {
									value : 4.46,
									name : '仪表盘'
								} ]
							} ]
						};
						// 使用刚指定的配置项和数据显示图表。
						myChart.setOption(option);
					
				</script>
			</div>
		</div>
	</div>
</body>
</html>


