<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List form</title>

	<script type="text/javascript">
		function validator(){
			var code=documentElementById("code");
			if(code.value.trim()==""){
				alert("Cannot access without any Class code, please fill the class code");
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
	
	<h1>Student Fetching Form </h1>
	<form onsubmit="return validator()" action="<%=request.getContextPath() %>/FetchClass" method= "post">
	<table style="with=80%">
	<tr>
		<td>Class Code </td>
		<td><input id="code" type="text" name="classCode"> </td>
	</tr>
	</table>
	
			<button type="submit">Submit</button>
	
	
	</form>
	</div>
	
</body>
</html>