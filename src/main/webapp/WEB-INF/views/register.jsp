<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/style.css">

</head>

<div align="center">
	<div class="col-md-6">
		<form:form action="/register" method="post">
			<br>
			<h2 class="centerText blue">Register User</h2>
			<br>
			<br>

			<div class="form-group">
				<label class="align-left">Username:</label>
				<form:input path="username" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label class="align-left">Contact:</label>
				<form:input path="contact_No" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label class="align-left">Email:</label>
				<form:input path="email" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label class="align-left">Address:</label>
				<form:input path="address" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label class="align-left">User Type:</label>
				<form:input path="userType" cssClass="form-control" />
			</div>

			<div class="form-group">
				<label class="align-left">Password:</label>
				<form:input path="password" cssClass="form-control" />
			</div>


			<input class="btn btn-success registerstyle" type="submit"
				value="Register">
		</form:form>
	</div>
</div>

</html>