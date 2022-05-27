<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fill this form to Register</h1>
	<form:form method="POST" modelAttribute="admin" action="doLogin">
		 Enter Email:      <form:input path="mail"/>
		<form:errors path="mail" cssStyle="color: #ff0000;" />
		<br>
		<br>
         Enter a password:  <form:password path="pass" showPassword="true" />
		<form:errors path="pass" cssStyle="color: #ff0000;" />
		<br>
		<br>

		<input type="submit" value="LOG IN" />
	</form:form>
</body>
</html>