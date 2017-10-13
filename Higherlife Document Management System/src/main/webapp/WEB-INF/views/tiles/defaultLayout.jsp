<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title> <tiles:getAsString name="title"></tiles:getAsString></title>
	<link href="<c:url value = '/static/css/bootstrap.css'/>" rel="stylesheet"></link>
	<link href="<c:url value = '/static/css/app.css'/>" rel="stylesheet"></link>
	<link rel="stylesheet" href="<c:url value = 'http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css'/>" >
	<link rel="stylesheet" href="<c:url value = 'http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'/> ">
	<link rel="stylesheet" href="/static/css/footer.css">
	<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="<c:url value = '/static/vendor/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css" >
	<link href="<c:url value = '/static/vendor/datatables/dataTables.bootstrap4.css'/>" rel="stylesheet">
	<link href="<c:url value = '/static/css/sb-admin.css'/>" rel="stylesheet">
</head>
</head>
<body>

	<header id="header">
        <tiles:insertAttribute name="header" />
    </header>
	
	<section id ="sidemenu">
        <tiles:insertAttribute name="menu" />
    </section>
         
    <section id="site-content">
        <tiles:insertAttribute name="body" />
    </section>
     
    <footer id="footer">
        <tiles:insertAttribute name="footer" />
    </footer>
	
</body>
</html>