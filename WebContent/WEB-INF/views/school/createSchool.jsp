<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Input data</title>
</head>
<body>

	<div align = "center">
		<h1>School Creation Form </h1>
	<form action="<%=request.getContextPath() %>/CreateSchool" method= "post">
	<table style="with=100%">
	<tr>
		<td>School Code </td>
		<td><input type="text" name="SchoolCode"> </td>
	</tr>
	
	<tr>
		<td>School Name</td>
		<td><input type="text" name="SchoolName"> </td>
	</tr>
	
	<tr>
		<td>Principal's Name</td>
		<td><input type="text" name="PrincipalName"> </td>
	</tr>
	
	<tr>
		<td>Vice-Principal's Name </td>
		<td><input type="text" name="VicePrincipalName"> </td>
	</tr>
	
	</table>
	
	<input type="submit" name="SUBMIT">
	
	</form>
	</div>
	
</body>
</html>