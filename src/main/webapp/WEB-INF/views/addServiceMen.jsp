<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

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
			<br>
			<h2 class="centerText blue">Admin Home</h2>
			<br>

			<jsp:include page="adminHeader.jsp" />

			<form:form action="addServiceMen" method="post">
				<br>
				<h4 class="centerText blue">Add Service Men</h4>
				<br>
				<br>

				<div class="form-group">
					<label class="align-left">First Name:</label>
					<form:input path="Sfname" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Last Name:</label>
					<form:input path="Slname" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Mobile Number:</label>
					<form:input path="mob" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">City:</label>
					<form:input path="city" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Category:</label>
					<form:select path="category" cssClass="form-control">
						<form:option selected="selected" value="select">--Select--</form:option>
						<form:option value="Plumber">Plumber</form:option>
						<form:option value="Cleaner">Cleaner</form:option>
						<form:option value="Carpenter">Carpenter</form:option>
						<form:option value="Electrician">Electrician</form:option>
						<form:option value="Driver">Driver</form:option>
					</form:select>
				</div>

				<div class="form-group">
					<label class="align-left">Experience:</label>
					<form:input path="exp" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Inspection Rates:</label>
					<form:input path="insp_rate" cssClass="form-control" />
				</div>

				<input class="btn btn-success" type="submit" value="Register">
			</form:form>


		</div>
	</div>
</body>
</html>