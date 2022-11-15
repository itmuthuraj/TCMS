
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="view"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
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
				<div class="content-wrapper" style="overflow-x:auto;">
					<table style="margin-bottom: 450px; width: 1000px;"
						class="table table-striped">
						<thead>
							<tr>
								<th>StaffName</th>
											<th>Mobile</th>
											<th>MailId</th>
											<th>DateOfBirth</th>
											<th>Gender</th>
											<th>CourseName</th>
											<th>Experience</th>
											<th>Company</th>
											<th>Qualification</th>
											
							</tr>
						</thead>
						 <view:forEach var="std" items="${topicView}">
							<tr>
								<td>${std[0]}</td>
								<td>${std[1]}</td>
								<td>${std[2]}</td>
								<td>${std[3]}</td>
								<td>${std[4]}</td>
								<td>${std[5]}</td>
								<td>${std[6]}</td>
								<td>${std[7]}</td>
								<td>${std[8]}</td>
								<td><a href='edit/${std[0]}'> Edit</a> <a
									href='delete/${std[0]}'> Delete</a></td>
							</tr>
						</view:forEach> 

					</table>
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

