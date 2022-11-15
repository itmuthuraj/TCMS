
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="value"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<meta charset="ISO-8859-1">
<title>User Index</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$('#comboboxCourse').on('change', function(){
		var courseId = $(this).val();
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/demo/loadBatchByCourse/' + courseId,
			success: function(result) {
				var result = JSON.parse(result);
				var s = '';
				for(var i = 0; i < result.length; i++) {
					
					s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
				}
				$('#comboboxBatch').html(s);
			}
		});
	});
		
		$('#comboboxCourse').on('change', function(){
			var courseId = $(this).val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/demo/loadTopicByCourse/' + courseId,
				success: function(result) {
					var result = JSON.parse(result);
					var s = '';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
					}
					$('#comboboxTopic').html(s);
				}
			});
		});
			
			
			$('#comboboxCourse').on('change', function(){
				var courseId = $(this).val();
				$.ajax({
					type: 'GET',
					url: '${pageContext.request.contextPath }/demo/loadStaffByCourse/' + courseId,
					success: function(result) {
						var result = JSON.parse(result);
						var s = '';
						for(var i = 0; i < result.length; i++) {
							s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
						}
						$('#comboboxStaff').html(s);
					}
				});
			});	
		
		
	});
</script>
</head>
<body>




<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
<link rel="stylesheet" href="vendors/base/vendor.bundle.base.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="css/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="images/favicon.png" />
<style>
.get-in-touch {
	max-width: 800px;
	margin: 50px auto;
	position: relative;
}

.get-in-touch .title {
	text-align: center;
	text-transform: uppercase;
	letter-spacing: 3px;
	font-size: 3.2em;
	line-height: 48px;
	padding-bottom: 48px;
	color: #5543ca;
	background: #5543ca;
	background: -moz-linear-gradient(left, #f4524d 0%, #5543ca 100%)
		!important;
	background: -webkit-linear-gradient(left, #f4524d 0%, #5543ca 100%)
		!important;
	background: linear-gradient(to right, #f4524d 0%, #5543ca 100%)
		!important;
	-webkit-background-clip: text !important;
	-webkit-text-fill-color: transparent !important;
}

.contact-form .form-field {
	position: relative;
	margin: 32px 0;
}

.contact-form .input-text {
	display: block;
	width: 100%;
	height: 36px;
	border-width: 0 0 2px 0;
	border-color: #5543ca;
	font-size: 18px;
	line-height: 26px;
	font-weight: 400;
}

.contact-form .input-text:focus {
	outline: none;
}

.contact-form .input-text:focus+.label, .contact-form .input-text.not-empty+.label
	{
	-webkit-transform: translateY(-24px);
	transform: translateY(-24px);
}

.contact-form .label {
	position: absolute;
	left: 20px;
	bottom: 11px;
	font-size: 18px;
	line-height: 26px;
	font-weight: 400;
	color: #5543ca;
	cursor: text;
	transition: -webkit-transform .2s ease-in-out;
	transition: transform .2s ease-in-out;
	transition: transform .2s ease-in-out, -webkit-transform .2s ease-in-out;
}

.contact-form .submit-btn {
	display: inline-block;
	background-color: #000;
	background-image: linear-gradient(125deg, #a72879, #064497);
	color: #fff;
	text-transform: uppercase;
	letter-spacing: 2px;
	font-size: 16px;
	padding: 8px 16px;
	border: none;
	width: 200px;
	cursor: pointer;
}
</style>
</head>
<body>
<%@include file="staffnav.jsp"%>

			<script
				src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
			<script
				src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
			<!------ Include the above in your HEAD tag ---------->

			<section class="get-in-touch">
				<h1 class="title">Add Daily Class</h1>
				<form  action="insertdailyclass" method="get">
					<table>
						<tr>
							<div class="form-field col-lg-6">
								<td><label class="label" for="form3Example1m">Course</label>
								</td>
								<td><select name="courseId" id="comboboxCourse">
								<option value="">Select a Course</option>
								<value:forEach var="course" items="${courses}" >
											<option value="${course.id}">${course.name}</option>
										</value:forEach>
								</select></td>
							
							</div>
						</tr>

						<tr>

							<td><label class="label" for="form3Example1m">Batch</label>
							</td>
							<div class="form-field col-lg-6">
								<td><select name="batchId" id="comboboxBatch"
									class="input-text js-input">
									<option value="">Select the Course first</option>
								</select></td>

								<tr>
									<td><label class="label" for="form3Example1m">Topic</label>
									</td>
									<div class="form-field col-lg-6">
										<td><select name="topicId" id="comboboxTopic"
											class="input-text js-input">
											<option value="">Select the Course first</option>
										</select></td>


										<tr>
											<td><label class="label" for="form3Example1m">Staff</label>
											</td>
											<div class="form-field col-lg-6">
												<td><select name="staffId" id="comboboxStaff"
													class="input-text js-input">
													<option value="">Select the Course first</option>
												</select></td>
					</table>
					<div class="form-field col-lg-6 ">
					<label class="label" for="phone">Class Date </label>
						<input name="classDate" id="classDate" class="input-text js-input" type='text' placeholder="dd/mm/yyyy" required>
						
					</div>
					<button type="submit"  class="btn btn-primary">Submit</button>
		</form>
					

			</section>
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
