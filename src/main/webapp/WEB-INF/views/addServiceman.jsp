<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add servicemen</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

	<form:form action="addServiceman" method="post">

		<h1 style="text-align: center;">Add Service Man</h1>
	
		Serviceman Name:<form:input path="servicemanName" />
		<br>
		Category:<form:select path="category">
			<form:option selected="selected" value="select">-Select Here-</form:option>
			<form:option value="plumber">Plumber</form:option>
			<form:option value="electrician">Electrician</form:option>
			<form:option value="carpenter">Carpenter</form:option>
			<form:option value="painter">Painter</form:option>
			<form:option value="cleaner">Cleaner</form:option>
			<form:option value="driver">Driver</form:option>
		</form:select>
		<br>
		
		Contact Number:<form:input path="contact_No" />
		<br>
		Experience:<form:input path="exp" />
		<br>
			City:<form:input path="city" />
		<br>
					Inspection Rate:<form:input path="inspection_rate" />
		<br>
					Payment Amount:<form:input path="payment_amount" />
		<br>
					Payment Mode:<form:input path="payment_mode" />
		<br>

		<input class="btn btn-success" type="submit" value="Register">

		<!-- <button class="btn btn-info"><a href="login">Login</a></button> -->
	

	</form:form>

</body>
</html>