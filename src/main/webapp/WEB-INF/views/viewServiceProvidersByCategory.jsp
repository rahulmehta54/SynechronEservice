<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: yellow">
<div align="center">
    <h2>Service Providers</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Category</th>
            <th>Provider Name</th>
            <th>Provider Number</th>
            <th>City</th>
            <th>Experience</th>
            <th>Rating</th>
        </tr>
        <c:forEach items="${Servicemen}" var="Servicemen">
        <tr>
            <td>${Servicemen.serviceId}</td>
            <td>${Servicemen.category}</td>
            <td>${Servicemen.providerName}</td>
            <td>${Servicemen.mobileNumber}</td>
            <td>${Servicemen.city}</td>
            <td>${Servicemen.experience}</td>
            <td>${Servicemen.inspectionRate}</td>           
        </tr>
        </c:forEach>
    </table>
     <input type=button value="Back" onCLick="history.back()">
</div>   
</nav>
</body>
</html>