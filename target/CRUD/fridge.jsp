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
<%@include file="menu.jsp"%>

		<div id="robocza"><center>

			<form id="formularz" method="POST" action='FridgeController' name="frmAddProduct">
				<!--Product ID : --> <input type="hidden" readonly="readonly" name="productId"
								   value="${fridge.productID}" /> <br />
				<label for="name">Name : </label><input
					id="name" type="text" name="name"
					value="<c:out value="${fridge.name}" />" /> <br />
				<label for="amount"> Amount : </label><input
					id="amount" type="text" name="amount"
					value="<c:out value="${fridge.amount}" />" /> <br />
				<!--User ID : <input
					type="text" readonly="readonly" name="userID"
					value="<c:out value="${fridge.userID}" />" /> <br />-->

				<input class="submit" type="submit" value="Add" />
			</form>

		</center></div>
	</div>

	<footer style="margin-top:40px;">
	Copyright - Team4 
	</footer>

</body>

</html>
