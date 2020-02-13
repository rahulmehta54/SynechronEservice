<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix ="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="col-md-6">
	<form:form method="get" action="SearchByCategotyName">
	
	<div class="form-group">
	<label>Category</label>
		<form:select path="category" name="plan" id="plan"> 
	        <form:option value="Carpenter">Carpenter</form:option> 
	        <form:option value="Electrician" >Electrician </form:option> 
	        <form:option value="Plumbler">Plumbler</form:option> 
	        <form:option value="Driver">Driver</form:option>
    	</form:select>
	</div>
<div>
		<input type="submit" value = "Search" class="btn btn-info">
	</div>	
</form:form>	
</div>
</body>
</html>