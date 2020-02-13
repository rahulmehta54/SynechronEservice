<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>AdminLTE 3 | General Form Elements</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="../../plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="../../dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
</head>
<body style="background-color: #f4f6f9;">
	<div class="content-wrapper">
		<!-- Navbar -->



		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6"></div>

					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<div class="row">
						<!-- left column -->
						<div class="col-md-6">
							<!-- general form elements -->
							<div class="card card-primary">
								<div class="card-header">
									<h3 class="card-title">Login</h3>
								</div>
								<!-- /.card-header -->
								<!-- form start -->
								<form:form role="form" action="/login" method="post">
									<div class="card-body">

										<div class="form-group">
											<label for="exampleInputEmail1" style="color: red;">${errorMessage}</label>
										</div>

										<div class="form-group">
											<label for="exampleInputEmail1">Email address</label>
											<form:input path="email" class="form-control"
												id="exampleInputEmail1" placeholder="Enter email" />
											<form:errors path="email"></form:errors>
										</div>
										<div class="form-group">
											<label for="exampleInputPassword1">Password</label>
											<form:input path="password" class="form-control"
												id="exampleInputPassword1" placeholder="Password" />
											<form:errors path="password"></form:errors>
										</div>

										<div class="form-check">
											<a href="/register">Create New Account</a>
										</div>
									</div>
									<!-- /.card-body -->

									<div class="card-footer">
										<button type="submit" class="btn btn-primary">Submit</button>
									</div>
								</form:form>
							</div>
							<!-- /.card -->







						</div>
						<!--/.col (left) -->
						<!-- right column -->

						<!--/.col (right) -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
			</section>
			<!-- /.content -->
		</div>


		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="../../plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- bs-custom-file-input -->
	<script
		src="../../plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
	<!-- AdminLTE App -->
	<script src="../../dist/js/adminlte.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="../../dist/js/demo.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			bsCustomFileInput.init();
		});
	</script>
</body>
</html>
