<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
        <c:forEach items="${data}" var="data">
        <tr>
            <td>${data.serviceId}</td>
            <td>${data.category}</td>
            <td>${data.providerName}</td>
            <td>${data.mobileNumber}</td>
            <td>${data.city}</td>
            <td>${data.experience}</td>
            <td>${data.inspectionRate}</td>           
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>