<%@ page language="java" contentType="text/html;" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Site</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="css/bootstrap-4.3.1/dist/css/bootstrap.min.css"/> ">
	<link href="https://fonts.googleapis.com/css?family=Roboto:500&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Raleway:700&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="<c:url value="css/fontawesome-free-5.10.2-web/css/all.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="css/login.css" />">
</head>
<body>
	<div class="form-wrapper">
		<div class="form-header">
			<i class="fas fa-code logo"></i> 
			<span class="logo-text">SISTEMA</span>
		</div>
		<div class="form-title">
			Fa&ccedila seu login para prosseguir
		</div>
		<form action="" method="POST" class="form">
			<div class="input-wrapper">
				<i class="fas fa-user input-icon"></i>
				<input type="text" name="login" placeholder="Digite seu login" class="input">
			</div>
			<div class="input-wrapper">
				<i class="fas fa-lock input-icon"></i>
				<input type="password" name="pass" placeholder="Digite sua senha" class="input">
			</div>
			<input type="submit" value="Entrar" class="submit-btn bg-primary">
		</form>
	</div>
</body>
</html>