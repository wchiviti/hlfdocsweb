<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home | Global Leaders Document Management System</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="<c:url value = 'static/css/bootstrap.min.css' />" />
<link rel="stylesheet"
	href="<c:url value = 'static/css/bootstrap-responsive.min.css' />" />
<link rel="stylesheet"
	href="<c:url value = 'static/css/fullcalendar.css' />" />
<link rel="stylesheet"
	href="<c:url value = 'static/css/matrix-style.css' />" />
<link rel="stylesheet"
	href="<c:url value = 'static/css/matrix-media.css' />" />
<link
	href="<c:url value = 'static/css/font-awesome/css/font-awesome.css' />"
	rel="stylesheet" />
<link rel="stylesheet"
	href="<c:url value = 'static/css/jquery.gritter.css' />" />
<link
	href='<c:url value = 'http://fonts.googleapis.com/css?family=Open+Sans:400,700,800'/>'
	rel='stylesheet' type='text/css'>
</head>
<body>

	<!--Header-part-->
	<div id="header">
		<h1>
			<a href="">Global Leaders Document management
				System</a>
		</h1>
	</div>
	<!--close-Header-part-->


	<!--top-Header-menu-->
	<div id="user-nav" class="navbar navbar-inverse">
		<ul class="nav">
			<li class="dropdown" id="profile-messages"><a title="" href="#"
				data-toggle="dropdown" data-target="#profile-messages"
				class="dropdown-toggle"><i class="icon icon-user"></i> <span
					class="text">Welcome ${user.ssoId}</span><b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#"><i class="icon-user"></i> My Profile</a></li>
					<li class="divider"></li>
					<li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
					<li class="divider"></li>
					<li><a href="${pageContext.request.contextPath}/logout"><i
							class="icon-key"></i> Log Out</a></li>
				</ul></li>
			<li class="dropdown" id="menu-messages"><a href="#"
				data-toggle="dropdown" data-target="#menu-messages"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">Messages</span> <span class="label label-important">5</span>
					<b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a class="sAdd" title="" href="#"><i class="icon-plus"></i>
							new message</a></li>
					<li class="divider"></li>
					<li><a class="sInbox" title="" href="#"><i
							class="icon-envelope"></i> inbox</a></li>
					<li class="divider"></li>
					<li><a class="sOutbox" title="" href="#"><i
							class="icon-arrow-up"></i> outbox</a></li>
					<li class="divider"></li>
					<li><a class="sTrash" title="" href="#"><i
							class="icon-trash"></i> trash</a></li>
				</ul></li>
			<li class="dropdown" id="settings"><a href="#"
				data-toggle="dropdown" data-target="#settings"
				class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
					class="text">Settings</span> <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a class="sAdd" title="" href="#"><i class="icon-plus"></i>
							Account Settings</a></li>
					<li class="divider"></li>
				</ul></li>
			<li class=""><a title=""
				href="${pageContext.request.contextPath}/logout"><i
					class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
		</ul>
	</div>
	<!--close-top-Header-menu-->
	
	<!--start-top-serch-->
	<div id="search">
		<input type="text" placeholder="Search here..." />
		<button type="submit" class="tip-bottom" title="Search">
			<i class="icon-search icon-white"></i>
		</button>
	</div>
	<!--close-top-serch-->

	<!--sidebar-menu-->
	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			Dashboard</a>
		<ul>
			<li class="active"><a href="${pageContext.request.contextPath}/dashboard"><i
					class="icon icon-home"></i> <span>Dashboard</span></a></li>
			<!-- <li><a href="charts.html"><i class="icon icon-signal"></i> <span>Activities</span></a></li> -->
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>Activities</span> <!-- <span class="label label-important">1</span> --></a>
				<ul>
					<li><a href="#">Community Engagements</a></li>
				</ul></li>
				
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>Proposals</span> <!-- <span class="label label-important">1</span> --></a>
				<ul>
					<li><a href="#">All Proposals</a></li>
				</ul></li>
			
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>Quotations</span> <!-- <span class="label label-important">1</span> --></a>
				<ul>
					<li><a href="#">All Quotations</a></li>
				</ul></li>
			
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>Progress Reports</span> <!-- <span class="label label-important">1</span> --></a>
				<ul>
					<li><a href="#">All Reports </a></li>
				</ul></li>
			
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>Results</span> <!-- <span class="label label-important">1</span> --></a>
				<ul>
					<li><a href="#">My Results</a></li>
				</ul></li>
			
			<li class="content"><span>Semester Activity Progress</span>
				<div
					class="progress progress-mini ${progressBarType} progress-danger active progress-striped">
					<div style="width: ${progrressPercentage}%;" class="bar"></div>
				</div> <span class="percent">${progrressPercentage}</span>
				<div class="stat">${activityNumber} / 6</div></li>
				
			<!-- <li class="content"><span>Disk Space Usage</span>
				<div class="progress progress-mini active progress-striped">
					<div style="width: 87%;" class="bar"></div>
				</div> <span class="percent">87%</span>
				<div class="stat">604.44 / 4000 MB</div></li> -->
				
			<li class="content"><span>Semester Activity Progress</span>
				<div
					class="progress progress-mini ${progressBarType} progress-danger active progress-striped">
					<div style="width: ${progrressPercentage}%;" class="bar"></div>
				</div> <span class="percent">${progrressPercentage}</span>
				<div class="stat">${activityNumber} / 6</div></li>
		</ul>
	</div>
	<!--sidebar-menu-->

	<!--main-container-part-->
	<div id="content">
		<!--breadcrumbs-->
		<div id="content-header">
			<div id="breadcrumb">
				<a href="${pageContext.request.contextPath}/home" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a>
			</div>
		</div>