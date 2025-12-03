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
<c:import url="success.jsp"></c:import>

<c:forEach var="n" begin="1" end="10">
	<%-- <c:out value="${n }"></c:out> --%>
	${n }
</c:forEach>
<br>
<c:forTokens var="item" items="Parveen,Banu,Saranya,Ashik,Wahith" delims=",">
${item }<br>
</c:forTokens>
</body>
</html>