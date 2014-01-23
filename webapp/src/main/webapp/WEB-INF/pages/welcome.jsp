<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
 <title>Добро пожаловать</title>
</head>
<body>
<div>
	<img alt="" src="<c:url value="/resources/img/CBlogo.jpg" />">
</div>
<h4> Добро пожаловать, ${user.name}!! </h4>
Сайт в разработке, ожидайте. Ваш email - ${user.email}  password - ${user.password}<br/>
 
<img src="http://www.m-tax.ru/under_construction_.png" border="0" alt=""/>
 
</body>
</html>