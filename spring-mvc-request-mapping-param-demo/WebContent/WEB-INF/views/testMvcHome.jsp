<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<<<<<<< HEAD
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
=======
>>>>>>> 3642404875667e9d5f6da185606630ec679f9049
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC Test Home</title>
<style>
h2 {
	color: #082984;
	text-align: center;
}
</style>
</head>
<body>
<h2>MVC Test Home</h2>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div style="text-align: center">
<a href="${contextPath}/requestMappingAndParamDemo/home" style="font-size: 20px">Click here to go to the test bed for @RequestMaping and @RequestParam</a>
</div>

</body>
</html>