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
		<jsp:include page="menu.jsp"></jsp:include>
		<!-- END MENU SIDEBAR-->

		<!-- PAGE CONTAINER-->
		<div class="page-container">
			<!-- HEADER DESKTOP-->
			<jsp:include page="navbar.jsp"></jsp:include>
			<!-- END HEADER DESKTOP-->

			<!-- MAIN CONTENT-->
			<div class="main-content">
				<div class="section__content section__content--p30">
					<div class="container-fluid">


						<div class="row">
							<div class="col-md-12">
								<!-- DATA TABLE -->
								<h3 class="title-5 m-b-35">Add Service Man Here</h3>

								<form:form method="post" action="serviceMan">
									<div class="col-lg-6">
                                		<div class="card">
                                    		<div class="card-header">
                                       			<!--  Use the grid for big devices! -->
                                       
                                    		</div>
                                    <div class="card-body card-block">
                                        <%-- <form action="addServiceMan" method="post" class="form-horizontal"> --%>
                                            <div class="row form-group">
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Service Man Name</label>
                                                    <input type="text" name="serviceName" placeholder="name" class="form-control"  value="${serviceMan.serviceName}">
                                                    <form:input type="hidden" value="${serviceId}" path="serviceId"/>
                                                </div>
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Mobile</label>
                                                    <input type="text" name="mobile" placeholder="mobile" class="form-control" value="${serviceMan.mobile}">
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Email</label>
                                                    <input type="text" name="email" placeholder="email" class="form-control" value="${serviceMan.email}">
                                                </div>
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Category</label>
                                                    <select name="category.categoryId" class="form-control" >
														<c:forEach items="${categoryList}" var="category">
														<option value="${serviceMan.category.categoryId}">${serviceMan.category.name}</option>
														</c:forEach>
													</select>
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Address Line 1</label>
                                                    <input type="text" name="address.addressLine1" placeholder="address line 1" class="form-control" value="${serviceMan.address.addressLine1}">
                                                </div>
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Address Line 2</label>
                                                    <input type="text" name="address.addressLine2" placeholder="address line 2" class="form-control" value="${serviceMan.address.addressLine2}">
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">City</label>
                                                    <select name="address.city.cityId" class="form-control">
														<c:forEach items="${cityList}" var="city">
														<option value="${serviceMan.address.city.cityId}">${serviceMan.address.city.name}</option>
														</c:forEach>
													</select>
                                                </div>
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">State</label>
                                                    <select name="address.state.stateId" class="form-control">
														<c:forEach items="${stateList}" var="state">
														<option value="${serviceMan.address.state.stateId}">${serviceMan.address.state.stateName}</option>
														</c:forEach>
													</select>
                                                </div>
                                            </div>
                                            <div class="row form-group">
                                                <div class="col col-md-6">
                                                <label class="control-label mb-1">Experience</label>
                                                    <input type="text" name="experience" placeholder="experience in year" class="form-control" value="${serviceMan.experience}">
                                                </div>
                                                <div class="col col-md-6">
                                                   <label class="control-label mb-1">Minimun Charges</label>
                                                    <input type="text" name="inspectionCharge" placeholder="minimum charges in Rs" class="form-control" value="${serviceMan.inspectionCharge}">
                                                </div>
                                            </div>
                                       <%--  </form> --%>
                                    </div>
                                    <div class="card-footer">
                                        <button type="submit" class="btn btn-primary btn-sm">Action</button>
                                    </div>
                                </div>
                            </div>
								</form:form>
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
