<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

 <div class="d-flex justify-content-center align-content-center">
    <div class="row">
      <div class="col-sm-6">
		<h1>요청 데이터 처리 애너테이션</h1>
		<a href="register/hong">register/hong</a>
		<br>
		<a href="register/hong/100">register/hong/100</a>
		<br>
		<form action="/register01" method="post">
			userId: <input type="text" name="userId" value="hong"><br>
			password: <input type="text" name="password" value="1234"><br>
			coin: <input type="text" name="coin" value="100"><br> <input
				type="submit" value="register01">
		</form>
		<form action="/register02" method="post">
			userId: <input type="text" name="userId" value="hong"><br>
			password: <input type="text" name="password" value="1234"><br>
			coin: <input type="text" name="coin" value="100"><br> <input
				type="submit" value="register02">
		</form>
		</div>
	 	<div class="col-sm-6">
			<h1>요청 처리 자바빈즈</h1>
			<form action="/registerbeans01" method="post">
				userId: <input type="text" name="userId" value="hong"><br>
				password: <input type="text" name="password" value="1234"><br>
				UserName: <input type="text" name="userName" value="혼진경"><br>
				coin: <input type="text" name="coin" value="100"><br> <input
					type="submit" value="registerbeans01">
			</form>
			<form action="/registerbeans02" method="post">
				userId: <input type="text" name="userId" value="hong"><br>
				password: <input type="text" name="password" value="1234"><br>
				UserName: <input type="text" name="userName" value="혼진경"><br>
				coin: <input type="text" name="coin" value="100"><br> <input
					type="submit" value="registerbeans02">
			</form>
			<form action="/registerdate" method="post">
				userId: <input type="text" name="userId" value="hong"><br>
				password: <input type="text" name="password" value="1234"><br>
				UserName: <input type="text" name="dateOfBorth" value="20231229"><br>
				 <input	type="submit" value="registerbeans02">
			</form>
		</div>
	</div>
	
	 <div class="row">
      <div class="col-sm-6">
      
      
      </div>
      <div class="col-sm-6">
      
      
      </div>
     </div>
	
	<!-- row 여유 부분 -->
	 <div class="row">
      <div class="col-sm-6">
      
      
      </div>
      <div class="col-sm-6">
      
      
      </div>
     </div>
</div>
	
	
	
</body>
</html>