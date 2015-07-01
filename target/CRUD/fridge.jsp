<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>TheFridge</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>

<body>
	<header>
	<h1>Fridge content</h1>
	</header>

	<div id="center" style="text-align:center;" name="interfejs">
	
		<%@include file="menu.jsp"%>

		<div id="robocza"><center>

			<form method="POST" action='FridgeController' name="frmAddProduct">
				Recipe ID : <input type="text" readonly="readonly" name="productId"
								   value="${fridge.productID}" /> <br />
				Name : <input
					type="text" name="name"
					value="<c:out value="${fridge.name}" />" /> <br />
				Type : <input
					type="text" name="amount"
					value="<c:out value="${fridge.amount}" />" /> <br />
				Difficulty : <input
					type="text" name="userID"
					value="<c:out value="${fridge.userID}" />" /> <br />

				<input type="submit" value="Add" />
			</form>

		</center></div>
	</div>

	<%@ include file="stopka.jsp" %>