<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h2>Adicionar Cliente</h2>
		<br/>
		<form action="clientServlet" method="POST">
			<label for="name">Name</label>
			<input id="name" name="name" type="text" >
			<br/>
			<br/>
			<label for="email">E-mail</label>
			<input id="email" name="email" type="email">
			<br/>
			<br/>
			<label for="phone">Phone</label>
			<input id="phone" name="phone" type="text">
			<br/>
			<br/>
			
			<input type="submit" value="Add" id="btn-add">
			
			<input  type="submit" value ="Return" id="btn-return" onClick="Return()">
			<script type="text/javascript">
				function Return ()	{
					location.href="list.jsp";
				}
			</script>
			
			
			
		</form>
	</div>
</body>
</html>