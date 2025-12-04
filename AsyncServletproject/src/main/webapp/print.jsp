<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
    String: <input id="input" type="text" name="input" > 
    <button type="button" onclick="print(event)">Reverse</button>
    <br>
</form> 
<div id="output"></div>
<script>
async function print(event){
	let input = document.getElementById("input").value;
	let resp = await fetch("ReverseServlet", {
        method: "POST",
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
        body: "input=" + encodeURIComponent(input) 
    });

    let text = await resp.text();
    console.log("Server Response:", text); 
    document.getElementById("output").innerHTML = text;
}
</script>
</body>
</html>