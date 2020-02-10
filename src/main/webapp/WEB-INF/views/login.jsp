<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>E-Service</title>
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