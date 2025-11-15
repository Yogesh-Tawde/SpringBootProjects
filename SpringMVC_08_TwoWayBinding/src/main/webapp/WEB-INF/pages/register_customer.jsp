<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<h1 style="color: blue; text-align: center;">Customer Registration Form</h1>

     <frm:form action="register" method="POST" modelAttribute="cust">
     		
     		<table border="0" bgcolor="cyan" align="center">
     			<tr>
     				<td>Customer Id::</td>
     				<td><frm:input path="cid"/></td>
     			</tr>
     			
     			<tr>
     				<td>Customer Name::</td>
     				<td><frm:input path="cname"/></td>
     			</tr>
     			
     			<tr>
     				<td>Customer Address::</td>
     				<td><frm:input path="cadd"/></td>
     			</tr>
     			
     			<tr>
     				<td>Customer Mobile::</td>
     				<td><frm:input path="cmobile"/></td>
     			</tr>
     			
     			<tr>
     				<td ><input type="submit" value="register"></td>
     				<td ><input type="reset" value="cancel"></td>
     				
     			</tr>
     			
     		</table>
     </frm:form>
</body>
</html>