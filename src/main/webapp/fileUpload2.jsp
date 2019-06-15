<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Apache Commons FileUpload:<br>
	<form method="POST" enctype="multipart/form-data" action="commonsfileupload">
		<input type="file" name="upfile">
        <input type="submit" value="Upload"> 
	</form>
Servlet FileUpload:<br>
		<form method="POST" enctype="multipart/form-data" action="servletfileupload">
		<input type="file" name="upfile">
        <input type="submit" value="Upload"> 
	</form>
</body>
</html>
