<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.util.*, br.com.bank.dao.*, br.com.bank.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>

	<div align="center">
		<c:if test="${user != null}">
			<p>Seja bem vindo, Sr. <strong>${user}</strong>  </p>
		</c:if>
	</div>
	
	<div align="center">
		<h2>CLIENTES CADASTRADOS</h2>
		<jsp:useBean id="dao" class="br.com.bank.dao.ClientDaoImpl"></jsp:useBean>
		<table border = "1">
		<tr>
			<td><h5>ID</h5></td>
			<td><h5>NOME</h5></td>
			<td><h5>EMAIL</h5></td>
			<td><h5>PHONE</h5></td>

		</tr>
			
		<c:forEach var="client" items="${dao.all}">
			<tr>
				<td>${client.id}</td>
				<td>${client.name}</td>
				<td>${client.email}</td>
				<td>${client.phone}</td>
			</tr>
		</c:forEach>
		</table>
	<br/>
	</div>
	
	<div align="center">
	
	<input  type="submit" value ="Add" id="btn-add" onClick="Add()">
	<script type="text/javascript">
		function Add ()	{
			location.href="add_client.jsp"
		}
	</script>
	
	<input  type="submit" value="Delete" id="btn-delete" onClick="Delete()">
	<script type="text/javascript">
		function Delete()	{
			location.href="delete.jsp"
		}
	</script>
		
	</div>
	
	
</body>
</html>