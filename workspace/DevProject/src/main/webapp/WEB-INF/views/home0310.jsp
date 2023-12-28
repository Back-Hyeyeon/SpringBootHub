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
	<table border="1">
		<tr>
			<td>\${empty member}</td>
			<td>${empty member}</td>
		</tr>
		<tr>
			<td>\${empty member.hobbyList}</td>
			<td>${empty member.hobbyList}</td>
		</tr>
	</table>

</body>
</html>