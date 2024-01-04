<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Image Shop</title>
</head>
<body>
	<!-- Header Area -->
	<%@ include file="/WEB-INF/views/common/header.jsp" %>
	<!-- Menu Area -->
	<%@ include file="/WEB-INF/views/common/menu.jsp" %>
	

	<!-- Content Area -->
	<h1>
		<!-- 메시지 프로퍼티 파일로부터 메시지 내용을 읽어온다. -->
		<spring:message code="common.homeWelcome" />
	</h1>
	<P>${serverTime}</P>
	
	<!-- Footer Area -->
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
	
</body>
</html>