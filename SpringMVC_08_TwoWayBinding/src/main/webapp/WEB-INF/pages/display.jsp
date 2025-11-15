<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result</title>
</head>
<body>
	<h2>Customer Registration Successful!</h2>
	
	<p><b>Customer Number</b> ${cust.cid}</p>
    <p><b>Customer Name</b> ${cust.cname}</p>
    <p><b>Customer Address</b> ${cust.cadd}</p>
    <p><b>Customer Mobile</b> ${cust.cmobile}</p>

    <br>
    <a href="./">Go to Home</a>
</body>
</html>