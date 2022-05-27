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
	<h1>Enter your login details</h1>
	<form:form method="POST" modelAttribute="user" action="doLogin" >
		 Enter Email:      <form:input path="email"/>
		<form:errors path="email" cssStyle="color: #ff0000;" />
		<br>
		<br>
         Enter a password:  <form:password path="password" showPassword="true" />
		<form:errors path="password" cssStyle="color: #ff0000;" />
		<br>
		<br>

		<input type="submit" value="LOG IN" />
	</form:form>
</body>
</html>