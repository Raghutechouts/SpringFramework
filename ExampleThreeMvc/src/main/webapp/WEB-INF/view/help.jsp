<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>this is help page</h1>
	<h2>my name is ${name}</h2>
	<c:forEach var="idNo" items="${id}">
	<h5>${idNo}</h5>
	</c:forEach>
</body>
</html>