<%@page import="br.ed.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lista de Cliente</h2><br>
	<%
		List<Cliente> clientes = 
			(List<Cliente>) request.getAttribute("clientes");
		
		for (Cliente c : clientes){
			out.print(c.getNome());
			out.print("<br>");
		}
	%>
	<a href="cliente.html">Voltar</a>
</body>
</html>