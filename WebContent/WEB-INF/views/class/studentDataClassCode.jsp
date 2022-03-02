<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
	
	<div align="center">
	
		<form action="<%=request.getContextPath()%>/StudentDataClassCodeServlet"></form>
	
	
		<br><br><br><br>
		<h1>Student Data</h1>
		<br><br>
		
		<table border = "1">
		<tr>
			
			<th>Scholar Number</th>
			<th>Student's Name</th>
			<th>Father's Name</th>
			<th>Mother's Name</th>
			<th>Mobile Number</th>
			<th>Aadhar Number</th>
			<th>Address</th>
			<th>Class Code</th>
			
		</tr>
		
		<c:forEach items = "${list}" var = "student">
			<tr>
				<th>${student.scholarNumber}</th>
				<td>${student.studentName}</td>
				<td>${student.fatherName}</td>
				<td>${student.motherName}</td>
				<td>${student.mobileNumber}</td>
				<td>${student.aadhar}</td>
				<td>${student.address}</td>
				<td>${student.classCode}</td>
				<td>
					<a href="${request.getContextPath()}/EditStudent.jsp">Edit </a>
				</td>
				
			</tr>
			
			
		</c:forEach>
		
	</table>
	
	</div>
</body>
</html>