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

<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">


<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css" />

<title>E-Service</title>
</head>
<body>
	<div align="center">
		<div class="col-md-6">
			<br>
			<h2 class="centerText blue">View Cart</h2>
			<br>

			<%-- 	<jsp:include page="userHeader.jsp" />
 --%>
			<!-- <br>
			<h4 class="centerText blue">Orders Placed</h4>
			<br> <br>
 -->
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Name</th>
						<th>Mobile</th>
						<th>Category</th>
						<th>City</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>
					<%-- <div>${list}</div> --%>
					<c:forEach items="${list}" var="cart">
						<tr>
							<td><c:out value="${cart.servicemenName}" /></td>
							<td><c:out value="${cart.mob}" /></td>
							<td><c:out value="${cart.category}" /></td>
							<td><c:out value="${cart.city}" /></td>


							<td><a href="/placeOrder/${cart.cartId}"><i class="fa fa-shopping-cart"></i></a>
							</td>

							<!-- <td><button>Edit</button>
								<button>Delete</button></td> -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>