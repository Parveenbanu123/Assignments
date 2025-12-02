<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
	
	<%-- <%Exception ex=(Exception)request.getAttribute("err"); %>
	 <%= ex.getMessage() %>  --%>
	 <%out.println("Exception is: "+ exception.getMessage()); %> 
</body>
</html>