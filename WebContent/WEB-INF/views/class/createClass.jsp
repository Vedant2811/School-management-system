<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Input</title>

	<script type="text/javascript">
		function validator(){
			var classCode=document.getElementById("cCode");
			var className=document.getElementById("name");
			var section=document.getElementById("sec");
			var classTeacher=document.getElementById("cTeach");
			var coClassTeacher=document.getElementById("ccTeach");
			var schoolCode=document.getElementById("sCode");
			
			if(classCode.value.trim()==""){
				alert("Class Code is missing");
				return false;
			}
			else if(className.value.trim()==""){
				alert("Class/ Standrad is missing");
				return false;
			}
			else if(section.value.trim()==""){
				alert("Section is missing");
				return false;
			}
			else if(classTeacher.value.trim()==""){
				alert("Class Teacher name is missing");
				return false;
			}
			else if(coClassTeacher.value.trim()==""){
				alert("Co-Class Teacher name  is missing");
				return false;
			}
			else if(schoolCode.value.trim()==""){
				alert("School Code is missing");
				return false;
			}
			else{
				return true;
			}
		}
	</script>

</head>
<body>

	<div align = "center">
		<h1>Student Creation Form </h1>
	<form onsubmit="return validator()" action="<%=request.getContextPath() %>/CreateClass" method= "post">
	<table style="with=80%">
	<tr>
		<td>Class Code </td>
		<td><input id="cCode" type="text" name="ClassCode" placeholder="Class code"> </td>
	</tr>
	
	<tr>
		<td>Class Name </td>
		<td><input id="name" type="text" name="ClassName" placeholder="Class"> </td>
	</tr>
	
	<tr>
		<td>Section </td>
		<td><input id="sec" type="text" name="Section" placeholder="Section"> </td>
	</tr>
	
	<tr>
		<td>Class Teacher </td>
		<td><input id="cTeach" type="text" name="ClassTeacher" placeholder="Class Teacher name"> </td>
	</tr>
	
	<tr>
		<td>Co-Class Teacher </td>
		<td><input id="ccTeach" type="text" name="CoClassTeacher" placeholder="Co-Class Teacher name"> </td>
	</tr>
	
	<tr>
		<td>School Code </td>
		<td><input id="sCode" type="text" name="SchoolCode" placeholder="School Code"> </td>
	</tr>
	</table>
	
	<button type="submit">Submit</button>
	
	</form>
	</div>

</body>
</html>