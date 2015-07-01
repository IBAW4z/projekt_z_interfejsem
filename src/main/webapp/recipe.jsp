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

<%@include file="menu.jsp"%>
		<div id="robocza"><center>

			<form id="formularz" method="POST" action='RecipeController' name="frmAddRecipe">
				<!--Recipe ID :--> <input type="hidden" readonly="readonly" name="recipeId"
					value="${recipe.recipeId}" /> <br />
				<label for="name">Name: </label><input
					id="name" type="text" name="dishname"
					value="<c:out value="${recipe.name}" />" /> <br />
				<label for="type">Type: </label><!--<select	multiple="multiple" name="dishtype" value="<c:out value="${recipe.type}" />" >
						<option>SOUP</option>
						<option>DESSERT</option>
						<option>SALAD</option>
						<option>STARTER</option>
						<option>MAIN_COURSE</option>
						<option>DRINK</option>
					</select><br />-->
					<input id="type"
					type="text" name="dishtype"
					value="<c:out value="${recipe.type}" />" /><br>
				<label for="difficulty">Difficulty: </label><input
					id="difficulty" type="text" name="dishdifficulty"
					value="<c:out value="${recipe.difficulty}" />" /><br><!--<select multiple="multiple" name="dishdifficulty" value="<c:out value="${recipe.difficulty}" />" >
						<option>EASY</option>
						<option>MEDIUM</option>
						<option>HARD</option>
					</select><br /> -->
				<label for="flavour">Flavour: </label><input id="flavour" type="text" name="dishflavour"
					value="<c:out value="${recipe.flavour}" />" /><br><!--<select multiple="multiple" name="dishflavour" value="<c:out value="${recipe.flavour}" />" >
						<option>SWEET</option>
						<option>BITTER</option>
						<option>SALTY</option>
						<option>SOUR</option>
						<option>SPICY</option>
					</select><br /> -->
				
				<input class="submit" type="submit" value="Add" />
			</form>
		</center></div>
	</div>

	<%@ include file="stopka.jsp" %>

</body>

</html>
