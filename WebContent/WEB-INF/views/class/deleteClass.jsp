<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Class Data</title>

	<script type="text/javascript">
		function validator(){
			var code=document.getElementById("code");
			
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
		
	<h1>Class Deletion Form </h1>
	<form onsubmit="return validator()" action="<%=request.getContextPath() %>/DeleteClass" method= "post">
	<table style="with=100%">
	<tr>
		<td>Class Code </td>
		<td><input id="code" type="text" name="ClassCode" placeholder="Class code"> </td>
	</tr>
	</table>
	
		<input type="submit" name="SUBMIT">
		</form>
		</div>

</body>
</html>