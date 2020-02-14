<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
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
<h1 class="centerText blue">${userId}</h1>
    <h2> Booked Service Providers</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>Provider ID</th>
            <th>Category</th>
            <th>Provider Name</th>
            <th>Provider Number</th>
            <th>City</th>
            <th>Experience</th>
            <th>Rating</th>
        </tr>
        <c:forEach items="${listServicemen}" var="listServicemen">
        <tr>
            <td>${listServicemen.serviceId}</td>
            <td>${listServicemen.category}</td>
            <td>${listServicemen.providerName}</td>
            <td>${listServicemen.mobileNumber}</td>
            <td>${listServicemen.city}</td>
            <td>${listServicemen.experience}</td>
            <td>${listServicemen.inspectionRate}</td>                
        </tr>
        </c:forEach>
        <tr>
        <input type=button value="Back" onCLick="history.back()">
        </tr>
    </table>
</div>   
</nav>
</body>
</html>