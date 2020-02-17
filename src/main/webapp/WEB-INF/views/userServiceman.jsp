<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Service Men Details</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<script type="text/javascript">
	function myFunction() {
		var input, filter, table, tr, td, i, txtValue;
		input = document.getElementById("myInput");
		filter = input.value.toUpperCase();
		table = document.getElementById("myTable");
		tr = table.getElementsByTagName("tr");
		for (i = 0; i < tr.length; i++) {
			td = tr[i].getElementsByTagName("td")[1];
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
		var input, filter, table, tr, td, i, txtValue;
		input = document.getElementById("myInput1");
		filter = input.value.toUpperCase();
		table = document.getElementById("myTable");
		tr = table.getElementsByTagName("tr");
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

	<tr>

		Search By City:
		<input type="text" id="myInput" onkeyup="myFunction()"
			placeholder="Search for names.." title="Type in a name">
	</tr>


	<span>

		<tr>

			Search By Category:
			<input type="text" id="myInput1" onkeyup="myFunction1()"
				placeholder="Search for names.." title="Type in a name">
		</tr>

	</span>
	<table class="table table-bordered" id="myTable">
		<thead class="thead-dark">


			<tr>
				<th scope="col">Serviceman Name</th>
				<th scope="col">City</th>
				<th scope="col">Category</th>
				<th scope="col">Contact</th>
				<th scope="col">Experience</th>
				<th scope="col">Inspection Rate</th>
				<th scope="col">action</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${list}" var="item">
				<tr>
					<td><c:out value="${item.servicemanName}" /></td>
					<td><c:out value="${item.city}" /></td>
					<td><c:out value="${item.category}" /></td>
					<td><c:out value="${item.contact_No} " /></td>
					<td><c:out value="${item.exp} " /></td>
					<td><c:out value="${item.inspection_rate}" /></td>
					<td><a onclick="addToCart(${item.service_Id});"> <i
							class="fa fa-shopping-cart"></i></a> <%-- <a
						href="/deleteServicemanFromCart/${item.service_Id} " style="color: red">
							<i class="fa fa-trash"></i>
					</a> --%></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script type="text/javascript">
function addToCart(serviceManId)
{
	alert("ddfdfdf");
	
	$.ajax({
		type:"GET",
		url:"/addToCart/"+serviceManId,
		success:function(data){
			location.href="/showCartList";
		},error:function(data)
		{
			
		}
		
		
		
	});
	
}


</script>

</html>