
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
<link rel="stylesheet" href="css/style.css">
<link rel="shortcut icon" href="images/favicon.png" />
</head>
<body>
	<%@include file="staffnav.jsp"%>
			<div>
				<h4 style="padding-top: 20px;">Total Students: ${totalemp}</h4>
				<form action="EmployeeList" method="get">
					<input id="txtsearch" name="keyword" type="text">
					<button type="submit">search</button>
				</form>
				<table style="margin-bottom: 450px; width: 1000px;"
					class="table table-striped">
					<thead>
						<tr>
							<th scope="col"><a style="text-decoration: none;"
								href="/stafftotalstudents/?sortField=empId&sortDir=${reverseSortDir}">Student
									EnrollmentId</a></th>
							<th scope="col"><a style="text-decoration: none;"
								href="/stafftotalstudents/?sortField=empId&sortDir=${reverseSortDir}">Name</a></th>
							<th scope="col">Mail</th>
							<th scope="col">Mobile</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<view:forEach var="std" items="${EmployeeList}">
						<tr>
							<td>${std.getStudentEnquiryId()}</td>
							<td>${std.getStudentName()}</td>
							<td>${std.getMail()}</td>
							<td>${std.getMobile()}</td>
							<td><a href='edit/${std.getStudentEnquiryId()}'> Edit</a> <a
								href='delete/${std.getStudentEnquiryId()}'> Delete</a></td>
						</tr>
					</view:forEach>

				</table>
			</div>
		</div>
	</div>
	<script src="vendors/base/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Pluginart.js/"></script>
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
