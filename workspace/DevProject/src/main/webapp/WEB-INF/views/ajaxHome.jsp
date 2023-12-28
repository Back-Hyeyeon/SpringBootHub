<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//이벤트 설정1 putBtn 누르면 작업한다.
		$("#putBtn").on("click", function() {
			//변수(입력태그객체)를 가져온다
			let boardNo = $("#boardNo");
			let title = $("#title");
			let content = $('#content');
			let writer = $('#writer');

			//입력태그 객체의 별류 값을 가지고 온다.
			let boardNoVal = boardNo.val();
			let titleVal = title.val();
			let contentVal = content.val();
			let writerVal = writer.val();

			//전송할 객체를 만든다.
			let boardObject = {
				boardNo : boardNoVal,
				title : titleVal,
				content : contentVal,
				writer : writerVal
			};

			//비동기식 처리방식을 요청한다.
			alert("dd");
			$.ajax({
				type : "put",
				url : "/board/" + boardNoVal,
				data : JSON.stringify(boardObject),
				contentType : "application/json; charset=utf-8",
				success : function(result) {
					console.log("result: " + result);
					if (result === "SUCCESS") {

						alert("SUCCESS");
					}
				}
			});
		});

		//이벤트 설정2 putBtn 누르면 작업한다.
		$("#getBtn").on("click", function() {
			//변수(입력태그객체)를 가져온다
			let boardNo = $("#boardNo");
			let title = $("#title");
			let content = $('#content');
			let writer = $('#writer');

			//입력태그 객체의 별류 값을 가지고 온다.
			let boardNoVal = boardNo.val();
			let titleVal = title.val();
			let contentVal = content.val();
			let writerVal = writer.val();

			//전송할 객체를 만든다.
			let boardObject = {
				boardNo : boardNoVal,
				title : titleVal,
				content : contentVal,
				writer : writerVal
			};

			//비동기식 처리방식을 요청한다.
			
			$.ajax({
				type : "get",
				url : "/board/" + boardNoVal,
				headers: {"Accept" : "application/json"},
				/* data : JSON.stringify(boardObject), */
				contentType : "application/json; charset=utf-8",
				success : function(result) {
					console.log("result: " + result);
					if (result != null) {
						alert(JSON.stringify(result));
					}
				}
			});
		});

		//이벤트 설정 putHeaderBtn 누르면 작업한다.
		$("putHeaderBtn").on("click", function() {

		});

	});
</script>
</head>
<body>
	<h1>Ajax Home</h1>

	<form>
		boardNo: <input type="text" name="boardNo" value="" id="boardNo"><br>
		title: <input type="text" name="title" value="" id="title"><br>
		content: <input type="text" name="content" value="" id="content"><br>
		writer: <input type="text" name="writer" value="" id="writer"><br>
	</form>

	<div>
		<button id="putBtn">수정(put)</button>
		<button id="getBtn">요청insert(get)</button>
		<button id="putHeaderBtn">수정(put with header)</button>
	</div>
</body>
</html>