<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>

<!DOCTYPE html>
<html>
	<head>
	<!--table style--->
		<style>
table {
    width:100%;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;
}
table tr:nth-child(even) {
    background-color: #eee;
}
table tr:nth-child(odd) {
   background-color:#fff;
}
table th {
    background-color: black;
    color: white;
}
</style>
	
		<meta http-equiv="Content-Type" content="text/html"; charset = "utf-8">
        <title>TOP10</title>	
	</head>
	<body>
	ArrayList<Event> list = (ArrayList<Event>)request.getAttribute("top10");
	<!-- d3.js graph--->
	
	
	<!-- table--->
	<table>
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
	out.print("<td>"+"<a href='"+event.getUrl()+"'>"+event.getTitle()+"</a>"+"</td>");
	out.print("<td>"+event.getCTR()+"</td>");
    
    <td>Smith</td>
    <td>50</td>
	out.print("</tr>");
		}
	%>
	</table>
	</body>
	
	
</html>