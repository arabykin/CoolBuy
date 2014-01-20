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
	<div class="container-fluid" style="background-color: #6C8CD5;">
		<div class="row-fluid">
			<div class="span4">
			<div style="width:243px; height: 50px; min-height: 20px; left: 50%; top: 50%; padding:0px;
												position: relative; margin-left: -122px; margin-top: 5px;
												margin-bottom:1px;font-family:Rage Italic;font-size:48px;
                                    			background-color: #6C8CD5;">
                                    <img src="<c:url value="/resources/img/cooltext.png" />"></div>
			</div>
			
			<div class="span8" style="margin-top: 5px;">
				<button class="btn btn-primary btn-block" data-toggle="modal"
					data-target="#myModal">Вход</button>
				<button class="btn btn-info btn-block"  style="margin-bottom:5px">Регистрация</button>
			</div>
		</div>
	</div>
	<div class="container" style="background-color: #E5EFFC;"></div>

	<a href="welcome.html">LINK</a>
	<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h3 id="myModalLabel">Введите данные аккаунта</h3>
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
</body>
</html>