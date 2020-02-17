<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 
<html>
<script>
function myCity() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("updateTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[5];
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
function myCategory() {
	  // Declare variables
	  var input, filter, table, tr, td, i, txtValue;
	  input = document.getElementById("myInput1");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("updateTable");
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
										<div class="dl">
											 <span class="nav-item search-box"> <a class="nav-link waves-effect waves-dark" onkeyup="myCity()" ><i class="ti-search"></i></a>
								 		<div class="app-search position-absolute">
											<input type="text" id="myInput" class="form-control" placeholder="Search for city" onkeyup="myCity()"> <a class="srh-btn"><i class="ti-close"></i></a>
										</div>  
										</span>																													
                                   
										</div>
									</div>
<input type="text" id="myInput1" onkeyup="myCategory()" placeholder="Search for category..">

<%-- 	<form:form method="POST" action="addSaleperson" >
 --%>	 
 <form:form method="POST" action="addSalepersonTobuy" modelAttribute="salesPersonlist">
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
			<c:forEach items="${salesPersonlist}" var="vendor">
			
				
					<thead>
						<tr>
							
							<td><c:out value="${vendor.salePersonName}"></c:out></td>
							<td><c:out value="${vendor.id}"></c:out></td>
							<td><c:out value="${vendor.category}"></c:out></td>
							<td><c:out value="${vendor.experience}"></c:out></td>
							<td><c:out value="${vendor.rate}"></c:out></td>
							<td><c:out value="${vendor.city}"></c:out></td>
							<td><c:out value="${vendor.mobileNumber}"></c:out></td>
								<td>	<input type="checkbox" name="check" value="${vendor.id}"></td>
						</tr>
					</thead>
				

			</c:forEach>

          <%--    </form:form>
 --%>



		</tbody>
		<button type="submit" >add to cart</button>
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