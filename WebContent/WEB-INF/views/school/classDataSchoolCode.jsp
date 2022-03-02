<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class List</title>
</head>
<body>
	
	<table border = "1">
		<tr>
			
			<th>Class Code      </th>
			<th>Class Name      </th>
			<th>Section         </th>
			<th>Class Teacher   </th>
			<th>Co-Class Teacher</th>
			<th>School Code     </th>
			
			
		</tr>
		
		<c:forEach items = "${list}" var = "classs">
			<tr>
				<td>${classs.classCode}</td>
				<td>${classs.className}</td>
				<td>${classs.section}</td>
				<td>${classs.classTeacher}</td>
				<td>${classs.coClassTeacher}</td>
				<td>${classs.schoolCode}</td>
				
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>