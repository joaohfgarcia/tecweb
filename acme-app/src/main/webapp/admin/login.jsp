<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html>
<head>
	<title>Login Page</title>
   
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		   
	   
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	
	<link href="${pageContext.request.contextPath}/assets/css/login.css" rel="stylesheet" type="text/css">
	
	
	<style type="text/css">

		/* Made with love by Mutiullah Samim*/
		@import url('https://fonts.googleapis.com/css?family=Numans');
		
		html, body {
			background-image:
				url('https://getwallpapers.com/wallpaper/full/c/1/1/872506-new-white-wallpaper-background-1920x1200-for-samsung.jpg');
			background-size: cover;
			background-repeat: no-repeat;
			height: 100%;
			font-family: 'Numans', sans-serif;
		}
		
		.container {
			height: 100%;
			align-content: center;
		}
		
		.card {
			height: 300px;
			margin-top: auto;
			margin-bottom: auto;
			width: 400px;
			background-color: rgba(0, 0, 0, 0.2) !important;
		}
		
		.card-header h3 {
			color: white;
		}
		
		.social_icon span {
			font-size: 60px;
			margin-left: 10px;
			color: #9900cc;
		}
		
		.social_icon span:hover {
			color: gray;
			cursor: pointer;
		}	
		
		.social_icon {
			position: absolute;
			right: 20px;
			top: -45px;
		}
		
		.input-group-prepend span {
			width: 50px;
			background-color: #9900cc;
			color: white;
			border: 0 !important;
		}
		
		input:focus {
			outline: 0 0 0 0 !important;
			box-shadow: 0 0 0 0 !important;
		}
		
		.remember {
			color: white;
		}
		
		.remember input {
			width: 20px;
			height: 20px;
			margin-left: 15px;
			margin-right: 5px;
		}
		
		.login_btn {
			color: white;
			background-color: #9900cc;
			width: 100px;
		}
		
		.login_btn:hover {
			color: white;
			background-color: gray;
		}
		
		.links {
			color: white;
		}
		
		.links a {
			margin-left: 4px;
		}
</style>
	
	
</head>
<body>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Acme App</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-github"></i></span>
					<span><i class="fab fa-linkedin-in"></i></span>
					<span><i class="fab fa-whatsapp"></i></span>
					
				</div>
			</div>
			<div class="card-body">
				<form method="post" action="LoginServlet">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="username">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Lembre-me
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>