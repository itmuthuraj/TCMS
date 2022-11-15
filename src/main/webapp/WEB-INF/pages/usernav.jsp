<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<title>Add Form</title>

<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>User Index</title>
<link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/base/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="images/favicon.png" />
</head>
<body>
<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
			<div
				class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
				<h4 style="color: red;">SMI Training Center</h4>
			</div>
			<div
				class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
				<button class="navbar-toggler navbar-toggler align-self-center"
					type="button" data-toggle="minimize">
					<span class="ti-view-list"></span>
				</button>

				<ul class="navbar-nav navbar-nav-right">
					<li class="nav-item dropdown me-1">
					<li class="nav-item dropdown"><a
						class="nav-link count-indicator dropdown-toggle"
						id="notificationDropdown" href="#" data-bs-toggle="dropdown">
							<i class="ti-bell mx-0"></i> <span class="count"></span>
					</a>
						
					<li class="nav-item nav-profile dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						data-bs-toggle="dropdown" id="profileDropdown"> 
						Welcome! ${sess}
					</a>
						<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
							aria-labelledby="profileDropdown">
							<a class="dropdown-item" href="/viewstudentprofile"> <i
								class=""></i> View Profile
							</a>
							 <a class="dropdown-item" href="/login"> <i
								class="ti-power-off text-primary"></i> Logout
							</a>
							
						</div></li>
				</ul>
				<button
					class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
					type="button" data-toggle="offcanvas">
					<span class="ti-view-list"></span>
				</button>
			</div>
		</nav>

 <div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->
			<nav class="sidebar sidebar-offcanvas" id="sidebar">
				<ul class="nav">
					<li class="nav-item"><a class="nav-link" href="userindex">
							<i class="ti-shield menu-icon"></i> <span class="menu-title">Home</span>
					</a></li>
					<div class="collapse" id="ui-basic">
						<ul class="nav flex-column sub-menu">
							<li class="nav-item"><a class="nav-link"
								href="pages/ui-features/buttons.html">My Profile</a></li>
							<li class="nav-item"><a class="nav-link"
								href="pages/ui-features/typography.html">Edit Profile</a></li>
						</ul>
					</div>
					</li>
					<li class="nav-item"><a class="nav-link" href="attendance">
							<i class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Attendance</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="viewperformance"> <i class="ti-pie-chart menu-icon"></i>
							<span class="menu-title">Performance</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="Courses"> <i
							class="ti-view-list-alt menu-icon"></i> <span class="menu-title">Courses</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="viewcomplaint">
							<i class="ti-star menu-icon"></i> <span class="menu-title">Complaint</span>
					</a></li>
			</nav>


</body>
</html>
