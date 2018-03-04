<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<spring:url value="/jsp/editVeterinar/" var="editVet" />
	<form:form action="${editVet}" method="post" modelAttribute="editVet">
		<spring:bind path="id">
			<form:hidden path="id" />
		</spring:bind>
		<spring:bind path="name">
			<form:input path="name" type="text" />
		</spring:bind>
		<spring:bind path="lastName">
			<form:input path="lastName" type="text" />
		</spring:bind>
		<spring:bind path="telephone">
			<form:input path="telephone" type="text" />
		</spring:bind>
		<input type="submit" value="Update" />
	</form:form>
<input type="button" id ="dajSveUsluge" value="Usluge"/>
<div id = "usluge">
</div>

<script type="text/javascript">
jQuery(document).ready(function(){
	$('#dajSveUsluge').on('click',function(){
		var id = $('#id').val();
		var data = {
			url : "/vet-amb/uslugeForVet/" +id,//with uslugeForVet we aim at veterinarController /uslugeForVet/ annotation for getAllUsluge 
			type: "GET",
			dataType: "json",
			success: function(dataReceived){
				var div = $('#usluge');
				for(val of dataReceived){
					div.append("<div>");
					div.append("<div>id: " + val.id + "</div>");
					div.append("<div>naziv: " + val.naziv + "</div>");
					div.append("<div>cena: " + val.cena + "</div>");
					div.append("</div>")
				}
			},
			error: function(data){
				console.log(data);
				
			}
		};
		$.ajax(data)
	});
});
</script>
</body>
</html>