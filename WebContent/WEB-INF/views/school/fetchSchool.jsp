<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class list form</title>
</head>
<body>

	<div align = "center">
	
	<h1>Student Fetching Form </h1>
	<form action="<%=request.getContextPath() %>/FetchSchoolServlet" method= "post">
	<table style="with=80%">
	<tr>
		<td>School Code </td>
		<td><input type="text" name="SchoolCode"> </td>
	</tr>
	</table>
	
			<input type="submit" name="SUBMIT">
	
	
	</form>
	</div>

</body>
</html>