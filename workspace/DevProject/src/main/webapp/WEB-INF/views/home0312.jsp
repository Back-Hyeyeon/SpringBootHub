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
			<td>\${empty memberMap}</td>
			<!-- empty 내용 비어있는 확인. 비어있으면 true 안비어있으면  false 나옴 -->
			<td>${empty memberMap}</td>
		</tr>
	</table>
</body>
</html>