<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>top10</title>
		<link rel="stylesheet" type="text/css" href="index.css">
	</head>
	<body>
	<div class="bubbleChart" style="background: #000000">
	<%
		ArrayList<Event> list = (ArrayList<Event>)request.getAttribute("top10");
	%>
	<!-- d3.js graph--->
	<!--title,url,value-->
	<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,600,200italic,600italic&subset=latin,vietnamese' rel='stylesheet' type='text/css'>

  <script src="http://phuonghuynh.github.io/js/bower_components/jquery/dist/jquery.min.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/d3/d3.min.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/d3-transform/src/d3-transform.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/extarray.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/misc.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/cafej/src/micro-observer.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/microplugin/src/microplugin.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/bubble-chart.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/plugins/central-click/central-click.js"></script>
  <script src="http://phuonghuynh.github.io/js/bower_components/bubble-chart/src/plugins/lines/lines.js"></script>
  <script>
    var bubbleChart = new d3.svg.BubbleChart({
    supportResponsive: true,
    //container: => use @default
    size: 600,
    //viewBoxSize: => use @default
    innerRadius: 600 / 3.5,
    //outerRadius: => use @default
    radiusMin: 50,
    //radiusMax: use @default
    //intersectDelta: use @default
    //intersectInc: use @default
    //circleColor: use @default
    data: {
      items: [
	  
        {text: "<%=list.get(0).getName()%>", count: "<%=list.get(0).getCTR()%>"},
        {text: "<%=list.get(1).getName()%>", count: "<%=list.get(1).getCTR()%>"},
        {text: "<%=list.get(2).getName()%>", count: "<%=list.get(2).getCTR()%>"},
        {text: "<%=list.get(3).getName()%>", count: "<%=list.get(3).getCTR()%>"},
        {text: "<%=list.get(4).getName()%>", count: "<%=list.get(4).getCTR()%>"},
        {text: "<%=list.get(5).getName()%>", count: "<%=list.get(5).getCTR()%>"},
        {text: "<%=list.get(6).getName()%>", count: "<%=list.get(6).getCTR()%>"},
        {text: "<%=list.get(7).getName()%>", count: "<%=list.get(7).getCTR()%>"},
        {text: "<%=list.get(8).getName()%>", count: "<%=list.get(8).getCTR()%>"},
		{text: "<%=list.get(9).getName()%>", count: "<%=list.get(9).getCTR()%>"},
		
     ],
      eval: function (item) {return item.count;},
      classed: function (item) {return item.text.split(" ").join("");}
    },
    plugins: [
      {
        name: "central-click",
        options: {
          text: "(See more detail)",
          style: {
            "font-size": "12px",
            "font-style": "italic",
            "font-family": "Source Sans Pro, sans-serif",
            //"font-weight": "700",
            "text-anchor": "middle",
            "fill": "white"
          },
          attr: {dy: "65px"},
          centralClick: function() {
            alert("Here is more details!!");
          }
        }
      },
      {
        name: "lines",
        options: {
          format: [
            {// Line #0
              textField: "count",
              classed: {count: true},
              style: {
                "font-size": "28px",
                "font-family": "Source Sans Pro, sans-serif",
                "text-anchor": "middle",
                fill: "white"
              },
              attr: {
                dy: "0px",
                x: function (d) {return d.cx;},
                y: function (d) {return d.cy;}
              }
            },
            {// Line #1
              textField: "text",
              classed: {text: true},
              style: {
                "font-size": "14px",
                "font-family": "Source Sans Pro, sans-serif",
                "text-anchor": "middle",
                fill: "white"
              },
              attr: {
                dy: "20px",
                x: function (d) {return d.cx;},
                y: function (d) {return d.cy;}
              }
            }
          ],
          centralFormat: [
            {// Line #0
              style: {"font-size": "50px"},
              attr: {}
            },
            {// Line #1
              style: {"font-size": "30px"},
              attr: {dy: "40px"}
            }
          ]
        }
      }]
  });
});
  </script>
  
   <style>
    .bubbleChart {
      min-width: 100px;
      max-width: 700px;
      height: 700px;
      margin: 0 auto;
    }
    .bubbleChart svg{
      background: #000000;
    }
  </style>
	
	</div>
	<!-- table--->
	<table align = "center">
  <tr>
    <th>排行</th>
    <th>活動名稱</th>
    <th>點擊數</th>
  </tr>
	<%
	int i =1;
		for(Event event: list){
			out.print("<tr>");
			out.print("<td>"+i+"</td>");
			i++;
			out.print("<td>"+"<a href='eventInfo.do?id="+event.getId()+"'>"+event.getName()+"</a>"+"</td>");
			out.print("<td>"+event.getCTR()+"</td>");
			out.print("</tr>");
		}
	%>
	</table>
	</body>


	</body>
</html>