<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data form</title>
</head>
<body>
		<div align = "center">
	
	<h1>Student Fetching Form </h1>
	<form action="<%=request.getContextPath() %>/FetchStudentServlet" method= "post">
	<table style="with=80%">
	<tr>
		<td>Scholar Number </td>
		<td><input type="text" name="ScholarNumber"> </td>
	</tr>
	</table>
	
			<input type="submit" name="SUBMIT">
	
	
	</form>
	</div>
	
</body>
</html>