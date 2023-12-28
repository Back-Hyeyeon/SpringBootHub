<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Info.</h1>
	<p>
		member.userId :
		<c:out value="${member.userId}" />
	</p>
	<p>member.password : ${member.password}.</p>
	<p>member.userName : ${member.userName}.</p>
	<p>member.email : ${member.email}.</p>
	<p>member.dateOfBirth : ${member.dateOfBirth}.</p>
</body>
</html>