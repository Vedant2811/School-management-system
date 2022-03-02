<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student data</title>
</head>
<body>


	<div align = "center">
		<h1>Student Editing Form </h1>
	<form action="<%=request.getContextPath() %>/UpdateStudentServlet" method= "post">
	<table style="with=80%">
	<tr>
		<td>Scholar Number </td>
		<td><input type="text" name="ScholarNumber"> </td>
	</tr>
	
	<tr>
		<td>Student Name </td>
		<td><input type="text" name="StudentName"> </td>
	</tr>
	
	<tr>
		<td>Father's Name </td>
		<td><input type="text" name="FatherName"> </td>
	</tr>
	
	<tr>
		<td>Mother's Name </td>
		<td><input type="text" name="MotherName"> </td>
	</tr>
	
	<tr>
		<td>Mobile Number </td>
		<td><input type="text" name="MobileNumber"> </td>
	</tr>
	
	<tr>
		<td>Aadhar </td>
		<td><input type="text" name="Aadhar"> </td>
	</tr>
	
	<tr>
		<td>Address </td>
		<td><input type="text" name="Address"> </td>
	</tr>
	
	<tr>
		<td>Class Code </td>
		<td><input type="text" name="ClassCode"> </td>
	</tr>
	</table>
	
	<input type="submit" name="Update">
	
	</form>
	</div>

</body>
</html>