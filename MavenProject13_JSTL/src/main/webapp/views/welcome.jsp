<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value=" before removing ${applicationScope.cname }"></c:out>
	<c:remove var="cname" scope="application"/>
	
	<c:out value="After removing ${applicationScope.cname }"></c:out>
</body>
</html>