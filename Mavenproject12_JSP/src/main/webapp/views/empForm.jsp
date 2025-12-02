<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
	<h1>Employee Form</h1>
	<form action="data.jsp">
		<label>Employee Id</label> <input type="number" name="eid"> 
		<label>Employee Name</label><input type="text" name="ename"> 
		<label>Designation</label> <input type="text" name="desg">
		<input type="submit" value="submit">
	</form>
	
	<% application.setAttribute("cname","Mphasis"); 
		application.setAttribute("location","Bangalore");
	%>
	
</body>
</html>