<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:setLocale value="en_In"/>
<fmt:formatNumber value="123456.789" type="currency"></fmt:formatNumber>
<br>
<fmt:setLocale value="en_US"/>
<fmt:formatNumber value="123456.789" type="currency"></fmt:formatNumber>
<br>
<fmt:formatNumber value="123456.778907" type="number" minFractionDigits="2" maxFractionDigits="3"></fmt:formatNumber>
<br>
<fmt:formatNumber value="0.7865" type="percent"></fmt:formatNumber>
<br>
<fmt:formatNumber value="123456787689" pattern="#,##0.00"></fmt:formatNumber>
<br>
<fmt:setLocale value="en_In"/>
<fmt:formatNumber value="1234567890" type="" pattern="##,##,###.0" groupingUsed="true"></fmt:formatNumber>
</body>
</html>