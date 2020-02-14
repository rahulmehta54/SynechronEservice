<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>srtdash - ICO Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/png"
	href="assets/images/icon/favicon.ico">
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/css/themify-icons.css">
<link rel="stylesheet" href="assets/css/metisMenu.css">
<link rel="stylesheet" href="assets/css/owl.carousel.min.css">
<link rel="stylesheet" href="assets/css/slicknav.min.css">
<!-- amchart css -->
<link rel="stylesheet"
	href="https://www.amcharts.com/lib/3/plugins/export/export.css"
	type="text/css" media="all" />
<!-- others css -->
<link rel="stylesheet" href="assets/css/typography.css">
<link rel="stylesheet" href="assets/css/default-css.css">
<link rel="stylesheet" href="assets/css/styles.css">
<link rel="stylesheet" href="assets/css/responsive.css">
<!-- modernizr css -->
<script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>

<!-- Start datatable css -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.jqueryui.min.css">

</head>

<body>

	<!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

	<!-- page container area start -->
	<div class="page-container">
		<!-- sidebar menu area start -->

		<!-- sidebar menu area end -->
		<!-- main content area start -->
		<div class=""></div>
		<!-- header area start -->
		<jsp:include page="sidebar.jsp"></jsp:include>
		<!-- header area end -->
		<!-- page title area start -->

		<!-- page title area end -->

		<div class="main-content">
			<div class="main-content-inner">

				<div class="row">


					<div class="col-12 mt-5">
						<div class="card">
							<div class="card-body">
								<h4 class="header-title">Data Table Default</h4>
								<div class="data-tables">
									<table id="dataTable" class="text-center">
										<thead class="bg-light text-capitalize">
											<tr>
												<th>id</th>
												<th>name</th>
												<th>Email id</th>
												<th>mobile Number</th>
												<th>address</th>
												<th>category</th>
												<th>Experience</th>
												<th>inspection rate</th>
												<th>update</th>
												<th>delete</th>
												
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${servicemanList}" var="serviceman">
												<tr>

													<td><c:out value="${serviceman.sid}"></c:out></td>
													<td><c:out value="${serviceman.sName}"></c:out></td>
													<td><c:out value="${serviceman.sEmail}"></c:out></td>
													<td><c:out value="${serviceman.sMobileNo}"></c:out></td>
													<td><c:out value="${serviceman.sAddress.city.cityName}"></c:out></td>
													<td><c:out value="${serviceman.sCategory.name}"></c:out></td>
													<td><c:out value="${serviceman.sExperience}"></c:out></td>
													<td><c:out value="${serviceman.inspectioncharge}"></c:out></td>
													<td><a href="updateServiceman?sid=${serviceman.sid}"><button>update</button></a></td>
													<td><a href="deleteServiceman?sid=${serviceman.sid}"><button>delete</button></a></td>

												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>

				</div>



			</div>
		</div>
	</div>

	<!-- sales report area start -->








	<!-- sales report area end -->
	<!-- overview area start -->

	<!-- overview area end -->
	<!-- market value area start -->

	<!-- market value area end -->
	<!-- row area start -->

	<!-- row area end -->

	<!-- row area start-->

	<!-- main content area end -->
	<!-- footer area start-->

	<!-- footer area end-->

	<!-- page container area end -->
	<!-- offset area start -->

	<!-- offset area end -->
	<!-- jquery latest version -->
	<script src="assets/js/vendor/jquery-2.2.4.min.js"></script>
	<!-- bootstrap 4 js -->
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/owl.carousel.min.js"></script>
	<script src="assets/js/metisMenu.min.js"></script>
	<script src="assets/js/jquery.slimscroll.min.js"></script>
	<script src="assets/js/jquery.slicknav.min.js"></script>

	<!-- start chart js -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
	<!-- start highcharts js -->
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<!-- start zingchart js -->
	<script src="https://cdn.zingchart.com/zingchart.min.js"></script>
	<script>
		zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
		ZC.LICENSE = [ "569d52cefae586f634c54f86dc99e6a9",
				"ee6b7db5b51705a13dc2339db3edaf6d" ];
	</script>
	<!-- all line chart activation -->
	<script src="assets/js/line-chart.js"></script>
	<!-- all pie chart -->
	<script src="assets/js/pie-chart.js"></script>
	<!-- others plugins -->
	<script src="assets/js/plugins.js"></script>
	<script src="assets/js/scripts.js"></script>

	<!-- Start datatable js -->
	<script
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
	<script
		src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap.min.js"></script>


	<script>
		$(document).ready(function() {
			$('#dataTable').DataTable();
		});

		function delete1(sid) {
			location.href = "/deleteServiceman/" + sid;
		}
	</script>
</body>

</html>