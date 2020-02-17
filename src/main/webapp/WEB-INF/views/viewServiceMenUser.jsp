<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		<div class="col-md-12">
			<br>
			<h2 class="centerText blue">User Home</h2>
			<br>

			<jsp:include page="userHeader.jsp" />

			<br>

			<!-- SEARCH BY CITY AND CATEGORY -->
			<form:form action="/searchServiceMenUser" method="post">
				<div class="container-fluid">
					<div class="row">
						<div class="col-sm-6">
							<label>Enter City:</label><br>
							<form:input path="city" placeholder="Enter city"
								cssClass="form-control" />
						</div>
						<div class="col-sm-5">
							<label>Select Category:</label><br>
							<form:select path="category" cssClass="form-control">
								<form:option selected="selected" value="select">--Select--</form:option>
								<form:option value="Plumber">Plumber</form:option>
								<form:option value="Cleaner">Cleaner</form:option>
								<form:option value="Carpenter">Carpenter</form:option>
								<form:option value="Electrician">Electrician</form:option>
								<form:option value="Driver">Driver</form:option>
							</form:select>
						</div>
						<div class="input-group-prepend text-center">
							<input class="btn btn-info" type="submit" value="Search">
						</div>
					</div>
				</div>
			</form:form>

			<br>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Name</th>
						<th>Mobile</th>
						<th>Category</th>
						<th>Experience</th>
						<th>Charges</th>
						<th>City</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allServiceMens}" var="serviceMenBean">
						<tr>
							<td><c:out
									value="${serviceMenBean.sMenFName} ${serviceMenBean.sMenLName}" /></td>
							<td><c:out value="${serviceMenBean.mobile}" /></td>
							<td><c:out value="${serviceMenBean.category}" /></td>
							<td><c:out value="${serviceMenBean.experience}" /></td>
							<td><c:out value="${serviceMenBean.inspectionRates}" /></td>
							<td><c:out value="${serviceMenBean.city}" /></td>

							<td><a class="btn btn-warning btn-xs"
								href="/addToCart/${serviceMenBean.sId}">Add To Cart</a> <a
								class="btn btn-danger btn-xs"
								href="/viewOrderForm/${serviceMenBean.sId}">Order</a></td>
							<%-- href="/addOrder/${serviceMenBean.sId}">Order</a></td> --%>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>