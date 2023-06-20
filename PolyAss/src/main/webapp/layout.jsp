<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>${page.title}</title>
<base href="/PolyAss/" />
<!-- style -->
<!-- <link rel="stylesheet" href="./assets/css/bootstrap.css" type="text/css" /> -->
<link rel="stylesheet" href="./css1/theme.css" type="text/css" /> 
<!-- <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.css"> -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="./fontawesome-free-6.2.1-web/css/all.min.css">
</head>
<style>
#footer {
  position: fixed;
  bottom: 0;
  width: 100%;
  text-align: center;
  padding: 10px;
  font-weight: 600;
}

</style>
<body >
	<header>
		<div class="navbar  bg-info">
			<!-- brand -->
			<a href="Homepages" class="navbar-brand"> <span
				class="text-white">POLYPHIM</span>
				 <img src="./images/logo.png">
			</a>
			<ul class="nav navbar-menu order-1 order-lg-2">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle"
					class="nav-link d-flex align-items-center px-2 text-color"
					data-toggle="dropdown"> <c:if test="${ ! isLogin }">
							<span>Tài Khoản </span>
						</c:if> 
						<c:if test="${isLogin }">
							<span style="color: white; font-weight: bold;"><c:out value="${fullname}" /></span>
						</c:if>
				</a>
					<div
						class="dropdown-menu dropdown-menu-right w mt-3 animate fadeIn">
						<c:if test="${ ! isLogin }">
							<a class="dropdown-item" href="Login">Login</a>
							<a class="dropdown-item" href="ForgotpasswordServlet">Forgot
								Password</a>
							<a class="dropdown-item" href="Registration">Registration</a>
						</c:if>
						<c:if test="${isLogin}">
							<a class="dropdown-item" href="Logoff">Logoff</a>
							<a class="dropdown-item" href="ChangepasswordServlet">Change
								Password</a>
							<a class="dropdown-item" href="EditprofileServlet">Edit
								profile</a>
						</c:if>
					</div></li>
			</ul>
		</div>
	</header>
	<div class="layout-row flex px-3">
		<div id="aside" class="page-sidenav no-shrink bg-white ">
			<div class="sidenav h-100 modal-dialog bg-white b-r">
				<!-- sidenav top -->
				<!-- Flex nav content -->
				<div class="flex scrollable hover">
					<div class="nav-border b-primary" data-nav>
						<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
							<li class="nav-item"><a class="nav-link" href="Homepages">
									<i class="fa-solid fa-house-fire fa-flip fa-lg" style="color: #f01919;"></i>Home
							</a></li>
							
							<li class="nav-item"><a class="nav-link" href="Homepages">
								<i class="fa-solid fa-mountain-sun fa-spin fa-spin-reverse fa-lg"></i>About us
							</a></li>
							<li class="nav-item"><a class="nav-link" href="Homepages">
									<i class="fa fa-id-card fa-lg" aria-hidden="true"></i> Contact us
							</a></li>
							<li class="nav-item"><a class="nav-link"
								href="FavotireServlet"> <i class="fa fa-comments fa-lg"
									aria-hidden="true"></i> My Favorites
							</a></li>

							<!-- admin -->
							<c:if test="${admin}">
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#" id="dropdownId"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false"> <i class="fa-solid fa-gears fa-spin fa-lg" style="color: #f01919;"></i> ADMIN
							</a>
							
								<div class="dropdown-menu" aria-labelledby="dropdownId">
									<a class="dropdown-item" href="/PolyAss/admin/users">Users
										Management</a> <a class="dropdown-item"
										href="/PolyAss/admin/video">Videos Management</a> <a
										class="dropdown-item" href="/PolyAss/ReportsManagementServlet">Reports
										Management</a>
								</div>
								
								</li>
								</c:if>

						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="flex">
			<div id="content" class="">
						<section>
					<jsp:include page="${page.contentUrl}"></jsp:include>
				</section>
					</div>
			<footer id="footer">

				<div class="border-top" style="padding-right: 500px">
					<strong style="font-weight: 600;">FPT Polytechnic &copy;
						2023. Assignment Java4.</strong>
				</div>
			</footer>
		</div>
	</div>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
  </script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
  </script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
  </script>	
  <c:if test="${not empty page.scriptUrl}">
<jsp:include page="${page.scriptUrl}"></jsp:include>
	</c:if>
	
</body>
</html>
