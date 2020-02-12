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
	<h2><b>Admin login</b></h2>
	<div class = "container">
	<form action="adminLogin" method="post">
	<label for = "userId"><b>User ID :</b></label>
	<input type="text" name="userId" placeholder="Enter User ID" required><br>
	<label for = "pwd"><b>Password :</b></label>
	<input type="password" name="pwd" placeholder="Enter Password" required><br>
	<input type="submit" value="Login"><br><br>
	
	<p>${error}</p>
	
	</form>
</div>
</body>
</html>