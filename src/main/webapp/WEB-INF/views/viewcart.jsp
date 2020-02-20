<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="deleteSaleperson" modelAttribute="salesPersonlist">
	 <table border="1" cellspacing="0" cellpadding="0" :>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>experience</th>
				<th>Rate</th>
				<th>city</th>
				<th>mobile number</th>
				<th>Delete</th>
			</tr>
		</thead>
	</table>
	<tbody>
		<c:forEach items="${salesPersonlist}"  varStatus="status" var="vendor">
			<table>
				<thead>
					<tr>
						<td><c:out value="${ vendor.id}"></c:out></td>
						<td><c:out value="${ vendor.salePersonName}"></c:out></td>
						<td><c:out value="${ vendor.category}"></c:out></td>
						<td><c:out value="${ vendor.experience}"></c:out></td>
						<td><c:out value="${ vendor.rate}"></c:out></td>
						<td><c:out value="${ vendor.city}"></c:out></td>
						<td><c:out value="${ vendor.mobileNumber}"></c:out></td>
 			<td>	<input type="checkbox" name="check" value="${vendor.id}"></td>
 			<td><a href="editSalesPerson/${vendor.id}">Edit</a></td>  
 			 </tr>
				</thead>
			</table>

		</c:forEach>
	</tbody>
	<button type="submit" >submit</button>
	</form:form>
</body>
</html>
 --%>
 
 
 
 
 
 
 
 
 
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
	


<%-- 	<form:form method="POST" action="addSaleperson" >
 --%>	 
<form:form method="POST" action="deleteSaleperson" modelAttribute="salesPersonlist">
 	<table class="table v-middle" id="updateTable">
			<thead>
				<tr>
					<th>Name</th>
					<th>id</th>
					<th>Category</th>
					<th>Experience</th>
					<th>Rate</th>
					<th>City</th>
					<th>mobilenumber</th>
					
				</tr>
			</thead>
		
		<tbody class="table v-middle" id="updateTable" >
		 <c:set var="total" value="${0}"/>
			<c:forEach items="${salesPersonlist}"  varStatus="status" var="vendor">
			
				
					<thead>
						<tr>
							
							<td><c:out value="${vendor.salePersonName}"></c:out></td>
							<td><c:out value="${vendor.id}"></c:out></td>
							<td><c:out value="${vendor.category}"></c:out></td>
							<td><c:out value="${vendor.experience}"></c:out></td>
							<td><c:out value="${vendor.rate}"></c:out></td>
							<td><c:out value="${vendor.city}"></c:out></td>
							<td><c:out value="${vendor.mobileNumber}"></c:out></td>
							
							<c:set var="total" value="${total + vendor.rate}" />
						</tr>
					</thead>
				

			</c:forEach>

  


		</tbody>
		
		</table>
	</form:form>
	 <h1>total price=${total}</h1>









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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 