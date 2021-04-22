<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<div align="center">
		<p>Operação realizada com sucesso!</p>
			
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