<%@ page contentType="text/html;charset=UTF-8" language="java"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
	<link href="<c:url value="/resources/css/bootstrap-responsive.min.css" />"
	rel="stylesheet">
	<link href="<c:url value="/resources/css/validate.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-2.0.3.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/validateRegister.js" />"></script>
<script src="<c:url value="/resources/js/jquery.validate.js" />"></script>

<title>Страница регистрации нового пользователя</title>

</head>
<body>
<div id="registerModal" class="modal hide fade" tabindex="-1" role="dialog"
		aria-labelledby="registerModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h3 id="registerModalLabel">Введите данные аккаунта</h3>
		</div>
		<div class="modal-body">
			<form id="registerForm" class="form-horizontal"  action="register" method="POST">
				<div class="control-group">
					<label class="control-label" for="name" style="padding-top:0px">Ваше имя</label>
					<div class="controls">
						<input type="text" id="name" name="name" placeholder="Введите имя">
						
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="email" style="padding-top:0px">Email</label>
					<div class="controls">
						<input type="text" id="email" name="email" placeholder="Введите E-mail">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="password"  style="padding-top:0px">Пароль</label>
					<div class="controls">
						<input type="password" id="password" name="password" placeholder="Введите пароль">
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
</body>
</html>