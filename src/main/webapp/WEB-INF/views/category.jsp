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
											<button class="btn pull-right"
												style="background-color: #007bff; color: white;"
												id="categoryList">Category List</button>
										</div>
										<div class="col-md-3">
											<h5>Category</h5>
										</div>
										<div class="col-md-2"></div>
										<div class="col-md-2">
											<button class="btn pull-right"
												style="background-color: #007bff; color: white;"
												id="addCategory">Add Category</button>

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
											<th>Category Name</th>
											<th>Action</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="item">
											<tr>
												<td><c:out value="${item.id}" /></td>
												<td><c:out value="${item.name}" /></td>
												<td><a href="/deleteById/${item.id}"
													onclick="editCategory(${item.id},'${item.name}');"><i
														class="fa fa-pencil-alt" style="color: #007bff;"></i></a>&emsp;<a
													onclick="deleteCategory(${item.id});"><i
														class="fa fa-trash-alt" aria-hidden="true"
														style="color: #007bff;"></i></a></td>
											</tr>
										</c:forEach>
									</tbody>

								</table>


							</div>

							<div class="row card-body" id="addCategoryDiv"
								style="display: none;">
								<!-- left column -->
								<div class="col-md-12">
									<!-- general form elements -->
									<div class="card card-primary">

										<!-- /.card-header -->
										<!-- form start -->
										<form:form role="form" action="/addCategory" method="post">
											<div class="card-body">

												<div class="form-group">
													<label for="exampleInputEmail1" style="color: red;">${errorMessage}</label>
												</div>

												<div class="form-group col-md-4">
													<label for="exampleInputEmail1">Category Name</label>
													<form:input path="name" class="form-control" id="name"
														placeholder="Enter Category Name" />
													<form:errors path="name"></form:errors>
													<input type="hidden" id="id" name="id">
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
									<h4 class="modal-title">Delete Category</h4>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<p>Are You Sure You Want To Delete Category?&hellip;</p>
								</div>
								<input type="hidden" id="catId">
								<div class="modal-footer justify-content-between">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">No</button>
									<button type="button" class="btn btn-primary"
										id="deleteCategory">Yes</button>
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

	<script type="text/javascript" src="CustomJs/category.js"></script>

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
