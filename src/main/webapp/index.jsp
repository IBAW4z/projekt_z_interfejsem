<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>FRIDGE, RECIPE & FRIENDS</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>
<header><center>
	<h1>FRIDGE, RECIPE & FRIENDS</h1>
	</header>

	<body><center>
	<form id="formularz" action="login.jsp" method="POST">
		<input class="submit" type="submit" value="Login"/>
	</form>
	<form id="formularz" action="register.jsp" method="POST">
		<input class="submit" type="submit" value="Register"/>
	</form>
	</body>
	
	<%@ include file="stopka.jsp" %>