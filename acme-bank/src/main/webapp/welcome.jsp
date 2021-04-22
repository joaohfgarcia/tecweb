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
		<c:if test="${user != null}">
			<p>Seja bem vindo(a) Sr(a). <strong>${user}</strong>  </p>
		</c:if>
		
	<br></br>
	<input  type="submit" value ="Home" id="btn-home" onClick="Home()">
	<script type="text/javascript">
		function Home ()	{
			location.href="list.jsp";
		}
	</script>
	</div>
	
	
</body>
</html>