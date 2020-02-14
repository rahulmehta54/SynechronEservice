<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>E- Service</title>
</head>
<body>
<br>
<br>
<div>
<h3>${success}</h3>
</div>
<table border="1">
<thead>
<i><i/>

<tr>
	
</tr>
</thead>
<tbody>
<c:forEach items="${cartListbyUserId}" var="item">
<tr>
<td>
<c:out value="${item.s.sid}"/></td>
<td>
<c:out value="${item.s.firstName}"/></td>
<td>
<c:out value="${item.s.city}"/></td>
<td>
<c:out value="${item.s.catagory}"/></td>
<td>
<c:out value="${item.s.experience}"/></td>
<td>
<c:out value="${item.s.rates}"/></td>
<td>
<c:out value="${item.s.contactNum}"/></td>

<td><a href="#">Delete</a></td>
</tr>
</c:forEach>


</tbody>
</table>
</body>
</html>