<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Negocia��o de Mercadorias</title>
<%@ include file="snipets/imports.jsp"%>
<jsp:include page="snipets/cabecalho.html"></jsp:include>
</head>
<body>
 <jsp:include page="WEB-INF/jsp/${page eq null ? 'cadastrarMercadoria.jsp' : page}"></jsp:include>
</body>
</html>