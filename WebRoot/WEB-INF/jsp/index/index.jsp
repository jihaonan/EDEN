<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> 
<![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8" lang="en"> 
<![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<head>
    <title>ENEN</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <meta charset="UTF-8">

    <link href='http://fonts.useso.com/css?family=Open+Sans:400italic,600italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>

    <!-- CSS Bootstrap & Custom -->
    <link href="${pageContext.request.contextPath }/static/index/bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/index/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/index/css/templatemo-misc.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/index/css/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/index/css/templatemo-main.css">
        
    <!-- Favicons -->
    <!--<link rel="shortcut icon" href="images/ico/favicon.ico">-->
    
    <!-- JavaScripts -->
    <script src="${pageContext.request.contextPath }/static/index/js/jquery-1.10.2.min.js"></script>
    <script src="${pageContext.request.contextPath }/static/index/js/modernizr.js"></script>
    <!--[if lt IE 8]>
	<div style=' clear: both; text-align:center; position: relative;'>
            <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" alt="" /></a>
        </div>
    <![endif]-->
</head>
<body>
    
    <div id="home">
        <div class="site-header">
            <div class="top-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <div class="left-header">
                                <span><i class="fa fa-phone"></i>0000000</span>
                                <span><i class="fa fa-envelope"></i>876714394@qq.com</span>
                            </div> <!-- /.left-header -->
                        </div> <!-- /.col-md-6 -->
                        <div class="col-md-6 col-sm-6">
                            <div class="right-header text-right">
                                <ul class="social-icons">
                                    <li><a href="#" class="fa fa-github"></a></li>
                                    <li><a href="#" class="fa fa-twitter"></a></li>
                                    <li><a href="#" class="fa fa-google-plus"></a></li>
                                </ul>
                            </div> <!-- /.left-header -->
                        </div> <!-- /.col-md-6 -->
                    </div> <!-- /.row -->
                </div> <!-- /.container -->
            </div> <!-- /.top-header -->
            <div class="main-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 col-sm-4 col-xs-6">
                            <div class="logo">
                                <h1><a href="#" title="Eden">Eden</a></h1>
                            </div> <!-- /.logo -->
                        </div> <!-- /.col-md-4 -->
                        <div class="col-md-8 col-sm-8 col-xs-6">
                            <div class="menu text-right hidden-sm hidden-xs">
                                <ul>
                                    <li><a href="#home">Home</a></li>
                                    <li><a href="#services">Services</a></li>
                                    <li><a href="#portfolio">Portfolio</a></li>
                                    <li><a href="#about">About</a></li>
                                    <li><a href="#contact">Contact</a></li>
                                </ul>
                            </div> <!-- /.menu -->
                        </div> <!-- /.col-md-8 -->
                    </div> <!-- /.row -->
                    <div class="responsive-menu text-right visible-xs visible-sm">
                        <a href="#" class="toggle-menu fa fa-bars"></a>
                        <div class="menu">
                            <ul>
                                <li><a href="#home">Home</a></li>
                                <li><a href="#services">Services</a></li>
                                <li><a href="#portfolio">Portfolio</a></li>
                                <li><a href="#about">About</a></li>
                                <li><a href="#contact">Contact</a></li>
                            </ul>
                        </div> <!-- /.menu -->
                    </div> <!-- /.responsive-menu -->
                </div> <!-- /.container -->
            </div> <!-- /.header -->
        </div> <!-- /.site-header -->
    </div> <!-- /#home -->

    <div class="flexslider">
        <ul class="slides">
            <li>
                <img src="${pageContext.request.contextPath }/static/index/images/music_back.jpg" alt="">
                <div class="flex-caption">
                    <h2><a href="/Music" style="color: white;">Music</a></h2>
                    <span></span>
                    <!--<p>Praesent tincidunt neque semper elementum gravida. Donec id euismod magna.<br>Ut erat ligula, malesuada eu quam a, fringilla auctor augue.</p>-->
                </div>
            </li>
            <li>
                <img src="${pageContext.request.contextPath }/static/index/images/video_back.jpg" alt="">
                <div class="flex-caption">
                   <h2><a href="/Music/video.html" style="color: white;">Video</a></h2>
                    <span></span>
                    <!--<p>Ea, similique, odit id consectetur est beatae quia dicta officiis ipsam itaque in<br>facilis aliquid quas officia voluptatem repellendus repellat!</p>-->
                </div>
            </li>
        </ul>
    </div>
    


    <div id="services" class="section-cotent">
        <div class="container">
            <div class="title-section text-center">
                <h2>Our Services</h2>
                <span></span>
            </div> <!-- /.title-section -->
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="service-item"  >
                        <div class="service-header">
                           <i><button class="fa fa-music btn-link" ></button></i>
                            <h3><a href="/Music" >Music</a></h3>
                        </div>

                    </div> <!-- /.service-item -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="service-item">
                        <div class="service-header">
                            <i><button class="fa fa-video-camera btn-link" ></button></i>
                            <h3><a href="/Music/video.html" >Video</a></h3>
                        </div>

                    </div> <!-- /.service-item -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="service-item">
                        <div class="service-header" >
                            <i><button class="fa fa-save btn-link" ></button></i>
                            <h3><a href="/OnlineDisk" >Space</a></h3>
                        </div>

                    </div> <!-- /.service-item -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="service-item">
                        <div class="service-header">
                            <i><button class="fa fa-question btn-link" ></button></i>
                            <h3><a href="#" >Other</a></h3>
                        </div>
                        <!--<div class="service-description">-->
                            <!--Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestiae, sapiente, saepe, velit, repellendus doloribus blanditiis repudiandae nobis optio quasi nulla aliquam nisi voluptatibus.-->
                        <!--</div>-->
                    </div> <!-- /.service-item -->
                </div> <!-- /.col-md-3 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /#services -->

    <div id="portfolio" class="section-content">
        <div class="container">
            <div class="title-section text-center">
                <h2>Our Portfolio</h2>
                <span></span>
            </div> <!-- /.title-section -->
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item1.jpg" alt="Portfolio Item 1">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item1.jpg">Nulla non enim</a></h4>
                                <span>Template</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item2.jpg" alt="Portfolio Item 2">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item2.jpg">Duis nec urna</a></h4>
                                <span>Creative</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item3.jpg" alt="Portfolio Item 3">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item3.jpg">Etiam magna</a></h4>
                                <span>Template</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item4.jpg" alt="Portfolio Item 4">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item4.jpg">Vivamus dignissim</a></h4>
                                <span>Creative</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
            </div> <!-- /.row -->
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item5.jpg" alt="Portfolio Item 5">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item5.jpg">Fusce semper</a></h4>
                                <span>HTML CSS</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item6.jpg" alt="Portfolio Item 6">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item6.jpg">Nunc ultrices</a></h4>
                                <span>Web Design</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item7.jpg" alt="Portfolio Item 7">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item7.jpg">Fusce vehicula</a></h4>
                                <span>HTML CSS</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
                <div class="col-md-3 col-sm-6">
                    <div class="portfolio-thumb">
                        <img src="${pageContext.request.contextPath }/static/index/images/portfolio/item8.jpg" alt="Portfolio Item 8">
                        <div class="overlay">
                            <div class="inner">
                                <h4><a data-rel="lightbox" href="${pageContext.request.contextPath }/static/index/images/portfolio/item8.jpg">Vivamus elementum</a></h4>
                                <span>Web Design</span>
                            </div>
                        </div> <!-- /.overlay -->
                    </div> <!-- /.portfolio-thumb -->
                </div> <!-- /.col-md-3 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /#portfolio -->

    <div id="about" class="section-cotent">
        <div class="container">
            <div class="title-section text-center">
                <h2>About Us</h2>
                <span></span>
            </div> <!-- /.title-section -->
            <div class="row">
                <div class="col-md-12">
                    <h4 class="widget-title">Company Background</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis, ex, amet, quisquam magni quasi modi sint accusamus architecto velit veritatis nobis autem repellat dolore quis atque totam laudantium ab sed impedit beatae esse error culpa voluptatem eius et. <br><br>Aut, nulla, debitis voluptates doloribus quisquam maiores repudiandae nam culpa voluptatibus alias earum magnam numquam. Consectetur, ratione, ipsam totam et nesciunt atque temporibus fuga quos rem deserunt tempore dolore eaque dolorum a doloremque optio nihil pariatur aliquid ex id officiis aliquam sed.</p>
                </div> <!-- /.col-md-3 -->

            </div> <!-- /.row -->
            <div class="row">
                <div class="our-team">
                    <div class="col-md-6 col-sm-6">
                        <div class="team-member">
                            <div class="member-img">
                                <img src="${pageContext.request.contextPath }/static/index/images/team/master.png" alt="Tracy">
                                <div class="overlay">
                                    <ul class="social">
                                        <li><a href="#" class="fa fa-facebook"></a></li>
                                        <li><a href="#" class="fa fa-twitter"></a></li>
                                        <li><a href="#" class="fa fa-instagram"></a></li>
                                    </ul>
                                </div> <!-- /.overlay -->
                            </div>
                            <div class="inner-content">
                                <h5>Liao</h5>
                                <span>Founder</span>
                                <p>unknown</p>
                            </div>
                        </div> <!-- /.team-member -->
                    </div> <!-- /.col-md-4 -->
                    <div class="col-md-6 col-sm-6">
                        <div class="team-member">
                            <div class="member-img">
                                <img src="${pageContext.request.contextPath }/static/index/images/team/co-founder.png" alt="Mary">
                                <div class="overlay">
                                    <ul class="social">
                                        <li><a href="#" class="fa fa-github"></a></li>
                                        <li><a href="#" class="fa fa-twitter"></a></li>
                                        <li><a href="#" class="fa fa-instagram"></a></li>
                                    </ul>
                                </div> <!-- /.overlay -->
                            </div>
                            <div class="inner-content">
                                <h5>LittleJi</h5>
                                <span>Co-Founder</span>
                                <p>Senior software engineer</p>
                                <p>比叶良辰更流弊，比赵日天更吊</p>
                            </div>
                        </div> <!-- /.team-member -->
                    </div> <!-- /.col-md-4 -->
                    <!--<div class="col-md-4 col-sm-6">-->
                        <!--<div class="team-member">-->
                            <!--<div class="member-img">-->
                                <!--<img src="${pageContext.request.contextPath }/static/index/images/team/member-3.jpg" alt="Julia">-->
                                <!--<div class="overlay">-->
                                    <!--<ul class="social">-->
                                        <!--<li><a href="#" class="fa fa-facebook"></a></li>-->
                                        <!--<li><a href="#" class="fa fa-twitter"></a></li>-->
                                        <!--<li><a href="#" class="fa fa-instagram"></a></li>-->
                                    <!--</ul>-->
                                <!--</div> &lt;!&ndash; /.overlay &ndash;&gt;-->
                            <!--</div>-->
                            <!--<div class="inner-content">-->
                                <!--<h5>Julia Three</h5>-->
                                <!--<span>Product Manager</span>-->
                                <!--<p>Mauris vel lorem non odio accumsan scelerisque. Nullam id augue vel nibh soll.</p>-->
                            <!--</div>-->
                        <!--</div> &lt;!&ndash; /.team-member &ndash;&gt;-->
                    <!--</div> &lt;!&ndash; /.col-md-4 &ndash;&gt;-->
                </div> <!-- /.our-team -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /#about -->

    <div id="contact" class="section-cotent">
        <div class="container">
            <div class="title-section text-center">
                <h2>Contact Us</h2>
                <span></span>
            </div> <!-- /.title-section -->
            <div class="row">
                <div class="col-md-7 col-sm-6">
                    <h4 class="widget-title">Send Us a Message</h4>
                    <div class="contact-form">
                        <p class="full-row">
                            <label for="name-id">Your Name:</label>
                            <input type="text" id="name-id" name="name-id">
                        </p>
                        <p class="full-row">
                            <label for="email-id">Email:</label>
                            <input type="text" id="email-id" name="email-id">
                        </p>
                        <p class="full-row">
                            <label for="subject-id">Subject:</label>
                            <input type="text" id="subject-id" name="subject-id">
                        </p>
                        <p class="full-row">
                            <label for="message">Message:</label>
                            <textarea name="message" id="message" rows="6"></textarea>
                        </p>
                        <input class="mainBtn" type="submit" name="" value="Send Message">
                    </div>
                </div> <!-- /.col-md-3 -->
                <div class="col-md-5 col-sm-6">
                    <h4 class="widget-title">Find Us</h4>
                    <div class="map-holder">
                        
                    </div> <!-- /.map-holder -->
                    <div class="contact-info">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam, modi, non ducimus nesciunt in commodi similique aliquam omnis ea at!</p>
                        <span><i class="fa fa-home"></i>390 In luctus justo vel nisi, Duis mattis 10440</span>
                        <span><i class="fa fa-phone"></i>0000000</span>
                        <span><i class="fa fa-envelope"></i>876714394@qq.com</span>
                    </div>
                </div> <!-- /.col-md-3 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /#contact -->

    <div class="site-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-sm-8 col-xs-12">
                    <p>Copyright &copy;2015 EDEN.     皖ICP备15020242号 </p>
                </div> <!-- /.col-md-6 -->
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="go-top">
                        <a href="#" id="go-top">
                            <i class="fa fa-angle-up"></i>
                            Back to Top
                        </a>
                    </div>
                </div> <!-- /.col-md-6 -->
            </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.site-footer -->

    <script src="${pageContext.request.contextPath }/static/index/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath }/static/index/js/plugins.js"></script>
    <script src="${pageContext.request.contextPath }/static/index/js/jquery.lightbox.js"></script>
    <script src="${pageContext.request.contextPath }/static/index/js/custom.js"></script>


</body>
</html>