<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form modelAttribute="user" action="add-user" method="post">
		<f:input path="username"/>
		<f:input path="email"/>
		<f:input path="password"/>
		<input type="submit" value="save">
	</f:form>
</body>
</html>