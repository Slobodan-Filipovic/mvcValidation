<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>${pageTitle}</title>
</head>
<body>
	<!--${ourFirstVariable}  -->
	<table class="table">
		<thead>
			<tr>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Email</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${veterinars}" var="item">
				<tr>
					<td>${item.name}</td>
					<td>${item.lastName}</td>
					<td>${item.telephone}</td>
					<td>
						<!--   <input type = "submit" value="Delete"/>--> <form:form
							action="/vet-amb/jsp/deleteVeterinar/${item.id}">
							<!-- modelAttribute="deleteVet" method = "post" -->
							<input type="submit" value="Delete" />
						</form:form>
					</td>
					<td> 
					 
					 <a href="/vet-amb/jsp/editVeterinar/${item.id}">Edit</a> 
							<td>
						
						<!-- <a href="/vet-amb/jsp/editVeterinar/">Edit</a> 
						 -->
						<!-- <form:form
							action="/vet-amb/jsp/editVeterinar/${item.id}">
							<input type="submit" value="Edit" />
						</form:form> -->
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- 
<c:forEach items = "${veterinars}" var="item">
	${item.name}
	${item.lastName}
	${item.telephone}
	<input type = "submit" value="Delete"/>
	<br />
</c:forEach> -->

</body>
</html>