<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Excluir Cadastro</title>
</head>
<body>
<div align ="center">
	<form action="deleteServlet" method="POST">
	<h2>Excluir Cadastro</h2>
	<input id="id" name="id" type="number" placeholder="Informe o id" >
	<input type="submit" value="Delete" id="btn-delete">
	</form>
	
	<br></br>
	<input  type="submit" value ="Return" id="btn-return" onClick="Return()">
	<script type="text/javascript">
		function Return ()	{
			location.href="list.jsp";
		}
	</script>
	
</div>

	
</body>
</html>