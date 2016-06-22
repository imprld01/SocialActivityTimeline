﻿<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import = "java.util.*" %>

<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset = UTF-8">
        <title>活動報名</title>
		
		<script src="//cdn.tinymce.com/4/tinymce.min.js"></script>
		<script>
			tinymce.init(
				{
					selector: 'textarea',
					height: 500,
					plugins: [
						'advlist autolink lists link image charmap print preview anchor',
						'searchreplace visualblocks code fullscreen',
						'insertdatetime media table contextmenu paste code'
					],
					toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image',
					content_css: [
						'//fast.fonts.net/cssapi/e6dc9b99-64fe-4292-ad98-6974f93cd2a2.css',
						'//www.tinymce.com/css/codepen.min.css'
					]
				}
			);
		</script>
    </head>
    <body>
		<form name = "postForm" method = "post" action = "InsertEvent.do" enctype = "multipart/form-data" autocomplete = "on" >
			<p><label>活動名稱: <input name = "title" type = "text" required /></label></p>
			<p><label>活動類型: <select name = "type" required>
				<option value = "">-</option>
				<option value = "sport">運動比賽</option>
				<option value = "music">音樂藝術</option>
				<option value = "free">休閒娛樂</option>
				<option value = "work">升學就業</option>
			</select></label></p>
			<p><label>活動日期: <input name = "date" type = "date" required /></label></p>
			<p><label>活動時間: <input name = "time" type = "time" step = "600" required /></label></p>
			<p><label>活動地點: <input name = "location" type = "text" required /></label></p>
			<p><label>活動封面: <input name = "cover" type = "file" required /></label></p>
			<p><label>活動內容: <textarea name = "content"></textarea></label></p>
			<p><input type = "submit" value = "提交" /></p>
		</form>
    </body>
</html>