<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href = "../css/style.css" rel="stylesheet">
<link href = "images/travel.jpg" rel='icon' >
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>E- Service</title>
</head>
<body>
<%@page import= "com.example.demo.entity.Users" %>
<div align="center">
<div class="container">
<p>${success}</p>
<div class="well"><h2 style="color:#FF338A"><b>Details of User Booking</b></h2></div>
<br>
<br>
<div>
<% Users u=(Users)session.getAttribute("userSession"); %>

 <div align="center">
 <h3>All orders in Cart </h3>
<table border="1" cellpadding="5">
	<tr>
		<th><b>UserID</b></th>
		<th><b>ServiceID</b></th>
		<th><b>ServiceProviderName</b></th>
		<th><b>ServiceCatagory</b></th>
		<th><b>ServiceCity</b></th>
		<th><b>ServiceRates</b></th>
		<th><b>ServiceContactNo:</b></th>
	</tr>
	

	<tr>
	<td><%= u.getUserId()  %></td>
	
	<td>${cartInfo.sid}</td>
	<td>${cartInfo.firstName}</td>
	<td>${cartInfo.catagory}</td>
	<td>${cartInfo.city}</td>
	<td>${cartInfo.rates}</td>
	<td>${cartInfo.contactNum}</td>
	</tr>
	
</table>
<br>

<a href="#" class="btn btn-primary" role="button">Confirm-Booking</a>&nbsp;&nbsp;
<a href="deleteBooking" class="btn btn-danger" role="button">Delete-Booking</a>
</div>

</div>
</div>
</div>
</body>
</html>