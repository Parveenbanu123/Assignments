<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>

<html>
<body>
<!-- jsp expression-->
 <h2><%= "Hello World!" %></h2>

<h3>current time:<%=new java.util.Date() %> </h3>

<!-- jsp declaration -->
<%! public int add(){
	int a=56;
	int b=78;
	return a+b;
}
%>

<% ArrayList alist=new ArrayList();
	alist.add(12);
	alist.add("Parveen");
	out.println(alist);
%>

<% out.println(add()); %>

<%-- <%@include file="welcome.jsp" %> --%>

</body>
</html>
