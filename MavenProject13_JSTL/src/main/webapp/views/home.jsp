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
	 <%-- <% String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		out.println(uname+" "+pwd);
	%>
	<c:if test="${param.uname=='Parveen' && param.pwd=='12345' }">
		<h1>Authenticated Successfully</h1>
		<% response.sendRedirect("success.jsp?uname="+uname); %>
	</c:if>  --%>
	
	<c:set var="uname" value="${param.uname}"></c:set>
	<c:set var="pwd" value="${param.pwd}"></c:set>
	
	<c:if test="${uname=='Parveen' && pwd=='12345' }">
		<h1>Authenticated Successfully</h1>
		<c:redirect url="success.jsp"></c:redirect>
	</c:if>
	
	
	 <c:if test="${uname!='Parveen' || pwd!='12345' }">
		<h1>Authentication failed</h1>
	</c:if> 
</body>
</html>