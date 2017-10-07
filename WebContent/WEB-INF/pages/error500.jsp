<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html charset=UTF-8">
<title>500 Error Page</title>

<link href="<c:url value="/resources/css/materialize.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/page-center.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/animsition.min.css" />"
	rel="stylesheet">


</head>
<body class="grey lighten-2 animsition">
	<div id="error-page">
		<div class="row">
			<div class="col s12">
				<div class="browser-window">
					<div class="top-bar">
						<div class="circles">
							<div id="close-circle" class="circle"></div>
							<div id="minimize-circle" class="circle"></div>
							<div id="maximize-circle" class="circle"></div>
						</div>
					</div>
					<div class="content">
						<div class="row">
							<div id="site-layout-example-top" class="col s12">
								<p class="flat-text-logo center white-text caption-uppercase">Please
									Check Your Network...</p>
							</div>
							<div id="site-layout-example-right" class="col s12 m12 l12">
								<div class="row center">
									<h1 class="text-long-shadow col s12">500</h1>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
   	<script src="<c:url value="/resources/assets/plugins/jquery/jquery-2.2.0.min.js" />"></script>
	<script src="<c:url value="/resources/js/materialize.min.js" />"></script>
	<script src="<c:url value="/resources/js/animsition.min.js" />"></script>
	<script src="<c:url value="/resources/js/animsitionScript.js" />"></script>
</body>
</html>