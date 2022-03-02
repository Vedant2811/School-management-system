<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data delete</title>
</head>
<body>
	<div align = "center">
		
	<h1>Student Deletion Form </h1>
	<form action="<%=request.getContextPath() %>/DeleteStudentServlet" method= "post">
	<table style="with=100%">
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