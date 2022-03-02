<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new account</title>
</head>
<body>

	<div align = "center">
		<h1>Create a new Account  </h1>
	<form action="<%=request.getContextPath() %>/CreateNewAccount" method= "post">
	<table style="with=80%">
	
	<tr>
		<td>User name </td>
		<td><input type="text" name="username"> </td>
	</tr>
	
	<tr>
		<td>Password </td>
		<td><input type="password" name="password"> </td>
	</tr>
	
	<tr>
		<td>Name </td>
		<td><input type="text" name="name"> </td>
	</tr>
	
	
	<tr>
		<td>Mobile Number </td>
		<td><input type="text" name="MobileNumber"> </td>
	</tr>
	
	</table>
	
	<input type="submit" name="SUBMIT">
	
	</form>
	</div>


</body>
</html>