<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>
<html>
<meta charset="UTF-8">
<head>
    <script src="https://www.amcharts.com/lib/3/amcharts.js"></script>
    <script src="https://www.amcharts.com/lib/3/pie.js"></script>
    <script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

    <script>
        var chart = AmCharts.makeChart( "chartdiv", {
        "type": "pie",
        "theme": "light",
        "dataProvider": [ {
        "sex": "Male",
        "value": ${sexRatio[0]}
        }, {
        "sex": "Female",
        "value": ${sexRatio[1]}
        }],
        "valueField": "value",
        "titleField": "sex",
        "outlineAlpha": 0.4,
        "depth3D": 15,
        "balloonText": "[[title]]<br><span style='font-size:14px'><b>[[value]]</b> ([[percents]]%)</span>",
        "angle": 30,
        "export": {
        "enabled": true
        }
        } );
    </script>
    <style>
        #chartdiv {
            width		: 100%;
            height		: 435px;
            font-size	: 11px;
        }
    </style>
</head>
<body>
<%
    Event e = (Event) request.getAttribute("event");
    out.println(e.getIntroduction());
    out.print("<img src = ImageServlet.do?ImageName=" + e.getImgPath() + "></img>");
%>
<hr size="5" align="center" noshade width="90%" color="0000ff">
<%
    int total = (int)request.getAttribute("participatants");
    out.print("reg num:" + total);
%>
<div id="chartdiv"></div>

<input type="button" value="報名" onclick="Applicantform.jsp">

<%request.setAttribute("event",e);%>
</body>
</html>  