<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>AdminLTE 3 | Dashboard</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Tempusdominus Bbootstrap 4 -->
<link rel="stylesheet"
	href="plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
<!-- iCheck -->
<link rel="stylesheet"
	href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- JQVMap -->
<link rel="stylesheet" href="plugins/jqvmap/jqvmap.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="dist/css/adminlte.min.css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="plugins/daterangepicker/daterangepicker.css">

<link rel="stylesheet"
	href="plugins/datatables-bs4/css/dataTables.bootstrap4.css">

<!-- summernote -->
<link rel="stylesheet" href="plugins/summernote/summernote-bs4.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">



		<!-- Main Sidebar Container -->
		<jsp:include page="headerSidebar.jsp"></jsp:include>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->

			<!-- /.content-header -->

			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<!-- Small boxes (Stat box) -->

					<!-- /.row -->
					<!-- Main row -->
					<div class="row">

						<!-- right col (We are only adding the ID to make the widgets sortable)-->
						<section class="col-lg-12 connectedSortable">
							<br>
							<div class="card">
								<div class="card-header">

									<div class="row">
										<input type="hidden" id="errorMessageStatus"
											value="<c:out value="${errorMessage}" />"> <input
											type="hidden" id="refresh"
											value="<c:out value="${refresh}" />">
										<div class="col-md-5">
											<button class="btn pull-left"
												style="background-color: #007bff; color: white;"
												id="serviceProviderList">Service Provider List</button>
										</div>
										<div class="col-md-3">
											<h5>Service Provider</h5>
										</div>
										<div class="col-md-1"></div>
										<div class="col-md-3">
											<c:if test="${adminStatus==1}">
												<button class="btn pull-right"
													style="background-color: #007bff; color: white;"
													id="addServiceProvider">Add Service Provider</button>
											</c:if>
										</div>
									</div>


								</div>
								<!-- /.card-header -->





							</div>

							<div class="card card-body" id="tableDiv">
								<table id="example1" class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>Id</th>
											<th>Name</th>
											<th>Mobile Number</th>
											<th>Email Id</th>
											<th>Category</th>
											<th>City</th>
											<th>Experience</th>
											<th>Inspection Rate</th>
											<c:if test="${adminStatus==1}">
												<th>Action</th>
											</c:if>
											<c:if test="${adminStatus==2}">
												<th>Book</th>
											</c:if>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item">
											<tr>
												<td><c:out value="${item.id}" /></td>
												<td><c:out value="${item.name}" /></td>
												<td><c:out value="${item.mobileNumber}" /></td>
												<td><c:out value="${item.emailId}" /></td>
												<td><c:out value="${item.category.name}" /></td>
												<td><c:out value="${item.address.city.name}" /></td>
												<td><c:out value="${item.experience}" /></td>
												<td><c:out value="${item.rate}" /></td>
												<c:if test="${adminStatus==1}">
													<td><a
														onclick="editServiceProvider(${item.id},'${item.name}',${item.mobileNumber},'${item.emailId}',${item.category.id},${item.address.city.id},'${item.address.addressLine1}','${item.address.addressLine2}',${item.address.state.id},${item.experience},${item.rate})
														;"><i
															class="fa fa-pencil-alt" style="color: #007bff;"></i></a>&emsp;<a
														onclick="deleteServiceProvider(${item.id});"><i
															class="fa fa-trash-alt" aria-hidden="true"
															style="color: #007bff;"></i></a></td>
												</c:if>

												<c:if test="${adminStatus==2}">
													<td><button class="btn pull-right"
															style="background-color: #007bff; color: white;"
															onclick="addToCart(${item.id});">Add To Cart</button></td>
												</c:if>




											</tr>
										</c:forEach>
									</tbody>

								</table>


							</div>

							<div class="row card-body" id="addServiceProviderDiv"
								style="display: none;">
								<!-- left column -->
								<div class="col-md-12">
									<!-- general form elements -->
									<div class="card card-primary">

										<!-- /.card-header -->
										<!-- form start -->
										<form:form role="form" action="/addServiceProvider"
											method="post">


											<div class="card-body">

												<div class="form-group">
													<label for="exampleInputEmail1" style="color: red;">${errorMessage}</label>
												</div>
												<div class="col-md-12">
													<div class="row">
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">Service Provider
																Name</label>
															<form:input path="name" class="form-control" id="name"
																placeholder="Enter Service Provider Name" />
															<form:errors path="name"></form:errors>
															<input type="hidden" id="id" name="id">
														</div>
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">Mobile Number</label>
															<form:input path="mobileNumber" id="mobileNumber"
																class="form-control"
																placeholder="Enter Service Provider Name" />
															<form:errors path="mobileNumber"></form:errors>

														</div>
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">Email Address</label>
															<form:input path="emailId" class="form-control"
																id="emailId" placeholder="Enter Email Address" />
															<form:errors path="emailId"></form:errors>

														</div>
													</div>

													<div class="row">
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">Category</label> <select
																class="form-control" name="category.id" id="categoryId">
																<option value="">--Select Category--</option>
																<c:forEach items="${categoryList}" var="category">
																	<option value="${category.id}">${category.name}</option>
																</c:forEach>
															</select>
															<form:errors path="category.id"></form:errors>

														</div>
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">AddessLine1</label>
															<form:input path="address.addressLine1"
																class="form-control" id="addressLine1"
																placeholder="Enter Service Provider Name" />
															<form:errors path="address.addressLine1"></form:errors>

														</div>
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">AddressLine2</label>
															<form:input path="address.addressLine2"
																class="form-control" id="addressLine2"
																placeholder="Enter Email Address" />
															<form:errors path="address.addressLine2"></form:errors>

														</div>
													</div>

													<div class="row">
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">City</label> <select
																class="form-control" name="address.city.id" id="city">
																<option value="">--Select City--</option>
																<c:forEach items="${cityList}" var="city">
																	<option value="${city.id}">${city.name}</option>
																</c:forEach>
															</select>
															<form:errors path="address.city.id"></form:errors>

														</div>
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">State</label> <select
																class="form-control" name="address.state.id" id="state">
																<option>--Select State--</option>
																<c:forEach items="${stateList}" var="state">
																	<option value="${state.id}">${state.name}</option>
																</c:forEach>
															</select>
															<form:errors path="address.state.id"></form:errors>

														</div>
														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">Experience</label>
															<form:input path="experience" class="form-control"
																id="experience" placeholder="Enter Experience" />
															<form:errors path="experience"></form:errors>

														</div>
													</div>


													<div class="row">

														<div class="form-group col-md-4">
															<label for="exampleInputEmail1">Rate</label>
															<form:input path="rate" class="form-control" id="rate"
																placeholder="Enter Inspection Rate" />
															<form:errors path="rate"></form:errors>

														</div>
													</div>



												</div>





											</div>


											<!-- /.card-body -->

											<div class="card-footer">
												<button type="submit" class="btn btn-primary">Submit</button>
											</div>
										</form:form>








									</div>
									<!--/.col (left) -->
									<!-- right column -->

									<!--/.col (right) -->
								</div>
								<!-- /.row -->

							</div>


							<!-- /.card-body -->
					</div>
					<!-- /.card -->


					<div class="modal fade" id="modal-default">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">Delete Service Provider</h4>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<p>Are You Sure You Want To Delete Service
										Provider?&hellip;</p>
								</div>
								<input type="hidden" id="serviceProviderId">
								<div class="modal-footer justify-content-between">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">No</button>
									<button type="button" class="btn btn-primary"
										id="deleteServiceProvider">Yes</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->



					<div class="modal fade" id="modal-status">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">Status</h4>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<p id="catStatus">&hellip;</p>
								</div>

								<div class="modal-footer justify-content-between">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="button" class="btn btn-primary" id="ok">Ok</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
			</section>
			<!-- right col -->
		</div>
		<!-- /.row (main row) -->
	</div>
	<!-- /.container-fluid -->
	</section>
	<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
	<jsp:include page="footer.jsp"></jsp:include>
	<!-- Control Sidebar -->
	<aside class="control-sidebar control-sidebar-dark">
		<!-- Control sidebar content goes here -->
	</aside>
	<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="plugins/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="plugins/jquery-ui/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button)
	</script>

	<script type="text/javascript" src="CustomJs/serviceProvider.js"></script>

	<!-- Bootstrap 4 -->
	<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- ChartJS -->
	<script src="plugins/chart.js/Chart.min.js"></script>
	<!-- Sparkline -->
	<script src="plugins/sparklines/sparkline.js"></script>
	<!-- JQVMap -->
	<script src="plugins/jqvmap/jquery.vmap.min.js"></script>
	<script src="plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
	<!-- jQuery Knob Chart -->
	<script src="plugins/jquery-knob/jquery.knob.min.js"></script>
	<!-- daterangepicker -->
	<script src="plugins/moment/moment.min.js"></script>
	<script src="plugins/daterangepicker/daterangepicker.js"></script>
	<!-- Tempusdominus Bootstrap 4 -->
	<script
		src="plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
	<!-- Summernote -->
	<script src="plugins/summernote/summernote-bs4.min.js"></script>
	<!-- overlayScrollbars -->
	<script
		src="plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
	<!-- AdminLTE App -->

	<!-- DataTables -->
	<script src="../../plugins/datatables/jquery.dataTables.js"></script>
	<script src="../../plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>

	<script src="dist/js/adminlte.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="dist/js/pages/dashboard.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="dist/js/demo.js"></script>

	<script type="text/javascript">
		$(function() {
			$("#example1").DataTable();
			$('#example2').DataTable({
				"paging" : true,
				"lengthChange" : false,
				"searching" : false,
				"ordering" : true,
				"info" : true,
				"autoWidth" : false,
			});
		});
	</script>





</body>
</html>
