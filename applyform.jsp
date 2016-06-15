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
	    <input type="hidden" name="name"</br>
		Grade:<br>
        <input type="hidden" name="grade"</br>
		Number:<br>
        <input type="hidden" name="number"</br>
		Sex:<br>
        <input type="hidden" name="sex"</br>
		
	<input type="sumbit" name="next" value="Sumbit">
	</form>
	</body>
</html>