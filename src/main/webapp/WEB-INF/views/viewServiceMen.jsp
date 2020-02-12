<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Syne E-service</title>
</head>
<body>

<table class = "table table-striped table-hover table-bordered">
<thead>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Occupation</th>
	<th>City</th>
	<th>Mobile Number</th>
	<th>Basic Service Charges</th>
	<th>Action</th>
</tr>
</thead>

<tbody>	
<c:forEach items="${serviceMenList}" var = "item">
<tr>
	<td><c:out value="${item.id}"/></td>
	<td><c:out value="${item.name}"/></td>
	<td><c:out value="${item.occupation}"/></td>
	<td><c:out value="${item.city}"/></td>
	<td><c:out value="${item.mobileNo}"/></td>
	<td><c:out value="${item.serviceCharges}"/></td>
	<td><a href="editServiceMen?id=${item.id}">
         <span class="glyphicon glyphicon-pencil">Edit</span>
        </a>&nbsp;<span><a href="#">
         <span class="glyphicon glyphicon-trash">Delete</span>
        </a></span></td>
<!--  	?id=${item.id} -->
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>