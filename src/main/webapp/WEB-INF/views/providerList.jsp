<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="css/all.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"></link>
<link href="css/tooplate-style.css" rel="stylesheet" type="text/css"></link>
<link href="css/crudadminpage.css" rel="stylesheet" type="text/css"></link>
<script src="js/admincrud.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>

	<div>
		<h2>Welcome User: ${name}!!</h2>
		<h3>${succesfull}</h3>
	</div>

	<form action="/searchProvider" method="post">
		<div class="wrapper">
			<input type="text" name="service" class="input"
				placeholder="What Services are you looking for?"> <input
				type="text" class="input" placeholder="Enter the Location"
				name="location"> <input type="submit" class="searchbtn"><i
				class="fas fa-search"></i>
		</div>
	</form>


	<div class="container detaiPage" >
		
		<div class="table-wrapper">
			
		<form method="post" action="/addTocart">	
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h3>
							<b>${service}s Available in ${city} </b>
						</h3>
					</div>
					<div class="col-sm-6">
						<!-- <a href="/addEmployeeModal" class="btn btn-success"
							data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Go
								To Cart</span></a> -->
					<button type="submit" class="btn btn-success"><i class="fa fa-shopping-cart">&#xE147;</i> <span>Go
								To Cart</span></button>
					</div>
				</div>
			</div>
			
			
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>Name</th>
						<th>City</th>
						<th>Category</th>
						<th>Mobile No</th>
						<th>Rate of The Service</th>
						<th>Add to cart</th>
					</tr>
				</thead>
				<tbody>
  
					<c:forEach var="serviceProvider" items="${serviceproviderList}">
						<tr>
							<td>${ serviceProvider.firstName}</td>
							<td>${ serviceProvider.city}</td>
							<td>${ serviceProvider.category}</td>
							<td>${ serviceProvider.mobileNo}</td>
							<td>${ serviceProvider.rate}</td>
							<%-- 	<td><a href="/addTocart/${serviceProvider.serviceId}" ><i
									class="fa fa-shopping-cart" 
									 title="Add to cart" >&#xE254;</i></a></td> --%>
							<td><input type="checkbox" name="providerid"
								value="${serviceProvider.serviceId}" /></td>
						</tr>
					</c:forEach>
   
						<tr>
							<td><h3>${error}</h3></td>
						</tr>
					

				</tbody>
			</table>
		</form>
		</div>
	</div>




</body>
</html>