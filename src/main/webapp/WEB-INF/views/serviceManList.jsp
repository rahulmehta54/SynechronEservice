<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Tables</title>

<!-- Fontfaces CSS-->
<link href="css/font-face.css" rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
	media="all">

<!-- Vendor CSS-->
<link href="vendor/animsition/animsition.min.css" rel="stylesheet"
	media="all">
<link
	href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="vendor/wow/animate.css" rel="stylesheet" media="all">
<link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
	media="all">
<link href="vendor/slick/slick.css" rel="stylesheet" media="all">
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
	<div class="page-wrapper">
		<!-- HEADER MOBILE-->

		<!-- END HEADER MOBILE-->

		<!-- MENU SIDEBAR-->
		<jsp:include page="menu2.jsp"></jsp:include>
		<!-- END MENU SIDEBAR-->

		<!-- PAGE CONTAINER-->
		<div class="page-container">
			<!-- HEADER DESKTOP-->
			<jsp:include page="navbar2.jsp"></jsp:include>
			<!-- END HEADER DESKTOP-->

			<!-- MAIN CONTENT-->
			
			<div class="main-content">
				<div class="section__content section__content--p30">
					<div class="container-fluid">


						<div class="row">
							<div class="col-md-12">
								<!-- DATA TABLE -->
								<h3 class="title-5 m-b-35">Services List</h3>
								<div class="table-data__tool">
									<div class="table-data__tool-left"></div>
									<div class="table-data__tool-right">
									</div>
								</div>
								<div class="table-responsive table-responsive-data2">
									<table class="table table-data2" style="overflow-x:auto; ">
										<thead>
											<tr>
												<th>Name</th>
												<th>Mobile</th>
												<th>Category</th>
												<th>City</th>
												<th>Experience</th>
												<th>Min. Charges</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${serviceManList}" var="serviceMan">
												<tr class="tr-shadow">
													<td><c:out value="${serviceMan.serviceName}"></c:out></td>
													<td><c:out value="${serviceMan.mobile}"></c:out></td>
													<td><c:out value="${serviceMan.category.name}"></c:out></td>
													<td><c:out value="${serviceMan.address.city.name}"></c:out></td>
													<td><c:out value="${serviceMan.experience}"></c:out></td>
													<td><c:out value="${serviceMan.inspectionCharge}"></c:out></td> 
													<td>
														<div class="table-data-feature">

															<a href="addToCart?serviceId=${serviceMan.serviceId}">
															<button class="item" data-toggle="tooltip"
																data-placement="top" title="Add To Cart">
															    </i><i class="fa fa-shopping-cart"></i>
															</button>
															</a>
														</div>
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<!-- END DATA TABLE -->
							</div>
						</div>
					</div>
				</div>
			</div>
			
			
			
			
			
		</div>

	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="vendor/slick/slick.min.js">
		
	</script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="vendor/animsition/animsition.min.js"></script>
	<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="vendor/circle-progress/circle-progress.min.js"></script>
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="vendor/select2/select2.min.js">
		
	</script>

	<!-- Main JS-->
	<script src="js/main.js"></script>

</body>

</html>
<!-- end document-->