<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fill this form to Register</h1>
	<form:form method="POST" modelAttribute="student" action="doRegister">
		 Enter Name:      <form:input path="name" />
		<form:errors path="name" cssStyle="color: #ff0000;" />
		<br>
		<br>
         Enter branch:  <form:input path="branch" />
		<form:errors path="branch" cssStyle="color: #ff0000;" />
		<br>
		<br>
 		 Enter age:  <form:input path="age" />
		<form:errors path="age" cssStyle="color: #ff0000;" />
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>