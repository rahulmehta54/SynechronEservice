<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>


	<%--  <form:form action="/editServiceman" method="post"/>
  <h1 style="text-align: center;">Edit Service Man</h1>
  Serviceman Name:
	<form:input path="servicemanName" />
<%-- 		<br> Category:
<form:select path="category">
			<form:option selected="selected" value="select">-Select Here-</form:option>
			<form:option value="plumber">Plumber</form:option>
			<form:option value="electrician">Electrician</form:option>
			<form:option value="carpenter">Carpenter</form:option>
			<form:option value="painter">Painter</form:option>
			<form:option value="cleaner">Cleaner</form:option>
			<form:option value="driver">Driver</form:option>
		</form:select>
		<br> Contact Number:
	<form:input path="contact_No" />
		<br> Experience:
	<form:input path="exp" />
		<br> City:
	<form:input path="city" />
		<br> Inspection Rate:
	< path="inspection_rate" />
		<br> 

		<input  type="submit" class="btn btn-warning" 
			value="Update and Save"/> 

	<form:form/>  --%>


	<form:form action="/updateServiceman" method="post">
		<table>
            <form:input path="service_Id" hidden="hidden"/>
			<%-- <tr><td>servicemanName:</td><td><form:input path="servicemanName" /></td></tr> --%>
			Serviceman Name:
			<form:input path="servicemanName" />
			<br> Category:
			<form:select path="category">

				<form:option selected="selected" value="select">-Select Here-</form:option>
				<form:option value="plumber">Plumber</form:option>
				<form:option value="electrician">Electrician</form:option>
				<form:option value="carpenter">Carpenter</form:option>
				<form:option value="painter">Painter</form:option>
				<form:option value="cleaner">Cleaner</form:option>
				<form:option value="driver">Driver</form:option>

			</form:select>
			<br> Contact Number:
			<form:input path="contact_No" />
			<br> Experience:
			<form:input path="exp" />
			<br>
			
			City:
			<form:input path="city" />
			<br>
			
			 Inspection Rate: <form:input path="inspection_rate" />
			<br>

			<input type="submit" value="Update" id="submit"/>

		</table>
	</form:form>
</body>
</html>