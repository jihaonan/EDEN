<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en" class="app">
<head>  
  <meta charset="utf-8" />
  <title>Sign Up</title>
  <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/js/jPlayer/jplayer.flat.css" type="text/css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/css/bootstrap.css" type="text/css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/css/animate.css" type="text/css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/css/font-awesome.min.css" type="text/css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/css/simple-line-icons.css" type="text/css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/css/font.css" type="text/css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/static/music/css/app.css" type="text/css" />  
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath }/static/music/js/ie/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath }/static/music/js/ie/respond.min.js"></script>
    <script src="${pageContext.request.contextPath }/static/music/js/ie/excanvas.js"></script>
  <![endif]-->
  
  <script type="text/javascript">
	// 切换验证码图片
	function nextImage(){
		var newImg = document.getElementById("code");
		newImg.src = "${pageContext.request.contextPath }/code?t=" + new Date().getTime();
	}
	
  </script>
  
  
</head>
<body class="bg-info dker">
  <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
    <div class="container aside-xl">
      <a class="navbar-brand block" href="index.html"><span class="h1 font-bold">EDEN</span></a>
      <section class="m-b-lg">
        <header class="wrapper text-center">
         <c:choose>
        	<c:when test="${message!=null }">
        		<strong>${message}</strong>
        	</c:when>
        	<c:otherwise>
        		<strong>Sign up to find interesting thing</strong>
        	</c:otherwise>
        </c:choose>
          
        </header>
        <form action="${pageContext.request.contextPath }/user/register_submit" method="post">
          <div class="form-group">
            <input placeholder="Name" class="form-control rounded input-lg text-center no-border" name="username" value="${user.username }">
          </div>
          <!--  <div class="form-group">
            <input type="email" placeholder="Email" class="form-control rounded input-lg text-center no-border">
          </div>-->
          <div class="form-group">
             <input type="password" placeholder="Password" class="form-control rounded input-lg text-center no-border" name="password"/>
          </div>
           <div class="form-group "  >
             <a href="javascript:void(0);" onclick="nextImage()"> <img id="code" src="${pageContext.request.contextPath }/code" class="rounded form-control text-center" style="height: 60px" ></a>
          </div>
          <div class="form-group " >
            <input type="text" placeholder="Code" class=" form-control rounded input-lg text-center no-border" name="code"/>
          </div>
          <div class="checkbox i-checks m-b">
            <label class="m-l">
              <input type="checkbox" checked=""><i></i> Agree the <a href="#">terms and policy</a>
            </label>
          </div>
          <button type="submit" class="btn btn-lg btn-warning lt b-white b-2x btn-block btn-rounded"><i class="icon-arrow-right pull-right"></i><span class="m-r-n-lg">Sign up</span></button>
          <div class="line line-dashed"></div>
          <p class="text-muted text-center"><small>Already have an account?</small></p>
          <a href="${pageContext.request.contextPath }/user/login" class="btn btn-lg btn-info btn-block btn-rounded">Sign in</a>
        </form>
      </section>
    </div>
  </section>
  <!-- footer -->
  <footer id="footer">
    <div class="text-center padder clearfix">
      <p>
        <small>EDEN<br>Copyright&copy; 2015</small>
      </p>
    </div>
  </footer>
  <!-- / footer -->
  <script src="${pageContext.request.contextPath }/static/music/js/jquery.min.js"></script>
  <!-- Bootstrap -->
  <script src="${pageContext.request.contextPath }/static/music/js/bootstrap.js"></script>
  <!-- App -->
  <script src="${pageContext.request.contextPath }/static/music/js/app.js"></script>  
  <script src="${pageContext.request.contextPath }/static/music/js/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath }/static/music/js/app.plugin.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/static/music/js/jPlayer/jquery.jplayer.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/static/music/js/jPlayer/add-on/jplayer.playlist.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/static/music/js/jPlayer/my_player.js"></script>

</body>
</html>