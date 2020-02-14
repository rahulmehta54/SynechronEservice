<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<!-- <link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 -->

<link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav
		class="main-header navbar navbar-expand navbar-white navbar-light bg-primary elevation-2"
		style="color: white;">
		<!-- Left navbar links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
				href="#"><i class="fas fa-bars"
					style="color: rgba(255, 255, 255, .75);"></i></a></li>
			<li class="nav-item d-none d-sm-inline-block"><a
				href="/dashboard" class="nav-link"
				style="color: rgba(255, 255, 255, .75);">Home</a></li>

			<li></li>

			<!-- <li class="nav-item d-none d-sm-inline-block"><a href="#"
				class="nav-link" style="color: rgba(255, 255, 255, .75);">Contact</a></li> -->
		</ul>

		<!-- SEARCH FORM -->
		<form class="form-inline ml-3">
			<div class="input-group input-group-sm">
				<input class="form-control form-control-navbar" type="search"
					placeholder="Search" aria-label="Search"
					style="background-color: rgb(255, 255, 255, .75);">
				<div class="input-group-append">
					<button class="btn btn-navbar" type="submit"
						style="background-color: rgb(255, 255, 255, .75);">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>

		<!-- Right navbar links -->
		<ul class="navbar-nav ml-auto">
			<!-- Messages Dropdown Menu -->



			<!-- Notifications Dropdown Menu -->


			<li class="nav-item dropdown"><a class="nav-link" data-toggle=""
				href="/showCart"> <i class="fa fa-shopping-cart"
					style="color: #ff8000"></i>
			</a></li>
			<li class="nav-item dropdown"><a href="/logout"><button
						class="btn btn-primary"
						style="background-color: #007bff; color: white;">Sign-Out</button>
			</a></li>

			<li class="nav-item dropdown" title="Sign Out"><a
				class="nav-link" data-toggle="" href=""> <i
					class="fa fa-sign-out"></i>
			</a></li>

		</ul>
	</nav>


	<aside class="main-sidebar sidebar-dark-primary elevation-4">
		<!-- Brand Logo -->
		<a href="../../index3.html" class="brand-link"> <img
			src="../../dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
			class="brand-image img-circle elevation-3" style="opacity: .8">
			<span class="brand-text font-weight-light">E-Service</span>
		</a>

		<!-- Sidebar -->
		<div class="sidebar">
			<!-- Sidebar user (optional) -->
			<div class="user-panel mt-3 pb-3 mb-3 d-flex">
				<div class="image">
					<!-- <img src="../../dist/img/user2-160x160.jpg"
						class="img-circle elevation-2" alt="User Image"> -->
				</div>
				<div class="info">
					<a href="#" class="d-block"></a>
				</div>
			</div>

			<!-- Sidebar Menu -->
			<nav class="mt-2">
				<ul class="nav nav-pills nav-sidebar flex-column"
					data-widget="treeview" role="menu" data-accordion="false">
					<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
					<li class="nav-item has-treeview"><a href="/dashboard"
						class="nav-link"> <i class="nav-icon fas fa-tachometer-alt"></i>
							<p>
								Dashboard <i class="right fas fa-angle-left"></i>
							</p>
					</a></li>
					<c:if test="${adminStatus eq 2}">
						<li class="nav-item has-treeview"><a href="/serviceProvider"
							class="nav-link"> <i class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Service Provider List <i class="right fas fa-angle-left"></i>
								</p>
						</a></li>
					</c:if>
					<c:if test="${adminStatus eq 1}">
						<li class="nav-item has-treeview"><a href="/category"
							class="nav-link"> <i class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Category <i class="right fas fa-angle-left"></i>
								</p>
						</a></li>
					</c:if>
					<c:if test="${adminStatus eq 3}">
						<li class="nav-item has-treeview"><a href="/inspectionRate"
							class="nav-link"> <i class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Inspection Rate <i class="right fas fa-angle-left"></i>
								</p>
						</a></li>
					</c:if>
					<c:if test="${adminStatus eq 1}">
						<li class="nav-item has-treeview"><a href="/serviceProvider"
							class="nav-link"> <i class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Service Provider <i class="right fas fa-angle-left"></i>
								</p>
						</a></li>
					</c:if>

					<li class="nav-item has-treeview"><a href="/orderList"
						class="nav-link"> <i class="nav-icon fas fa-tachometer-alt"></i>
							<p>
								Order List <i class="right fas fa-angle-left"></i>
							</p>
					</a></li>





				</ul>
			</nav>
			<!-- /.sidebar-menu -->
		</div>
		<!-- /.sidebar -->
	</aside>


</body>
</html>