<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
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
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<div class="col-md-6">
			<br>
			<h2 class="centerText blue">Admin Home</h2>
			<br>

			<%-- <jsp:include page="adminHeader.jsp" />
 --%>
			<form:form action="/updateServiceMen" method="post">
				<br>
				<h4 class="centerText blue">Edit Service Men</h4>
				<br>
				<br>

				<%-- <form:input path="serviceId" type="text" hidden="hidden"
					class="form-control" />
				<form:input path="payAmount" type="text" hidden="hidden"
					class="form-control" />
				<form:input path="paymentMode" type="text" hidden="hidden"
					class="form-control" />
				<form:input path="active" type="text" hidden="hidden"
					class="form-control" /> --%>

				<div class="form-group">
					<label class="align-left">First Name:</label>
					<form:input path="sFName" class="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Last Name:</label>
					<form:input path="sLName" class="form-control" />
				</div>

				<%-- <div class="form-group">
					<label class="align-left">Mobile Number:</label>
					<form:input path="mob" class="form-control" />
				</div>
 --%>
				<div class="form-group">
					<label class="align-left">City:</label>
					<%-- <input type="text"	id="city" class="form-control" value="${city}" /> --%>
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
					<form:input path="experience" cssClass="form-control" />
				</div>

				<div class="form-group">
					<label class="align-left">Rates:</label>
					<form:input path="inspectionRate" cssClass="form-control" />
				</div>

				<input class="btn btn-success" type="submit" value="Update">
			</form:form>


		</div>
	</div>
</body>
</html>