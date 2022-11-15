<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin Dashboard</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="adminstyle/assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="adminstyle/assets/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<link rel="stylesheet"
	href="adminstyle/assets/vendors/jvectormap/jquery-jvectormap.css">
<link rel="stylesheet"
	href="adminstyle/assets/vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="adminstyle/assets/vendors/owl-carousel-2/owl.carousel.min.css">
<link rel="stylesheet"
	href="adminstyle/assets/vendors/owl-carousel-2/owl.theme.default.min.css">
<!-- End plugin css for this page -->
<!-- inject:css -->
<!-- endinject -->
<!-- Layout styles -->
<link rel="stylesheet" href="adminstyle/assets/css/style.css">

<!-- End layout styles -->
<link rel="shortcut icon" href="adminstyle/assets/images/favicon.png" />
</head>
<body>

	<!-- partial:partials/_sidebar.html -->
	<nav class="sidebar sidebar-offcanvas" id="sidebar">
		<div
			class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
			<a style="text-decoration: none; color: white;"
				class="sidebar-brand brand-logo" href="AdminDashboard">Manager
				Dashboard</a> <a class="sidebar-brand brand-logo-mini"
				href="AdminDashboard"><img src="assets/images/logo-mini.svg"
				alt="logo" /></a>
		</div>
		<ul class="nav">
			<li class="nav-item profile">
				<div class="profile-desc">
					<div class="profile-pic"></div>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminAddStudent"> <span class="menu-icon"> <i
								class="mdi mdi-speedometer"></i>
						</span> <span class="menu-title">Add Student</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="Adminviewstudents"> <span class="menu-icon"> <i
								class="mdi mdi-laptop"></i>
						</span> <span class="menu-title">View Student</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminAddStaff"> <span class="menu-icon"> <i
								class="mdi mdi-playlist-play"></i>
						</span> <span class="menu-title">Add Staff</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="Adminviewstaff"> <span class="menu-icon"> <i
								class="mdi mdi-table-large"></i>
						</span> <span class="menu-title">View Staff</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminAddCourse"> <span class="menu-icon"> <i
								class="mdi mdi-chart-bar"></i>
						</span> <span class="menu-title">Add Course</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminAddBatch"> <span class="menu-icon"> <i
								class="mdi mdi-chart-bar"></i>
						</span> <span class="menu-title">Add Batch</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminViewBatch"> <span class="menu-icon"> <i
								class="mdi mdi-contacts"></i>
						</span> <span class="menu-title">View Batch</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminViewCourse"> <span class="menu-icon"> <i
								class="mdi mdi-contacts"></i>
						</span> <span class="menu-title">View Course</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link"
						href="AdminIdcard"> <span class="menu-icon"> <i
								class="mdi mdi-contacts"></i>
						</span> <span class="menu-title">Id Card</span>
					</a></li>
					<li class="nav-item menu-items"><a class="nav-link" href="">
							<span class="menu-icon"> <i class="mdi mdi-playlist-play"></i>
						</span> <span class="menu-title">QR code</span>
					</a></li>
			</li>
			<li class="nav-item menu-items"><a class="nav-link"
				href="http://www.bootstrapdash.com/demo/corona-free/jquery/documentation/documentation.html">

					<span class="menu-title"> </span>
			</a></li>
		</ul>
	</nav>




	<script src="assets/vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script src="assets/vendors/chart.js/Chart.min.js"></script>
	<script src="assets/vendors/progressbar.js/progressbar.min.js"></script>
	<script src="assets/vendors/jvectormap/jquery-jvectormap.min.js"></script>
	<script
		src="assets/vendors/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<script src="assets/vendors/owl-carousel-2/owl.carousel.min.js"></script>
	<script src="assets/js/jquery.cookie.js" type="text/javascript"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="assets/js/off-canvas.js"></script>
	<script src="assets/js/hoverable-collapse.js"></script>
	<script src="assets/js/misc.js"></script>
	<script src="assets/js/settings.js"></script>
	<script src="assets/js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page -->
	<script src="assets/js/dashboard.js"></script>
	<!-- End custom js for this page -->
</body>
</html>
