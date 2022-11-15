<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- partial:partials/_navbar.html -->
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
						<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
							aria-labelledby="notificationDropdown">
							<p class="mb-0 font-weight-normal float-left dropdown-header">Notifications</p>
							<a class="dropdown-item">
								<div class="item-thumbnail">
									<div class="item-icon bg-success">
										<i class="ti-info-alt mx-0"></i>
									</div>
								</div>
								<div class="item-content">
									<h6 class="font-weight-normal">Application Error</h6>
									<p class="font-weight-light small-text mb-0 text-muted">
										Just now</p>
								</div>
							</a> <a class="dropdown-item">
								<div class="item-thumbnail">
									<div class="item-icon bg-warning">
										<i class="ti-settings mx-0"></i>
									</div>
								</div>
								<div class="item-content">
									<h6 class="font-weight-normal">Settings</h6>
									<p class="font-weight-light small-text mb-0 text-muted">
										Private message</p>
								</div>
							</a> <a class="dropdown-item">
								<div class="item-thumbnail">
									<div class="item-icon bg-info">
										<i class="ti-user mx-0"></i>
									</div>
								</div>
								<div class="item-content">
									<h6 class="font-weight-normal">New user registration</h6>
									<p class="font-weight-light small-text mb-0 text-muted">2
										days ago</p>
								</div>
							</a>
						</div></li>
					<li class="nav-item nav-profile dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						data-bs-toggle="dropdown" id="profileDropdown"> 
						Welcome! ${sess}
					</a>
						<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
							aria-labelledby="profileDropdown">
							 <a class="dropdown-item" href="/viewstaffprofile"> <i
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
		
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->
			<nav class="sidebar sidebar-offcanvas" id="sidebar">
				<ul class="nav">
					<li class="nav-item"><a class="nav-link" href="staffindex">
							<i class="ti-shield menu-icon"></i> <span class="menu-title">Home</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="stafftakeattendance"> <i
							class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Take Attendance</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="stafftaskassign"> <i
							class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Assign Task</span>
					</a></li>
					
					<li class="nav-item"><a class="nav-link" href="CourseTopic">
							<i class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Add Course Topic</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="viewCourseTopic">
							<i class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">View Topic</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="DailyClass">
							<i class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Add Daily Class</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="staffmark">
							<i class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Student Mark</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="staffaddperformance"> <i class="ti-pie-chart menu-icon"></i>
							<span class="menu-title">Add Performance</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="staffexam">
							<i class="ti-view-list-alt menu-icon"></i> <span
							class="menu-title">Exam Schedule</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="stafftotalstudents"> <i
							class="ti-layout-list-post menu-icon"></i> <span
							class="menu-title">Total Students</span>
					</a></li>
					<li class="nav-item"><a class="nav-link"
						href="staffviewcomplaint"> <i class="ti-star menu-icon"></i> <span
							class="menu-title">View Complaint</span>
					</a></li>
			</nav>
		
</body>
</html>