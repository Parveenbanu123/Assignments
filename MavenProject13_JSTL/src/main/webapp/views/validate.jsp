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
<c:set var="uname" value="${param.uname}"></c:set>
	<c:set var="pwd" value="${param.pwd}"></c:set>
	<c:choose>
	<c:when test="${uname=='Parveen' && pwd=='12345' }">
	<c:redirect url="success.jsp"></c:redirect>
	</c:when>
	<c:otherwise>
	<h1 style="color:red">Invalid Credentials</h1>
	</c:otherwise>
	</c:choose>
</body>
</html>