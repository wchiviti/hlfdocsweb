<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<!-- /.website title -->
<title>Login | Global Leaders Document Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS Files -->
<link href="<c:url value = '/static/login/css/bootstrap.min.css' />"
	rel="stylesheet" media="screen">
<link href="<c:url value = '/static/login/css/font-awesome.min.css' />"
	rel="stylesheet">
<link
	href="<c:url value = '/static/login/fonts/icon-7-stroke/css/pe-icon-7-stroke.css' />"
	rel="stylesheet">
<link href="<c:url value = '/static/login/css/animate.css' />"
	rel="stylesheet" media="screen">
<link href="<c:url value = '/static/login/css/owl.theme.css' />"
	rel="stylesheet">
<link href="<c:url value = '/static/login/css/owl.carousel.css' />"
	rel="stylesheet">

<!-- Colors -->
<%-- <link href="<c:url value = '/static/login/css/css-index.css' />" rel="stylesheet" media="screen"> --%>
<!-- <link href="/static/login/css/css-index-green.css" rel="stylesheet" media="screen"> -->
<%-- <link href="<c:url value = '/static/login/css/css-index-purple.css' />"
	rel="stylesheet" media="screen"> --%>
<%-- <link href="<c:url value = '/static/login/css/css-index-red.css' />" rel="stylesheet" media="screen"> --%>
<!-- <link href="<c:url value = '/static/login/css/css-index-orange.css' />" rel="stylesheet" media="screen"> -->
<link href="<c:url value = '/static/login/css/css-index-yellow.css' />" rel="stylesheet" media="screen">

<!-- Google Fonts -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic" />

</head>

<body data-spy="scroll" data-target="#navbar-scroll">

	<!-- /.preloader -->
	<div id="preloader"></div>
	<div id="top"></div>

	<!-- /.parallax full screen background image -->
	<div class="fullscreen landing parallax"
		style="background-image: url('images/bg.jpg');" data-img-width="2000"
		data-img-height="1333" data-diff="100">

		<div class="overlay">
			<div class="container">
				<div class="row">
					<div class="col-md-7">

						<!-- /.logo -->
						<div class="logo wow fadeInDown">
							<a href=""><img src="images/logo.png"
								alt="Global Leaders Logo Here"></a>
						</div>

						<!-- /.main title -->
						<h1 class="wow fadeInLeft">Global Leaders Document Management
							System</h1>

						<!-- /.header paragraph -->
						<div class="landing-text wow fadeInUp">
							<p>"!!!!!!Global Leaders Motto Here!!!!!!!"</p>
						</div>

						<!-- /.header button -->
						<div class="head-btn wow fadeInLeft">
							<a href="#feature" class="btn-primary">Create an Account</a> <a
								href="#download" class="btn-default">Forgort Password</a>
						</div>



					</div>

					<!-- /.signup form -->
					<div class="col-md-5">

						<div class="signup-header wow fadeInUp">
							<h3 class="form-title text-center">Login Here</h3>
							<c:url var="loginUrl" value="/login" />
							<form class="form-header"
								action="${loginUrl}" role="form" method="POST">
								
								<c:if test="${param.error != null}">
									<div class="alert alert-danger">
										<p>Invalid username and password.</p>
									</div>
								</c:if>
								
								<c:if test="${param.logout != null}">
									<div class="alert alert-success">
										<p>You have been logged out successfully.</p>
									</div>
								</c:if>
								<div class="form-group">
									<label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
									<input class="form-control input-lg" name="ssoId" id="username"
										type="text" placeholder="username" required>
								</div>
								<div class="form-group">
									<label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
									<input class="form-control input-lg" name="password" id="password"
										type="password" placeholder="password" required>
								</div>
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
								<div class="form-group last">
									<input type="submit" class="btn btn-warning btn-block btn-lg"
										value="LOGIN">
								</div>
								<p class="privacy text-center">
									We will not share your credentials. Read our <a href="${pageContext.request.contextPath}/privacy">privacy
										policy</a>.
								</p>
							</form>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /.footer -->
	<!-- <footer id="footer">
		<div class="container">
			<div class="col-sm-4 col-sm-offset-4">
				/.social links
				<div class="social text-center">
					<ul>
						<li><a class="wow fadeInUp" href="https://twitter.com/"><i
								class="fa fa-twitter"></i></a></li>
						<li><a class="wow fadeInUp" href="https://www.facebook.com/"
							data-wow-delay="0.2s"><i class="fa fa-facebook"></i></a></li>
						<li><a class="wow fadeInUp" href="https://plus.google.com/"
							data-wow-delay="0.4s"><i class="fa fa-google-plus"></i></a></li>
						<li><a class="wow fadeInUp" href="https://instagram.com/"
							data-wow-delay="0.6s"><i class="fa fa-instagram"></i></a></li>
					</ul>
				</div>
				<div class="text-center wow fadeInUp" style="font-size: 14px;">
					Copyright Backyard 2015 - Template by <a
						href="http://www.moxdesign.com">MoxDesign</a>
				</div>
				<a href="#" class="scrollToTop"><i class="pe-7s-up-arrow pe-va"></i></a>
			</div>
		</div>
	</footer> -->

	<!-- /.javascript files -->
	<script src="<c:url value="/static/login/js/jquery.js"/>"></script>
	<script src="<c:url value="/static/login/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/static/login/js/custom.js"/>"></script>
	<script src="<c:url value="/static/login/js/jquery.sticky.js"/>"></script>
	<script src="<c:url value="/static/login/js/wow.min.js"/>"></script>
	<script src="<c:url value="/static/login/js/owl.carousel.min.js"/>"></script>
	<script>
		new WOW().init();
	</script>
</body>
</html>