<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<link href = "css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<br>
<div>
<%-- //<h3>${success}</h3> --%>
</div>
<table class="table table-striped" border="1">
<thead>
<tr>
		<th>ServiceID</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>City</th>
		<th>Category</th>
		<th>Rates</th>
		
</tr>
</thead>
<tbody>
<c:forEach items="${servList}" var="item">
<tr>
<td>
<c:out value="${item.serviceId}"/></td>
<td>
<c:out value="${item.firstName}"/></td>
<td>
<c:out value="${item.lastName}"/></td>
<td>
<c:out value="${item.city}"/></td>
<td>
<c:out value="${item.category}"/></td>
<td>
<c:out value="${item.charges}"/></td>

<%-- <td><a href="editService/${item.sid}">Edit</a></td>
<td><a href="deleteService/${item.sid}">Delete</a></td> --%>
</tr>
</c:forEach>


</tbody>
</table>
</body>
</html>