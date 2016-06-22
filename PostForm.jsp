<%@ page contentType = "text/html" pageEncoding = "UTF-8"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import = "com.model.Type" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%    pageContext.setAttribute("typeEnum", Type.values()); %>

<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset = UTF-8">
        <title>Post Form</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-xlarge.css" />
		</noscript>
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
	
    <body style="font-family: 微軟正黑體; font-size:18px;background-color:	#FFEFD5">
	<!-- Header -->
			<header id="header"  style="background-color:#FF8800">
				<h1><strong>請填寫表單</strong></h1>
				<nav id="nav">
				<ul><li><a href="Index.do">首頁</a></li></ul>
				</nav>
			</header>
			<div >
		<form autocomplete = "on" method = "post" action = "InsertEvent.do" enctype="multipart/form-data" name = "postForm">
			<p><label>活動名稱<input name = "title" type = "text" ></label></p>
			<p>
				<label>種類
					<select name = "type">
						<c:forEach var = "type" items = "${typeEnum}">
							<option value = "${type}">${type}</option>
						</c:forEach>
					</select>
				</label>
			</p>
			<p><label>活動日期<input name = "date" type = "date" ></label></p>
			<p><label>活動時間<input name = "time" type = "time" step = "600"></label></p>
			<p><label>活動地點<input name = "location" type = "text" /></label></p>
			<p><label>活動封面<input name = "cover" type = "file" /></label></p>
			<p><label>活動簡介<input name = "preview" type = "text" placeholder="slogon about event" /></label></p>
			<p><label>活動內容<textarea name = "content"></textarea></label></p>
			<p><center><input type = "submit" value = "送出" /></center></p>
		</form></div>
    </body>
</html>