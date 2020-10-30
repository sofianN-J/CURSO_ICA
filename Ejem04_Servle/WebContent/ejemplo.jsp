<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EJEMPLO JSP</title>
</head>
<body>
	<h1>EJEMPLO JSP: ES UN SERVLET</h1>
	<%! String crearOL (int v) {
		String ol = "<OL>";
		int i = v;
		while (i > 0) {
			ol += "<li>cuenta atras " + i + "/ 5 </li>";
			i--;
		}
		return ol + "</ol>";
	}
		//EL HR ES UNA LINEA HORIZONRAL
	%>
	<HR/>
	<% 
	Date d = new Date();
	if(d.getSeconds() % 2 == 0) { %>
		<p style="background-color: red"></p>	
	<% } else { %>
		<p style="background-color: blue"></p>
		<%= crearOL(d.getSeconds()) %>
		<%-- ESTE COMENTARIO ES COMO EL /**/ NO SE ENCIA AL CLIENTE --%>
		<!-- PERO ESTE COMENTARIO SI SE ENVIA -->
	<HR/> 
	<% } %> 
</body>
</html>