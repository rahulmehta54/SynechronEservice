<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
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
            <th>Card ID</th>
            <th>Provider ID</th>           
        </tr>
       
        <c:forEach items="${cartId}" var="cartId" >
		<tr>
        <td>${cartId.cartId}</td>
        <td>${cartId.serviceId}</td>
        <td><a href="/deleteFromCart?id=${cartId.cartId}">Delete From Cart</a></td> 
        </tr>
        </c:forEach>
        
        
    </table>
</div>   


</body>
</html>