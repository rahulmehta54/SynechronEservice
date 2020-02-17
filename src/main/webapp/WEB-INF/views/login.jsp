<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Login</title>

<!-- <link rel="stylesheet" type="text/css" href="css/style.css"> -->

</head>
<body>


	<div align="center">

		<div class="col-md-6">

			<form:form action="login" method="post">

				<br>
				<h2 class="centerText blue">Login</h2>
				<br>
				<br>

				<div class="form-group">
					<label class="align-left">Email</label>
					<form:input path="email" class="form-control" />
				</div>
				<div class="form-group">
					<label class="align-left">Password</label>
					<form:input path="password" class="form-control" />
				</div>

				<input class="btn btn-success" type="submit" value="Login">

				<div class="form-group">
					<br> New user? <a href="register">Start here</a>
				</div>


			</form:form>

		</div>
		
	</div>


</body>
</html>