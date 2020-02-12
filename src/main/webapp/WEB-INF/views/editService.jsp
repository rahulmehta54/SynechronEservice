<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
<title>E- Service</title>
</head>
<body>
<div align="center">
<h2>Edit Service</h2>
<form action="adminOperation/${spObj.sid}" method="post">
<table border="0">
	<tr>
		<td>ServiceID:</td>
		<td>${spObj.sid}</td>
	</tr>
	<tr>
		<td>FirstName:</td>
		<td><input type="text" name="firstName" value="${spObj.firstName}"></td>
		</tr>
		<tr>
		<td>City:</td>
		<td><input type="text" name="city" value="${spObj.city}"></td>
		</tr>
		<tr>
		<td>Catagory</td>
		<td><input type="text" name="catagory" value="${spObj.catagory}"></td>
		</tr>
		<tr>
		<td>No. of Exp</td>
		<td><input type="text" name="experience" value="${spObj.experience}"></td>
		</tr>
		
		<tr>
		<td>Rates</td>
		<td><input type="text" name="rates" value="${spObj.rates}"></td>
		</tr>
		
		<tr>
		<td>Contact No.</td>
		<td><input type="text" name="contactNum" value="${spObj.contactNum}"></td>
		</tr>
		<tr>
		<td>
		<input type="submit"value="save"></td>
		
</tr>
</table>


</form>
</body>
</html>