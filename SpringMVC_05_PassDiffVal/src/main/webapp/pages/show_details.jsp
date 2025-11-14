<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>

    <h2>Employee Details</h2>

    <c:if test="${not empty empList}">
        <table border="1" cellpadding="10">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Vaccinated?</th>
            </tr>

            <!-- Iterating over the employee list -->
            <c:forEach var="emp" items="${empList}">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.salary}</td>
                    <td>
                        <c:choose>
                            <c:when test="${emp.vaccinated}">Yes</c:when>
                            <c:otherwise>No</c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </c:if>

    <c:if test="${empty empList}">
        <p>No employee data available</p>
    </c:if>

</body>
</html>
