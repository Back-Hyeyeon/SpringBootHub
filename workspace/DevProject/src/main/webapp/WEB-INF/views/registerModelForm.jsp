<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>>@ModelAttribute 애너테이션</title>
</head>
<body>
	<h1>데이터 전달 화면</h1>
	<form action="/registerModelForm01" method="post">
		userId: <input type="text" name="userId" value=""><br>
		password: <input type="text" name="password" value=""><br>
		<input type="submit" value="registerModelForm01">
	</form>
</body>
</html>