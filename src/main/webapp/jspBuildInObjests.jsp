<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
    String pageClass = page.getClass().getSimpleName();
    String requestUrl = (request.getRequestURL()).toString();
    long lastAccessedTIme = session.getLastAccessedTime();
    String characterEncode = application.getResponseCharacterEncoding();
%>
</head>
<body>
    page的类：<%=pageClass%><br>
	request请求URL：<%=requestUrl%><br>
	session最近访问时间：<%=lastAccessedTIme%><br> 
	application响应字符编码：<%=characterEncode%><br>
</body>
</html>