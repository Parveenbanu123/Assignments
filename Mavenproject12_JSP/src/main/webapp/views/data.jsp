<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DATA</title>
</head>
<body>
<h3>Employee Name:<%= request.getParameter("ename") %></h3>
<h3>Employee ID:<%= request.getParameter("eid") %></h3>	
<h3>Designation:<%= request.getParameter("desg") %></h3>
<h3>Company Name:<%= application.getAttribute("cname") %></h3>
<h3>Location:<%= application.getAttribute("location") %></h3>
</body>
</html>