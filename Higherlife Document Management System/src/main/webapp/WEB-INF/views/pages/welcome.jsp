<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Landing Page - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="<c: value = '/resources/css/welcome/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="<c: value = '/resources/fonts/font-awesome/css/font-awesome.min.css' />" rel="stylesheet" type="text/css">
    <link href="<c: value = 'https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic'/>" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="/resources/css/landing-page.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Login</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Services</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Header -->
    <header class="intro-header">
      <div class="container">
        <div class="intro-message">
          <h1>Global Leaders Document Management System</h1>
          <h3>Higherlife Foundation</h3>
          <hr class="intro-divider">
          <ul class="list-inline intro-social-buttons">
            <li class="list-inline-item">
              <a href="https://twitter.com/HigherLifeFDN?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor" class="btn btn-secondary btn-lg">
                <i class="fa fa-twitter fa-fw"></i>
                <span class="network-name">Twitter</span>
              </a>
            </li>
            <li class="list-inline-item">
              <a href="https://www.facebook.com/HigherlifeFDN/" class="btn btn-secondary btn-lg">
                <i class="fa fa-github fa-fw"></i>
                <span class="network-name">Facebook</span>
              </a>
            </li>
            <li class="list-inline-item">
              <a href="https://zw.linkedin.com/company/project-higher-life" class="btn btn-secondary btn-lg">
                <i class="fa fa-linkedin fa-fw"></i>
                <span class="network-name">Linkedin</span>
              </a>
            </li>
			<li class="list-inline-item">
              <a href="https://www.higherlifefoundation.com/" class="btn btn-secondary btn-lg">
                <i class="fa fa-linkedin fa-fw"></i>
                <span class="network-name">Higherlife Home</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </header>

    <!-- Page Content -->
    <section class="content-section-a">

      <div class="container">
        <div class="row">
          <div class="col-lg-5 ml-auto">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">Death to the Stock Photo:<br>Special Thanks</h2>
            <p class="lead">A special thanks to
              <a target="_blank" href="http://join.deathtothestockphoto.com/">Death to the Stock Photo</a>
              for providing the photographs that you see in this template. Visit their website to become a member.</p>
          </div>
          <div class="col-lg-5 mr-auto">
            <img class="img-fluid" src="/resources/images/ipad.png" alt="">
          </div>
        </div>

      </div>
      <!-- /.container -->
    </section>

    <section class="content-section-b">

      <div class="container">

        <div class="row">
          <div class="col-lg-5 mr-auto order-lg-2">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">3D Device Mockups<br>by PSDCovers</h2>
            <p class="lead">Turn your 2D designs into high quality, 3D product shots in seconds using free Photoshop actions by
              <a target="_blank" href="http://www.psdcovers.com/">PSDCovers</a>! Visit their website to download some of their awesome, free photoshop actions!</p>
          </div>
          <div class="col-lg-5 ml-auto order-lg-1">
            <img class="img-fluid" src="/resources/images/dog.png" alt="">
          </div>
        </div>

      </div>
      <!-- /.container -->

    </section>
    <!-- /.content-section-b -->

    <section class="content-section-a">

      <div class="container">

        <div class="row">
          <div class="col-lg-5 ml-auto">
            <hr class="section-heading-spacer">
            <div class="clearfix"></div>
            <h2 class="section-heading">Google Web Fonts and<br>Font Awesome Icons</h2>
            <p class="lead">This template features the 'Lato' font, part of the
              <a target="_blank" href="http://www.google.com/fonts">Google Web Font library</a>, as well as
              <a target="_blank" href="http://fontawesome.io">icons from Font Awesome</a>.</p>
          </div>
          <div class="col-lg-5 mr-auto ">
            <img class="img-fluid" src="/resources/images/phones.png" alt="">
          </div>
        </div>

      </div>
      <!-- /.container -->

    </section>
    <!-- /.content-section-a -->

    <aside class="banner">

      <div class="container">

        <div class="row">
          <div class="col-lg-6 my-auto">
            <h2>Connect to Start Bootstrap:</h2>
          </div>
          <div class="col-lg-6 my-auto">
            <ul class="list-inline banner-social-buttons">
              <li class="list-inline-item">
                <a href="#" class="btn btn-secondary btn-lg">
                  <i class="fa fa-twitter fa-fw"></i>
                  <span class="network-name">Twitter</span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#" class="btn btn-secondary btn-lg">
                  <i class="fa fa-github fa-fw"></i>
                  <span class="network-name">Github</span>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#" class="btn btn-secondary btn-lg">
                  <i class="fa fa-linkedin fa-fw"></i>
                  <span class="network-name">Linkedin</span>
                </a>
              </li>
            </ul>
          </div>
        </div>

      </div>
      <!-- /.container -->

    </aside>
    <!-- /.banner -->

    <!-- Footer -->
    <footer>
      <div class="container">
        <ul class="list-inline">
          <li class="list-inline-item">
            <a href="#">Home</a>
          </li>
          <li class="footer-menu-divider list-inline-item">&sdot;</li>
          <li class="list-inline-item">
            <a href="#about">About</a>
          </li>
          <li class="footer-menu-divider list-inline-item">&sdot;</li>
          <li class="list-inline-item">
            <a href="#services">Services</a>
          </li>
          <li class="footer-menu-divider list-inline-item">&sdot;</li>
          <li class="list-inline-item">
            <a href="#contact">Contact</a>
          </li>
        </ul>
        <p class="copyright text-muted small">Copyright &copy; Hobbs Tech 2017. All Rights Reserved</p>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src = " <c:url value = "/resources/js/welcome/jquery/jquery.min.js"/> "></script>
    <script src=" <c: url value = "/resources/js/welcome/popper/popper.min.js"/> "></script>
    <script src=" <c: url value = "/resources/js/welcome/bootstrap/js/bootstrap.min.js"/> "></script>

  </body>

</html>
