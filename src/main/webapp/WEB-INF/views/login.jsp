<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<title>Syne E-service</title>
</head>
<body>
<div class = "container">
	<h2><b>Welcome to Syne E-service</b></h2>
	<form action="login" method="post">
	<label for = "emailId"><b>Email ID</b></label>
	<input type="email" name="emailId" placeholder="Enter the Email" required><br>
	<label for = "pwd"><b>Password</b></label>
	<input type="password" name="pwd" placeholder="Enter the Password" required><br>
	<input type="submit" value="Login">
	
	<a href = "/signUp">Don't have an account? Click here to register!</a><br><br>
	
	<p>${error}</p><br>
	
	<a href = "/adminLogin"><b>Admin Login</b></a>
	 
	</form>
</div>
</body>
</html>