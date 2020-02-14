<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header class="header-mobile d-block d-lg-none">
			<div class="header-mobile__bar">
				<div class="container-fluid">
					<div class="header-mobile-inner">
						<a class="logo" href="index.html"> <img
							src="images/icon/logo.png" alt="CoolAdmin" />
						</a>
						<button class="hamburger hamburger--slider" type="button">
							<span class="hamburger-box"> <span class="hamburger-inner"></span>
							</span>
						</button>
					</div>
				</div>
			</div>
			<nav class="navbar-mobile">
				<div class="container-fluid">
					<ul class="navbar-mobile__list list-unstyled">
						<li class="has-sub"><a class="js-arrow" href="#"> <i
								class="fas fa-tachometer-alt"></i>Dashboard
						</a>
							<ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
								
							</ul></li>
						<!-- <li><a href="category"> <i class="fas fa-chart-bar"></i>Category
						</a></li> -->
					</ul>
				</div>
			</nav>
		</header>
		
		<aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="#">
                    <img src="images/icon/logo.png" alt="Cool Admin" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li class="active has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                
                            </ul>
                        </li>
                        <li>
                            <a href="serviceManList">
                                <i class="fas fa-chart-bar"></i>Services List</a>
                        </li>
                        <li>
                            <a href="">
                                <i class="fas fa-table"></i>Order List</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </aside>
</body>
</html>