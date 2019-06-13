<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring File Upload</title>
</head>
<body>
Spring Servlet File Upload
	<form method="POST" enctype="multipart/form-data" action="springServletFileUpload">
		<input type="file" name="myfile">
        <input type="submit" value="Upload"> 
	</form>
	
Spring Commons File Upload
	<form method="POST" enctype="multipart/form-data" action="springCommonFileUpload">
		<input type="file" name="myfile">
        <input type="submit" value="Upload"> 
	</form>	
</body>
</html>
