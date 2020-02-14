<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- sidebar menu area start -->
	<!-- sidebar menu area start -->
	<div class="sidebar-menu">
		<div class="sidebar-header">
			<div class="logo">
				<a href="#"><img src="assets/images/icon/logo.png" alt="logo"></a>
			</div>
		</div>
		<div class="main-menu">
			<div class="menu-inner">
				<nav>
					<ul class="metismenu" id="menu">
						<!--  <li class="active">
                                <a href="javascript:void(0)" aria-expanded="true"><i class="ti-dashboard"></i><span>Dashboard</span></a>
                                <ul class="collapse">
                                    <li class="active"><a href="#">Active Menu Item</a></li>
                                    <li><a href="#">Menuitem 2</a></li>
                                    <li><a href="#">Menuitem 3</a></li>
                                </ul>
                            </li> -->
						<li><a href="javascript:void(0)" aria-expanded="true"><i
								class="fa fa-align-left"></i> <span>index menu</span></a>
							<ul class="collapse">
								<li><a href="/registration">User registration</a></li>
								<li><a href="/login">User Login</a></li>
								<li><a href="#" aria-expanded="true">Category</a>
									<ul class="collapse">
										<li><a href="/category">Add Category</a></li>
										<!-- <li><a href="/deleteCategory">Delete Category</a></li> -->
										<li><a href="/viewCategory">View Category</a></li>
									</ul></li>

								<li><a href="#" aria-expanded="true">ServiceMan</a>
									<ul class="collapse">
										<li><a href="/addServiceman">Add Serviceman</a></li>
									<!-- 	<li><a href="/deleteServiceman">Delete Serviceman</a></li> -->
										<li><a href="/viewServiceman">View Serviceman</a></li>
									</ul></li>
							</ul></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>

	<!-- sidebar menu area end -->

	<!-- 
	<div class="header-area">
		<div class="row align-items-center">
			nav and search button
			<div class="col-md-6 col-sm-8 clearfix">
				<div class="nav-btn pull-left">
					<span></span> <span></span> <span></span>
				</div>
				<div class="search-box pull-left">
					<form action="#">
						<input type="text" name="search" placeholder="Search..." required>
						<i class="ti-search"></i>
					</form>
				</div>
			</div>
	 -->
	<!-- profile info & task notification -->
	<!-- <div class="col-md-6 col-sm-4 clearfix">
				<ul class="notification-area pull-right">
					<li id="full-view"><i class="ti-fullscreen"></i></li>
					<li id="full-view-exit"><i class="ti-zoom-out"></i></li>
					<li class="dropdown"><i class="ti-bell dropdown-toggle"
						data-toggle="dropdown"> <span>2</span>
					</i>
						<div class="dropdown-menu bell-notify-box notify-box">
							<span class="notify-title">You have 3 new notifications <a
								href="#">view all</a></span>
							<div class="nofity-list">
								<a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-key btn-danger"></i>
									</div>
									<div class="notify-text">
										<p>You have Changed Your Password</p>
										<span>Just Now</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-comments-smiley btn-info"></i>
									</div>
									<div class="notify-text">
										<p>New Commetns On Post</p>
										<span>30 Seconds ago</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-key btn-primary"></i>
									</div>
									<div class="notify-text">
										<p>Some special like you</p>
										<span>Just Now</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-comments-smiley btn-info"></i>
									</div>
									<div class="notify-text">
										<p>New Commetns On Post</p>
										<span>30 Seconds ago</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-key btn-primary"></i>
									</div>
									<div class="notify-text">
										<p>Some special like you</p>
										<span>Just Now</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-key btn-danger"></i>
									</div>
									<div class="notify-text">
										<p>You have Changed Your Password</p>
										<span>Just Now</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<i class="ti-key btn-danger"></i>
									</div>
									<div class="notify-text">
										<p>You have Changed Your Password</p>
										<span>Just Now</span>
									</div>
								</a>
							</div>
						</div></li>
					<li class="dropdown"><i
						class="fa fa-envelope-o dropdown-toggle" data-toggle="dropdown"><span>3</span></i>
						<div class="dropdown-menu notify-box nt-enveloper-box">
							<span class="notify-title">You have 3 new notifications <a
								href="#">view all</a></span>
							<div class="nofity-list">
								<a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img1.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">Hey I am waiting for you...</span> <span>3:15
											PM</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img2.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">When you can connect with me...</span> <span>3:15
											PM</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img3.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">I missed you so much...</span> <span>3:15
											PM</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img4.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">Your product is completely Ready...</span> <span>3:15
											PM</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img2.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">Hey I am waiting for you...</span> <span>3:15
											PM</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img1.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">Hey I am waiting for you...</span> <span>3:15
											PM</span>
									</div>
								</a> <a href="#" class="notify-item">
									<div class="notify-thumb">
										<img src="assets/images/author/author-img3.jpg" alt="image">
									</div>
									<div class="notify-text">
										<p>Aglae Mayer</p>
										<span class="msg">Hey I am waiting for you...</span> <span>3:15
											PM</span>
									</div>
								</a>
							</div>
						</div></li>
					<li class="settings-btn"><i class="ti-settings"></i></li>
				</ul>
			</div>
		</div>
	</div> -->
	<!-- header area end -->

</body>
</html>