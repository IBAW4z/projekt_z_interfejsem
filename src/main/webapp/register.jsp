<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>FRIDGE, RECIPE & FRIENDS</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>

<form action="RegisterController" method="POST">
		<h1><table>
			<tbody>
				<tr><td>e-mail: </td><td><input type="text" name="email" /></td></tr>
				<tr><td>Password: </td><td><input type="password" name="password" /></td></tr>
				<tr><td>Repeat password: </td><td><input type="password" name="password2" /></td></tr>
				<tr><td> </td><td><input type="submit" name="submit_rejestracja" value="Register"/></td></tr>
			</tbody>
		</table></h1>
	</form>
	
	<%@ include file="stopka.jsp" %>