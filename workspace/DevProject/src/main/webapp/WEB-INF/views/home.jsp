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
	<h1>안녕 세상아</h1>
	<form action="/Board/register">
		<input type="submit" value="register(GET)">
	</form>
	<form action="/Board/register" method="post">
		<input type="submit" value="register(post)">
	</form>
	<form action="/Board/modify">
		<input type="submit" value="modify(GET)">
	</form>
	<form action="/Board/modify" method="post">
		<input type="submit" value="modify(post)">
	</form>
	<form action="/Board/remove" method="post">
		<input type="submit" value="remove(post)">
	</form>
	<form action="/Board/list">
		<input type="submit" value="list(GET)">
	</form>
</body>
</html>