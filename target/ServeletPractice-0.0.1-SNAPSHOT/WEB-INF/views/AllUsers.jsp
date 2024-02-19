<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.content{
	text-align:center;
}
</style>
</head>
<body>
<div class="content">
	<h1>All Users</h1>
	<p>${msg}</p>
	<c:forEach items="${users}" var="user">
    ${user.user_id}${user.username}${user.password}${user.salary}<br>
</c:forEach>
</div>
</body>
</html>