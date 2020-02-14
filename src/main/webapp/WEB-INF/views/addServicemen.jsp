<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: yellow">
<div class="col-md-6">
	<form:form method="post" action="addServiceProvider">
	
	<div class="form-group">
	<label>Category</label>
		<form:select path="category" name="plan" id="plan"> 
	        <form:option value="Carpenter">Carpenter</form:option> 
	        <form:option value="Electrician" >Electrician </form:option> 
	        <form:option value="Plumbler">Plumbler</form:option> 
	        <form:option value="Driver">Driver</form:option>
    	</form:select>
	</div>
	<div class="form-group">
		<label>Povider Name</label>
		<form:input path="providerName" cssClass="form-control"/>   <!--  call setter method-->
	</div>
		
	<div class="form-group">
		<label>Mobile Number</label>
		<form:input path="mobileNumber" cssClass="form-control"/>   <!--  call setter method-->
	</div>
	
	<div class="form-group">
		<label>City</label>
		<form:input path="city" cssClass="form-control"/>   <!--  call setter method-->
	</div>
	
	<div class="form-group">
		<label>Experience</label>
		<form:input path="experience" cssClass="form-control"/>   <!--  call setter method-->
	</div>
	
	<div class="form-group">
		<label>InspectionRate</label>
		<form:input path="inspectionRate" cssClass="form-control"/>   <!--  call setter method-->
	</div>
	
	<div>
		<input type="submit" value = "Add" class="btn btn-info">
	</div>	
</form:form>
</div>
<div>
 <input type=button value="Back" onCLick="history.back()">	
 </div>
 </nav>
</body>
</html>