<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save veterinar</title>
</head>
<body>
<spring:url value="/jsp/saveVeterinar" var = "saveVet"/>
<form:form action="${saveVet}" method = "post" modelAttribute="vet">
	<spring:bind path="name">
		<form:input path="name" type="text"/>
	</spring:bind>
	<spring:bind path="lastName">
		<form:input path="lastName" type="text"/>
	</spring:bind>
	<spring:bind path="telephone">
		<form:input path="telephone" type="text"/>
	</spring:bind>
	<input type = "submit" value="Save"/> <!-- ako stavimo form:input 
	onda baca error According to the TLD or the tag file, attribute path is mandatory for tag input -->
</form:form>
</body>
</html>