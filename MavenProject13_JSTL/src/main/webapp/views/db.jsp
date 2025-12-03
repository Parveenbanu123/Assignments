<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Database Connectivity"></c:out>
	<sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mysql_proj" user="root" password="root@39"></sql:setDataSource>
	<c:if test="${ds!=null }">Connected</c:if>
	
	<sql:query var="rs" dataSource="${ds }">
		select * from customer;
	</sql:query>
	<br>
	<c:forEach var="item" items="${rs.rows }">
		CustomerId: <c:out value="${item.customerId }"></c:out><br>
		CustomerName: <c:out value="${item.customerName }"></c:out><br>
		Address: <c:out value="${item.address }"></c:out><br>
		PhoneNumber: <c:out value="${item.phoneNumber }"></c:out><br>
		Email: <c:out value="${item.email }"></c:out><br>
		<br>
	<br>
	</c:forEach>
	
	 <!-- Inserting -->
	 
  <%-- <sql:update var="insert" dataSource="${ds}">
    INSERT INTO customer (customerId, customerName, address, phoneNumber, email)
    VALUES (1017, 'Sathis', 'Dharmapuri,Tamilnadu', '1234569087', 'sathis@example.com')
</sql:update>
<c:out value="${insert}" /> --%>  
  
  
  <!-- Deleting -->
  
  <%-- <sql:update var="delete" dataSource="${ds }">
  	delete from customer where customerId=1017
  </sql:update>
 <c:out value="${delete}" />  --%>
	
	
	<!-- Updating -->
	
	<%-- <sql:update var="update" dataSource="${ds }">
		update customer set phoneNumber="9988776655" where customerId=1017
	</sql:update>
	<c:out value="${update}" /> --%>
</body>
</html>