<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>

	<h2 style="text-align: center;">Place order</h2>
	<br>
	<br>
	<br>
	
	<label for="pay_mode">Chose a payment mode</label>
	<form:form action="/viewOrder" method="post">
		<input type="hidden" name="cartId" value="${cart.cartId}">
		<input type="text" name="inspectionRate" value="${cart.inspectionRate}" readonly="readonly">
		
		<select id="payMode" name="payMode">
			<option value="select">--Select--</option>
			<option value="cash">Cash</option>
			<option value="online">Online</option>
		</select>

		<br>
		<br>

		<input class="btn btn-success" type="submit" value="Make Payment">




	</form:form>
</body>
</html>