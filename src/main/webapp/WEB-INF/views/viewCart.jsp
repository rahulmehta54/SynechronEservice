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
		<div class="col-md-6">
			<br>
			<h2 class="centerText blue">User Home</h2>
			<br>

			<jsp:include page="userHeader.jsp" />
			<br>

			<table  class="table table-hover">
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Category</th>
						<th>Mobile</th>
						<th>City</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${allCartItems}" var="allCartItemsBean">
						<tr>
							<td><c:out value="${allCartItemsBean.fName}" /></td>
							<td><c:out value="${allCartItemsBean.lName}" /></td>
							<td><c:out value="${allCartItemsBean.category}" /></td>
							<td><c:out value="${allCartItemsBean.mobile}" /></td>
							<td><c:out value="${allCartItemsBean.city}" /></td>
							<td><a class="btn btn-danger btn-xs"
								href="/cart/remove/${serviceMenBean.sId}">Remove</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>