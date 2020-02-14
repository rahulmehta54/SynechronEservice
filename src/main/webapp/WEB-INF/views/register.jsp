<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>E-Service</title>

</head>
<body>
	<div align="center">
		<div class="col-md-6">
			<form:form action="register" method="post">
				<br>
				<h2 class="centerText blue">Register User</h2>
				<br>
				<br>

				<div class="form-group">
					<label class="align-left">Email:</label>
					<form:input path="email" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">First Name:</label>
					<form:input path="fName" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Last Name:</label>
					<form:input path="lName" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Mobile Number:</label>
					<form:input path="mobile" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Password:</label>
					<form:input path="password" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Confirm Password:</label>
					<form:input path="cpassword" cssClass="form-control" />
				</div>

				<form:input path="userType" value="2" hidden="hidden"
					class="form-control" />
				<form:input path="active" value="1" hidden="hidden"
					class="form-control" />

				<input class="btn btn-success" type="submit" value="Register">
			</form:form>
		</div>
	</div>
</body>
</html>