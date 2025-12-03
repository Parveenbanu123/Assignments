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
	<c:set var="name" value="Parveen"></c:set>
	<c:out value="${name}"></c:out>
	<c:if test="${name=='Parveen'}" >
	<h1>Name is Parveen</h1>
	</c:if>
</body>
</html>