<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en" dir="ltr">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Login</title>
<link href="style/LoginStyle.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>

	<div class="box">

		<form method="POST" action="/login">
			<h2>Sign in</h2>
			<div class="inputBox">
				<input type="text" name="username" required="required" /> <span>User
					Name</span> <i></i>
			</div>
			<div class="inputBox">
				<input type="password" name="password" required="required" /> <span>Password</span>
				<i></i>
			</div>
			<div class="links">
				<a href="#">Forgot Password ?</a> 	
			</div>
			<div>
				<input type="submit" value="Login" name="login"
					class="btn btn-block btn-primary" />
				<a href="/index" class="btn btn-block btn-primary">home </a>
			</div>
		</form>
	</div>
</body>
</html>