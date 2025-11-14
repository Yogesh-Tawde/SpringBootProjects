<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Arrays" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Model Attribute data:</h1>
		<b>favColors are::<%=Arrays.toString(((String[])request.getAttribute("favColors"))) %></b><br>
		<b>nick names are::${nickNames}</b> <br>
		<b>phone numbers are::${phonenumbers}</b> <br>
		<b>idDetails are::${idDetails}</b>
</body>
</html>