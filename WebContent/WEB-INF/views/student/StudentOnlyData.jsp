<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div align="center">
	
		
	
	
		<br><br><br><br>
		<h1>Student Data</h1>
		<br><br>
		
		<table border = "1">
		
		<tr>
		
			<th>Scholar Number</th>
			<th>${student.scholarNumber}</th>
			
		</tr>
		
		<tr>
			
			<th>Student's Name</th>
			<td>${student.studentName}</td>
			
		</tr>
		
		<tr>
			
			<th>Father's Name</th>
			<td>${student.fatherName}</td>
			
		</tr>
		
		<tr>
		
			<th>Mother's Name</th>
			<td>${student.motherName}</td>
			
		</tr>
		
		<tr>
		
			<th>Mobile Number</th>
			<td>${student.mobileNumber}</td>
		
		</tr>
		
		<tr>
		
			<th>Aadhar Number</th>
			<td>${student.aadhar}</td>	
		
		</tr>
		
		<tr>
		
			<th>Address</th>
			<td>${student.address}</td>
		
		</tr>
		
		<tr>
		
			<th>Class Code</th>
			<td>${student.classCode}</td>
			
		</tr>				
		
	</table>
	
	<a href="${request.getContextPath()}/EditStudent.jsp">Edit </a>
	
	
	</div>


</body>
</html>