<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Image Shop</title>
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<!-- HEADER AREA -->
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<!-- MENU AREA -->
	<%@ include file="/WEB-INF/views/common/menu.jsp"%>
	
	<div>
		<h2><spring:message code="common.cannotSetupAdmin" /></h2>
		<a href="/"><spring:message code="action.home" /></a>
	</div>

	<hr>
	<!-- FOOTER AREA -->
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>