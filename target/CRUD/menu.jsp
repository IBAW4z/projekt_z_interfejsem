<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
  </head>
  
		<div id="menu_place" name="panel_sterowania">
			<div id="pole_batona">
				<p><a id="odsylacz" href="RecipeController?action=insert">Add Recipe</a></p>
				<!--<input type="submit" value="Add recipe" name="Add_recipe">-->
			</div>
			<div id="pole_batona" style="top:90px;">
				<p><a id="odsylacz" href="FridgeController?action=insert">Add Product</a></p>
			</div>
			<div id="pole_batona" style="top:160px;">
				<p><a id="odsylacz" href="FridgeController?action=listFridge">Show all Products</a></p>
			</div>
			<div id="pole_batona" style="top:230px;">
				<p><a id="odsylacz" href="RecipeController?action=listRecipe">Show all Recipes</a></p>
			</div>
			<div id="pole_batona" style="top:300px;">
				<p><a id="odsylacz" href="RecipeController?action=insert">Other operation</a></p>
			</div>
			<div id="pole_batona" style="top:370px;">
				<p><a id="odsylacz" href="RecipeController?action=insert">Other operation</a></p>
			</div>
		</div>
		
<%@ include file="stopka.jsp" %>