<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Application</h1>
	<form method="post" id="loginForm" onsubmit="return login()">
		
		<label>UserName</label>
		<input type="text" name="uname" id="uname">
		<br>
		<label>Password</label>
		<input type="password" name="pwd" id="pwd">
		<br>
		<label>Role</label>
		<select id="role">
			<option value="admin">Admin</option>
			<option value="user">User</option>
			<option value="manager">Manager</option>
		</select>
		<br>
		<input type="submit" value="login" >   
	</form>
	<script type="text/javascript">
		function login(){
			let f=document.getElementById("loginForm");
			let r=document.getElementById("role").value;
			f.action="home/"+r;
			return true;
		}
		
	
	</script>
</body>
</html>