<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.model.*" %>

<html>
    <head>
	    <title>Applier Form</title>
	</head>
	<body>
	<form method="GET" action="applyServlet.do">
	
	    Name:<br>
	    <input type="text" name="name"</br>
		Grade:<br>
        <input type="text" name="grade"</br>
		Number:<br>
        <input type="text" name="number"</br>
		Sex:<br>
        <input type="text" name="sex"</br>
		
	<input type="sumbit" name="next" value="Sumbit">
	</form>
	</body>
</html>