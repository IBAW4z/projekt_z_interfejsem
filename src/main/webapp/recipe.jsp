<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<link type="text/css"
		href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
  <title>TheFridge</title>
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>

<body>

	<script>
        $(function() {
            $('input[name=dob]').datepicker();
        });
    </script>
	
	<header>
	<h1>Add recipe</h1>
	</header>

	<div id="center" style="text-align:center;" name="interfejs">
	
		<%@include file="menu.jsp"%>
		
		<div id="robocza"><center>

			<form method="POST" action='RecipeController' name="frmAddRecipe">
				Recipe ID : <input type="text" readonly="readonly" name="recipeId"
					value="${recipe.recipeId}" /> <br />
				Name : <input
					type="text" name="dishname"
					value="<c:out value="${recipe.name}" />" /> <br />
				Type : <input
					type="text" name="dishtype"
					value="<c:out value="${recipe.type}" />" /> <br />
				Difficulty : <input
					type="text" name="dishdifficulty"
					value="<c:out value="${recipe.difficulty}" />" /> <br />
				Flavour : <input type="text" name="dishflavour"
					value="<c:out value="${recipe.flavour}" />" /> <br />
				<input type="submit" value="Add" />
			</form>
		</center></div>
	</div>

	<%@ include file="stopka.jsp" %>