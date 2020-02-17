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
<title>Your Cart</title>
</head>
<body>
<br>
<br>
<table class="table table-striped" border="2">
<thead><h4 align="center">your cart</h4></thead>
<tbody>
<c:forEach items="${cartValue}" var="item">
<tr>
<td>
<c:out value="${item.sp.serviceId}"/></td>
<td>
<c:out value="${item.sp.firstName}"/></td>
<td>
<c:out value="${item.sp.lastName}"/></td>
<td>
<c:out value="${item.sp.city}"/></td>
<td>
<c:out value="${item.sp.category}"/></td>
<td>
<c:out value="${item.sp.charges}"/></td>

<td><a href="#">Delete</a></td>
</tr>
</c:forEach>


</tbody>
</table>
</body>
</html>