<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to my first Spring Web Application</h1>
	<h1>Hello ${username}</h1>
	<form method="post" id="userForm" onsubmit="return info()">
		<input type="submit" value="userInfo">
	</form>
	<form action="userList">
		<input type="submit" value="userList">
	</form>
	<script type="text/javascript">
		function info(){
			let f=document.getElementById("userForm");
			//console.log(f);
			//let uname="";
			//let r=document.getElementById("role").value;
			f.action="userInfo/${username}";
			return true;
		}
		
	</script>
	
	
	
</body>
</html>