<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>

<html>
    <head>
	    <title>Applier Form</title>
	</head>
	<body>
	<form method="GET" action="applyServlet.do">
	   <%(Event event = request.getAttribute("event");%>
	    Name:<br>
	    <input type="label" name="name"</br>
		Grade:<br>
        <input type="label" name="grade"</br>
		Number:<br>
        <input type="label" name="number"</br>
		Sex:<br>
        <input type="label" name="sex"</br>
		
		<input type="hidden" name="event"</br>
		
	<input type="sumbit" name="next" value="Sumbit">
	</form>
	</body>
</html>