<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${!empty empInfo }">
		<b>Emp information::${empInfo.id},${empInfo.name},${empInfo.salary},${empInfo.isVaccinated}</b>
	</c:if>

</body>
</html>