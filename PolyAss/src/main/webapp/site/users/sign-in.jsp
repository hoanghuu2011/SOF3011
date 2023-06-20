
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <base href="/PolyAss/" />
<!-- CSS -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/material-design-iconic-font/2.2.0/css/material-design-iconic-font.min.css">
</head>
<body>
	<div class="main">
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="img/signin.jpg">
						</figure>
						<a href="Registration" class="signup-image-link">Create an
							account</a>
					</div>
					<div class="card-body">
					<jsp:include page="/common/inform.jsp"></jsp:include>
						<h2 class="form-title">Sign In</h2>
						<form class="" method="post">
							<div class="form-group">
								<label><i class="zmdi zmdi-account material-icons-name"></i></label>
								<input type="text" class="form-control" name="username"
									id="username" aria-describedby="usernameHid" placeholder="">
								<small id="usernameHid" class="form-text text-muted">Username
									is required</small>
							</div>
							<div class="form-group">
								<label><i class="zmdi zmdi-lock"></i></label><input type="password"
									class="form-control" name="password" id="password"
									aria-describedby="passwordHid" placeholder=""> <small
									id="passwordHid" class="form-text text-muted">Password
									is required</small>
							</div>
							<div class="form-check form-check-inline">
								<div> <input  type="radio" class="form-check-input text-dark" name="remember">Remember me</div>
								
							</div>
							<%-- <div class="row p-2">
								<div class="col">
									<c:if test="${not empty message}">
										<div class="alert">${message}</div>
									</c:if>
									<c:if test="${not empty error}">
										<div class="alert">${error}</div>
									</c:if>
								</div>
							</div> --%>
							<div class="form-group form-button">
								<input type="submit" class="form-submit" />
							</div>
						
						</form>
						<div class="social-login">
							<span class="social-label">Or login with</span>
							<ul class="socials">
								<li><a><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a><i class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a><i class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>