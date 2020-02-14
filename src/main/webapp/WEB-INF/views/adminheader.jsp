<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>E-Service</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">

		<div class="collapse navbar-collapse" id="navbarNav"></div>
		<div class="form-group">
			<a href="index" class="for-logout">Logout</a>
		</div>
	</nav>

	<div class="d-flex">
		<div class="p-2 bg-warning flex-fill">
			<a href="/viewServiceMen">View Service Men</a>
		</div>
		<div class="p-2 bg-success flex-fill">
			<a href="/addServiceMen">Add Service Men</a>
		</div>
	</div>

</body>
</html>