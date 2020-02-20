<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 
<html>

<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
      <link href="assets/assets/libs/chartist/dist/chartist.min.css" rel="stylesheet">
    <!-- Custom CSSassets/ -->
    <link href="dist/css/style.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<body>
	
<div class="ml-auto">
										<

<%-- 	<form:form method="POST" action="addSaleperson" >
 --%>	 
 <form:form   modelAttribute="endorderlist">
 	<table class="table v-middle" id="updateTable">
			<thead>
				<tr>
			
					<th>id</th>
					<th>Customer id</th>
					<th>Date</th>
					<th>Total</th>
					<th>order</th>
					
				</tr>
			</thead>
		
		<tbody class="table v-middle" id="updateTable" >
			<c:forEach items="${endorderlist}" var="order">
			
				
					<thead>
						<tr>
							
							<td><c:out value="${order.id}"></c:out></td>
							<td><c:out value="${order.customerId}"></c:out></td>
							<td><c:out value="${order.date}"></c:out></td>
							<td><c:out value="${order.total}"></c:out></td>
							<td><c:out value="${order.salesPersonList}"></c:out></td>
							
								
						</tr>
					</thead>
				

			</c:forEach>

          <%--    </form:form>
 --%>



		</tbody>
		
	</form:form>



</table>






		<script src="assets/libs/jquery/dist/jquery.min.js"></script>

		<script src="assets/libs/popper.js/dist/umd/popper.min.js"></script>
		<script src="assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
		<script src="dist/js/app-style-switcher.js"></script>

		<script src="dist/js/waves.js"></script>

		<script src="dist/js/sidebarmenu.js"></script>

		<script src="dist/js/custom.js"></script>

		<script src="assets/libs/chartist/dist/chartist.min.js"></script>
		<script
			src="assets/libs/chartist-plugin-tooltips/dist/chartist-plugin-tooltip.min.js"></script>
		<script src="dist/js/pages/dashboards/dashboard1.js"></script>
</body>
</body>
</html>