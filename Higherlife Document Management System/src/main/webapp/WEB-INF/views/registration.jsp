<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>TheGreat | Registration</title>
<link href="<c:url value = '/static/css/login/menu.css'/>" rel="stylesheet" />
<link href="<c:url value = '/static/css/login/container.css'/>" rel="stylesheet" />
<link href="<c:url value = '/static/css/login/jquery-confirm.css'/>" rel="stylesheet" />
<link href="<c:url value = '/static/css/font-awesome.min.css'/>" rel="stylesheet" />
<link href="<c:url value = '/static/css/font-awesome.css'/>" rel="stylesheet" />
</head>
<body>
	<div class="top-head" style="">Global Leaders Document management System</div>
	<div id="wrap">
		<header>
			<div class="inner relative">
				<a class="logo" href="#"> <img src="<c:url value = 'static/img/docs_icon.jpg'/>" alt="" />
				</a> <a id="menu-toggle" class="Button dark" href="#"><i
					class="icon-reorder"></i></a>
				<nav id="navigation">
					<ul id="main-menu">
						<li class="current-menu-item"><a href="registration.html">Registration</a></li>
						<li><a href="${pageContext.request.contextPath}/login">Login</a></li>
						<li class="parent"><a href="#">Help</a>
							<ul class="sub-menu">
								<li><a href="about.html">About</a></li>
								<li><a href="contact.html">Contact</a></li>
								<li><a class="parent" href="#"><i class="icon-file-alt"></i>
										Policy</a>
									<ul class="sub-menu">
										<li><a href="#">Copyright Policy</a></li>
										<li><a href="#">Privacy Policy</a></li>
									</ul></li>
							</ul></li>
					</ul>
				</nav>
				<div class="clear"></div>
			</div>
		</header>
	</div>
	<div class="containerBox">
		<form>
			<div class="row">
				<h2>Registration</h2>
				<div class="input-group input-group-icon">
					<input id="txtemail" type="email" placeholder="Email Address" />
					<div class="input-icon">
						<i class="fa fa-envelope"></i>
					</div>
				</div>
				<div class="input-group input-group-icon">
					<input id="txtReemail" type="email"
						placeholder="Re-Enter Email Address" />
					<div class="input-icon">
						<i class="fa fa-envelope"></i>
					</div>
				</div>
				<div class="input-group input-group-icon">
					<input id="txtpassword" type="password" placeholder="Password" />
					<div class="input-icon">
						<i class="fa fa-key"></i>
					</div>
				</div>
				<div class="input-group input-group-icon">
					<input id="txtrepassword" type="password"
						placeholder="Re-Enter Password" />
					<div class="input-icon">
						<i class="fa fa-key"></i>
					</div>
				</div>
			</div>
			<div class="row">
				<h4>Terms and Conditions</h4>
				<div class="input-group">
					<input type="checkbox" id="terms" /> <label for="terms">I
						accept the terms and conditions for signing up to this service,
						and hereby confirm I have read the privacy policy.</label>
				</div>
			</div>
			<div class="row">
				<input id="btnRegister" type="button" class="btn-submit"
					value="SUBMIT" />
			</div>
		</form>
	</div>
	<footer>
		<div class="row" data-wow-duration="500ms">
			<ul>
				<li><a href="#"><i class="fa fa-facebook"></i></a></li>
				<li><a href="#"><i class="fa fa-twitter"></i></a></li>
				<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
				<li><a href="#"><i class="fa fa-youtube"></i></a></li>
				<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
				<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
				<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
			</ul>
			<div class="text-center">
				<p>Design And Developed by TheGreat. Copyright &copy; 2017.</p>
			</div>
		</div>
	</footer>

	<script src="<c:url value = '/static/js/login/jquery-3.1.1.min.js'/>"></script>
	<script src="<c:url value = '/static/js/login/bootstrap.min.js'/>"></script>
	<script src="<c:url value = '/static/js/login/jquery.blockUI.js'/>"></script>
	<script src="<c:url value = '/static/js/login/jquery-confirm.js'/>"></script>
	<script src="<c:url value = '/static/js/login/menu.js'/>"></script>
	<script src="<c:url value = '/static/js/login/registration.js'/>"></script>
	<script src="<c:url value = '/static/js/login/BlockUIStartStop.js'/>"></script>
</body>
</html>
