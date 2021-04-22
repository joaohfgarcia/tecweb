<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Login</title>
</head>
<body>
	<div align="center">
		<c:if test="${error != null}">
			<p><strong>${error}</strong></p>
		</c:if>
		
		<br></br>
		<input  type="submit" value ="Return" id="btn-return-login" onClick="Return()">
		<script type="text/javascript">
			function Return (){
			location.href="login.jsp"
			}
		</script>
	</div>
</body>
</html>