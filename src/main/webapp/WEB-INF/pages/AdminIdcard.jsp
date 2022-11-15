<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="adminstyle/css/idstyle.css" rel="stylesheet">
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

<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<title>ID Card</title>
<style>
.studentform {
	margin-left: 50px;
	display: flex;
}

#secondhalf {
	margin-left: 100px;
}

#firsthalf {
	margin-left: 100px;
}
</style>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>
<script>
	function generatePDf() {
		const element = document.getElementById("card");
		html2pdf()
		.from(element)
		.save();
	}
</script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript">
	function myfunction() {
		document.getElementById("display").innerHTML = document
				.getElementById("userinput").value;
		document.getElementById("datedisplay").innerHTML = document
				.getElementById("dob").value;
		document.getElementById("addressdisplay").innerHTML = document
				.getElementById("address").value;
		document.getElementById("numberdisplay").innerHTML = document
				.getElementById("number").value;
		document.getElementById("emaildisplay").innerHTML = document
				.getElementById("email").value;

	}
</script>
</head>
<body>
	<%@include file="Adminnav.jsp"%>		<form action="" method="post" class="studentform">
			<div class="container" style="width: 80%; height: 65vh;">
				<div class="title"></div>
				<div class="content">
					<form action="#" method="post">

						<div class="user-details">

							<div class="input-box">
								<span class="details">Full Name</span> <input type="text"
									placeholder="Enter your name" name="name" id="userinput">
							</div>
							<div class="input-box">
								<span class="details">Date Of Birth</span> <input type="date"
									placeholder="Enter your DOB" name="dob" id="dob">
							</div>
							<div class="input-box">
								<span class="details">Address</span> <input type="text"
									placeholder="Enter your address" name="address" id="address">
							</div>
							<div class="input-box">
								<span class="details"></span> <input type="hidden"
									name="mobile" id="contact" required="required">
							</div>
							<div class="input-box">
								<span class="details">Email</span> <input type="text"
									name="mail" placeholder="Enter your email" id="email">
							</div>
							<div class="input-box">
								<span class="details">Phone Number</span> <input type="text"
									name="mobile" id="number" placeholder="Enter your number">
							</div>
							<div class="input-box">
								<span class="details">Image</span> <input type="file" id="image"
									onchange="readURL(this)" accept="Image/*">
							</div>
							<div class="button">
								<input type="submit" value="click" onclick="myfunction();" />
							</div>
						</div>
				</div>
		</form>
		<button onclick="generatePDf()">Download</button>
	</div>

	<div id="secondhalf" style="padding-top: 40px;">

		<div class="padding">
			<div class="font"
				style="background-image: url('adminstyle/css/ecardbgfinal.png'); background-size: 280px 400px; height: 500px;">
				<div class="companyname">
					SMI<br> <span class="tab"></span>
				</div>
				<div class="top">
					<img
						src="https://i.pinimg.com/736x/8b/16/7a/8b167af653c2399dd93b952a48740620.jpg"
						alt="" style="width: 80px;" />
				</div>
				<div class="">
					<div class="ename">
						<p class="p1">
							<b><span id="display" style="color: black;"></span></b>
						</p>
					</div>
					<div class="edetails">
						<p>
							<b style="color: black;">Email:</b><span id="emaildisplay"
								style="color: black;"></span>
						</p>
						<!-- <P>
							<b style="color: black;">Mobile</b><span id="contactdisplay"
								style="color: black;"></span>
						</P> -->
						<P>
							<b style="color: black;">Mobile</b><span id="numberdisplay"
								style="color: black;"></span>
						</P>
						<p>
							<b style="color: black;">DOB :</b><span id="datedisplay"
								style="color: black;"></span>
						</p>
						<div class="Address">
							<b style="color: black;">Address: </b><span id="addressdisplay"
								style="color: black;"></span>
						</div>
					</div>
					<div class="barcode">
						<img src="adminstyle/css/qr sample.png" alt="">
					</div>

				</div>
			</div>
		</div>
	</div>
	</div>

</body>
</html>