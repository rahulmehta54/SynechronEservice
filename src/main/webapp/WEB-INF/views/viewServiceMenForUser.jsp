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

			<%-- <jsp:include page="userHeader.jsp" /> --%>

			<br>
			<h4 class="centerText blue">View Service Men for user</h4>
			<br>
	

			<table class="table table-hover">
				<thead>
					<tr>
						<th>Service Id</th>
						<th>Name</th>
						<th>Mobile</th>
						<th>Category</th>
						<th>City</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allServiceMens}" var="service">
						<tr>
							<td><c:out value="${service.serviceId}" /></td>
							<td><c:out value="${service.sFName}" /></td>
							<td><c:out value="${service.mob}" /></td>
							<td><c:out value="${service.category}" /></td>
							<td><c:out value="${service.city}" /></td>


							<td><a class="btn btn-warning btn-xs"
								 href="/viewCart/${service.serviceId}">Cart</a> 
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>

<!-- 
<script>
	function viewCart(id) {
		
		alert("dfdfdf");
		
		$.ajax({
			type : "GET",
			url : "/viewCart/" + id,
			success : function(data) {
				location.href = "/showCartList";
			}
			error : function(data) {
			}
		})
	}
</script> -->
</html>