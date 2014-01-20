<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
 <title>Добро пожаловать</title>
</head>
<body>
<div class="container-fluid" style="background-color: #E5EFFC; border-style:double; border-width:2px; border-color:#557FB1">
  <div class="row-fluid">
    <div class="span4">
      <img alt="" src="<c:url value="/resources/img/CBlogoNew.jpg" />">
    </div>
    <div class="span8" style="margin-top:10px">
      <button class="btn btn-primary btn-block"> Вход </button>
	  <button class="btn btn-info btn-block"> Регистрация </button>	
    </div>
  </div>
</div>

<a href="welcome.html">LINK</a> 
</body>
</html>