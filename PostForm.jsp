<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import = "java.util.*" %>

<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset = UTF-8">
        <title>Post Form</title>
    </head>
    <body>
		<form autocomplete = "on" method = "post" action = "InsertEvent.do">
			<p><label>���ʦW��<input type = "text" /></label></p>
			<p><label>���ʤ��<input type = "datetime" /></label></p>
			<p><label>���ʦa�I<input type = "text" /></label></p>
			<p><label>���ʤ���<input type = "text" /></label></p>
			<p><label>���ʫʭ�<input type = "url" /></label></p>
			<p><input type = "submit" value = "�e�X" /></p>
		</form>
    </body>
</html>