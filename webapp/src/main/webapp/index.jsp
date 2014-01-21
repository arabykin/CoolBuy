<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-2.0.3.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Добро пожаловать</title>

</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span4">
			<div style="width:243px; height: 50px; min-height: 20px; left: 50%; top: 50%; padding:0px;
												position: relative; margin-left: -122px; margin-top: 5px;
												margin-bottom:1px;font-family:Rage Italic;font-size:48px;
                                    			">
                                    <img src="<c:url value="/resources/img/cooltext.png" />"></div>
			</div>
			
			<div class="span8" style="margin-top: 5px;">
				<button class="btn btn-primary btn-block" data-toggle="modal"
					data-target="#loginModal">Вход</button>
				<button class="btn btn-success btn-block" data-toggle="modal"
					data-target="#registerModal"  style="margin-bottom:5px">Регистрация</button>
			</div>
		</div>
	</div>
	<div id="myCarousel" class="carousel slide">
  <!-- Carousel items -->
  <div class="carousel-inner">
    <div class="active item"> <img src="<c:url value="/resources/img/carousel/1.jpg" />"></div>
    <div class="item"><img src="<c:url value="/resources/img/carousel/2.jpg" />"></div>
    <div class="item"><img src="<c:url value="/resources/img/carousel/3.jpg" />"></div>
 	<div class="item"><img src="<c:url value="/resources/img/carousel/4.jpg" />"></div> 
  </div>
  <!-- Carousel nav -->
  <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
  <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
</div>
	

	
	<div id="loginModal" class="modal hide fade" tabindex="-1" role="dialog"
		aria-labelledby="loginModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h3 id="loginModalLabel">Введите данные аккаунта</h3>
		</div>
		<div class="modal-body">
			<form class="form-horizontal">
				<div class="control-group">
					<label class="control-label" for="inputEmail" style="padding-top:0px">Email</label>
					<div class="controls">
						<input type="text" id="inputEmail" placeholder="Email">
					</div>
				</div>
				<div class="control-group" style="margin-bottom:10px">
					<label class="control-label" for="inputPassword"  style="padding-top:0px">Пароль</label>
					<div class="controls">
						<input type="password" id="inputPassword" placeholder="Пароль">
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<label class="checkbox"> <input type="checkbox">
							Запомнить меня
						</label>
						<button type="submit" class="btn">Войти</button>
					</div>
				</div>
			</form>
		</div>		
	</div>
	<div id="registerModal" class="modal hide fade" tabindex="-1" role="dialog"
		aria-labelledby="registerModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h3 id="registerModalLabel">Введите данные аккаунта</h3>
		</div>
		<div class="modal-body">
			<form class="form-horizontal">
				<div class="control-group">
					<label class="control-label" for="inputName" style="padding-top:0px">Ваше имя</label>
					<div class="controls">
						<input type="text" id="inputName" placeholder="Введите имя">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputEmail" style="padding-top:0px">Email</label>
					<div class="controls">
						<input type="text" id="inputEmail" placeholder="Введите E-mail">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword"  style="padding-top:0px">Пароль</label>
					<div class="controls">
						<input type="password" id="inputPassword" placeholder="Введите пароль">
					</div>
				</div>
				<div class="control-group" style="margin-bottom:10px">
					<label class="control-label" for="checkPassword"  style="padding-top:0px">Пароль для проверки</label>
					<div class="controls">
						<input type="password" id="checkPassword" placeholder="Введите пароль повторно">
					</div>
				</div>
				<div class="control-group">					
						<button type="submit" class="btn">Зарегистрироваться</button>
					</div>
				</div>
			</form>
		</div>		
	</div>
	
	
	
	<footer><a href="welcome.html" style="color:white">LINK</a></footer>
</body>
</html>