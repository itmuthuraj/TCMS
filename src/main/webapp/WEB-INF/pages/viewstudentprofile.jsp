<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="view"%>
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
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
	<div class="container-scroller">
		<div class="row p-0 m-0 proBanner" id="proBanner">
			<div class="col-md-12 p-0 m-0">
				<div
					class="card-body card-body-padding d-flex align-items-center justify-content-between">
					<div class="ps-lg-1">
						<div class="d-flex align-items-center justify-content-between">
							<p class="mb-0 font-weight-medium me-3 buy-now-text"></p>
							<a
								href="https://www.bootstrapdash.com/product/royalui/?utm_source=organic&utm_medium=banner&utm_campaign=buynow_demo"
								target="_blank" class="btn me-2 buy-now-btn border-0">Get
								Pro</a>
						</div>
					</div>
					<div class="d-flex align-items-center justify-content-between">
						<a href="https://www.bootstrapdash.com/product/royalui/"><i
							class="ti-home me-3 text-white"></i></a>
						<button id="bannerClose" class="btn border-0 p-0">
							<i class="ti-close text-white me-0"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
		<!-- partial:partials/_navbar.html -->
		<%@include file="usernav.jsp"%>
		<div class="content-wrapper" style="overflow-x:auto;">
			<table style="margin-bottom: 60px;" class="table table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Address</th>
						<th>MailId</th>
						<th>Mobile</th>
						<th>DateOfBirth</th>
					</tr>
				</thead>
					<view:forEach var="std" items="${topicView}">
							<tr>
								<td>${std[0]}</td>
								<td>${std[1]}</td>
								<td>${std[2]}</td>
								<td>${std[3]}</td>
								<td>${std[4]}</td>
							</tr>
						</view:forEach>
			</table>
			<table style="margin-bottom: 60px;" class="table table-striped">
				<thead>
					<tr>
						<th>Gender</th>
						<th>Batch</th>
						<th>Course</th>
						<th>Qualification</th>
						<th>Department</th>
					</tr>
				</thead>
					<view:forEach var="std" items="${topicView}">
							<tr>
								<td>${std[5]}</td>
								<td>${std[6]}</td>
								<td>${std[7]}</td>
								<td>${std[8]}</td>
								<td>${std[9]}</td>
							</tr>
						</view:forEach>
			</table>
			<table style="margin-bottom: 60px;" class="table table-striped">
				<thead>
					<tr>
						<th>Year Of Passing</th>
						<th>Institute</th>
						<th>Date of Joining</th>
						<th>Fees Status</th>
					</tr>
				</thead>
					<view:forEach var="std" items="${topicView}">
							<tr>
								<td>${std[10]}</td>
								<td>${std[11]}</td>
								<td>${std[12]}</td>
								<td>${std[13]}</td>
							</tr>
						</view:forEach>
			</table>
		</div>
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
</body>
</html>
