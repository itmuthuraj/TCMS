<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Staff Index</title>
<!-- plugins:css -->
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
		<%@include file="staffnav.jsp"%>
	
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row">
						<div class="col-md-12 grid-margin">
							<div class="d-flex justify-content-between align-items-center">
								<div>
									<h4 class="font-weight-bold mb-0">Staff Dashboard</h4>
								</div>
								<div>
									<button type="button"
										class="btn btn-primary btn-icon-text btn-rounded">
										<i class="ti-clipboard btn-icon-prepend"></i>Report
									</button>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<p class="card-title text-md-center text-xl-left">Total
										Students</p>
									<div
										class="d-flex flex-wrap justify-content-between justify-content-md-center justify-content-xl-between align-items-center">
										<h3 class="mb-0 mb-md-2 mb-xl-0 order-md-1 order-xl-0">${totalemp}</h3>
										<i class="ti-calendar icon-md text-muted mb-0 mb-md-3 mb-xl-0"></i>
									</div>
									<p class="mb-0 mt-2 text-danger">
										Including<span class="text-black ms-1"><small>All
												Batches</small></span>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-3 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<p class="card-title text-md-center text-xl-left">Courses</p>
									<div
										class="d-flex flex-wrap justify-content-between justify-content-md-center justify-content-xl-between align-items-center">
										<h3 class="mb-0 mb-md-2 mb-xl-0 order-md-1 order-xl-0">47033</h3>
										<i class="ti-user icon-md text-muted mb-0 mb-md-3 mb-xl-0"></i>
									</div>
									<p class="mb-0 mt-2 text-danger">
										0.47% <span class="text-black ms-1"><small>(30
												days)</small></span>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-3 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<p class="card-title text-md-center text-xl-left">Schedule</p>
									<div
										class="d-flex flex-wrap justify-content-between justify-content-md-center justify-content-xl-between align-items-center">
										<h3 class="mb-0 mb-md-2 mb-xl-0 order-md-1 order-xl-0">40016</h3>
										<i class="ti-agenda icon-md text-muted mb-0 mb-md-3 mb-xl-0"></i>
									</div>
									<p class="mb-0 mt-2 text-success">
										64.00%<span class="text-black ms-1"><small>(30
												days)</small></span>
									</p>
								</div>
							</div>
						</div>
						<div class="col-md-3 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<p class="card-title text-md-center text-xl-left">Returns</p>
									<div
										class="d-flex flex-wrap justify-content-between justify-content-md-center justify-content-xl-between align-items-center">
										<h3 class="mb-0 mb-md-2 mb-xl-0 order-md-1 order-xl-0">61344</h3>
										<i
											class="ti-layers-alt icon-md text-muted mb-0 mb-md-3 mb-xl-0"></i>
									</div>
									<p class="mb-0 mt-2 text-success">
										23.00%<span class="text-black ms-1"><small>(30
												days)</small></span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- main-panel ends -->
			</div>
			<!-- page-body-wrapper ends -->
		</div>

		<script src="vendors/base/vendor.bundle.base.js"></script>
		<!-- endinject -->
		<!-- Plugin js for this page-->
		<script src="vendors/chart.js/Chart.min.js"></script>
		<script src="js/jquery.cookie.js" type="text/javascript"></script>
		<!-- End plugin js for this page-->
		<!-- inject:js -->
		<script src="js/off-canvas.js"></script>
		<script src="js/hoverable-collapse.js"></script>
		<script src="js/template.js"></script>
		<script src="js/todolist.js"></script>
		<!-- endinject -->
		<!-- Custom js for this page-->
		<script src="js/dashboard.js"></script>
		<!-- End custom js for this page-->
</body>

</html>

