<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript">
	function myFunction() {
		// Declare variables
		var input, filter, table, tr, td, i, txtValue;
		input = document.getElementById("myInput");
		filter = input.value.toUpperCase();
		table = document.getElementById("myTable");
		tr = table.getElementsByTagName("tr");

		// Loop through all table rows, and hide those who don't match the search query
		for (i = 0; i < tr.length; i++) {
			td = tr[i].getElementsByTagName("td")[3];
			if (td) {
				txtValue = td.textContent || td.innerText;
				if (txtValue.toUpperCase().indexOf(filter) > -1) {
					tr[i].style.display = "";
				} else {
					tr[i].style.display = "none";
				}
			}
		}
	}
</script>

<script type="text/javascript">
	function myFunction1() {
		// Declare variables
		var input, filter, table, tr, td, i, txtValue;
		input = document.getElementById("myInput1");
		filter = input.value.toUpperCase();
		table = document.getElementById("myTable");
		tr = table.getElementsByTagName("tr");

		// Loop through all table rows, and hide those who don't match the search query
		for (i = 0; i < tr.length; i++) {
			td = tr[i].getElementsByTagName("td")[2];
			if (td) {
				txtValue = td.textContent || td.innerText;
				if (txtValue.toUpperCase().indexOf(filter) > -1) {
					tr[i].style.display = "";
				} else {
					tr[i].style.display = "none";
				}
			}
		}
	}
</script>

</head>
<body>

	<div class="col md-6">
		<br>
		<h2 class="centerText blue">Admin Home</h2>
		<br> <br>
		<h2 class="centerText blue">View Service Men</h2>
		<br>

		<%-- 	<jsp:include page="adminHeader.jsp" /> --%>

		<h2>ServiceMen provider</h2>

		<%-- ${allServiceMens} --%>
		<tr>
			Search By City:
			<input type="text" id="myInput" onkeyup="myFunction()"
				placeholder="Search for names..">
		</tr>
		<tr>
			Search By Category:
			<input type="text" id="myInput1" onkeyup="myFunction1()"
				placeholder="Search for names..">
		</tr>
		<table class="table table-bordered" id="myTable">
			<thead>
				<tr>
					<th>Name</th>
					<th>mob</th>
					<th>category</th>
					<th>city</th>
					<th>action</th>
				</tr>
			</thead>

			<tbody>

				<c:forEach items="${allServiceMens}" var="service">
					<tr>
						<td><c:out value="${service.sFName}" /></td>
						<td><c:out value="${service.mob}" /></td>
						<td><c:out value="${service.category}" /></td>
						<td><c:out value="${service.city}" /></td>
						<td>
						
						<a href="/edit/${service.serviceId}"><i
								class="fa fa-edit"></i></a>
								
						<a href="/delete/${service.serviceId}"><i
								class="fa fa-trash"></i></a>
								
						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>
</body>
</html>