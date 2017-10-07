<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">



<head>

<!-- Title -->
<title>Login</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta charset="UTF-8">
<meta name="description" content="Responsive Admin Dashboard Template" />
<meta name="keywords" content="admin,dashboard" />
<meta name="author" content="Steelcoders" />
<!-- Styles -->
<link
	href="<c:url value="/resources/assets/plugins/materialize/css/materialize.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/assets/plugins/material-preloader/css/materialPreloader.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/animsition.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/assets/css/alpha.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/assets/css/custom.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/FormStyle.css" />"
	rel="stylesheet">

<!-- <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" /> -->
<!-- <link href="assets/css/bootstrap-datepicker.min.css" rel="stylesheet" type="text/css" /> -->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="http://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="http://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

</head>

<body>
	<div class="loader-bg"></div>
	<div class="loader">
		<div class="preloader-wrapper big active">
			<div class="spinner-layer spinner-blue">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
			<div class="spinner-layer spinner-spinner-teal lighten-1">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
			<div class="spinner-layer spinner-yellow">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
			<div class="spinner-layer spinner-green">
				<div class="circle-clipper left">
					<div class="circle"></div>
				</div>
				<div class="gap-patch">
					<div class="circle"></div>
				</div>
				<div class="circle-clipper right">
					<div class="circle"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="mn-content fixed-sidebar ">
		<nav class=" blue-grey nav-extended ">
			<div class="nav-wrapper">
				<a href="#" class="center brand-logo">T24</a> <a href="#"
					data-activates="mobile-demo" class="button-collapse"><i
					class="material-icons">menu</i></a>
				<ul id="nav-mobile" class="right hide-on-med-and-down">
				<li class="disabled"><a href="#">Log out</a></li>
					<li class="disabled"><a href="help.html">Help</a></li>
				</ul>
				<ul class="side-nav" id="mobile-demo">
					<li class="disabled"><a href="#">Log out</a></li>
					<li class="disabled"><a href="help.html">Help</a></li>
				</ul>
			</div>
			<div class=" blue-grey nav-content">
				<ul class="tabs tabs-transparent tabs-fixed-width">
					<li class="tab"><a class="active" href="#check">Log in</a></li>
				</ul>
			</div>
		</nav>
		<br />
		<br />
		<br />
		<br />
		<br />
		<main class=" container animsition">
		<div class="container white z-depth-2" >
			<ul class="tabs teal">
				<li class="tab col s3"><a class="white-text active"
					href="#login">login</a></li>
			</ul>
			<div id="login" class="col s12">
				<form action="<c:url value="/j_spring_security_check"/>"
					method="post" >
					<div class="form-container">
						<h4 class="center">
							<i class="fa fa-user menu-icon "></i> Connectez-Vous
						</h4>
						<br />
						<br />
						<br />
				<c:if test="${not empty requestScope.error}">
							<div class="center"><span style="color:red">Username/Password Incorrect !</span></div>
					</c:if>
						
						<div class="row">
							<div class="input-field col s12" style="width: 70%">
							
								<input id="username" name="username" type="text" style="margin-left: 20%"
									class=""> <label for="username"
									style="margin-left: 20%">Username</label>
							</div>
						</div>
						<div class="row">
							<div class="input-field col s12" style="width: 70%">
								<input id="password" name="password" type="password" style="margin-left: 20%"
									class=""> <label for="password"
									style="margin-left: 20%">Password</label>
							</div>
						</div>
						<br>
						<center>
							<button class="btn waves-effect waves-light teal" type="submit">Connect</button>
							<br> <br> <a href="">Forgotten password?</a>
						</center>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</div>
				</form>
			</div>
		</div>
		</main>
	</div>

	<!-- Javascripts -->

	<script
		src="<c:url value="/resources/assets/plugins/jquery/jquery-2.2.0.min.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/materialize/js/materialize.min.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/material-preloader/js/materialPreloader.min.js" />"></script>
	<script
		src="<c:url value="/resources/assets/plugins/jquery-blockui/jquery.blockui.js" />"></script>
	<script src="<c:url value="/resources/js/animsition.min.js" />"></script>
	<script src="<c:url value="/resources/js/animsitionScript.js" />"></script>
	<script src="<c:url value="/resources/assets/js/alpha.min.js" />"></script>

	<!-- <script src="assets/plugins/bootstrap/bootstrap.min.js"></script> -->
	<!-- <script src="assets/plugins/bootstrap-datepicker/bootstrap-datepicker.min.js"></script> -->


</body>

</html>





