<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<title>Bai1</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="css/style.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
</head>
<body>
	<div class="container">
		<header class="row">
			<div class="col-sm-9 pt-4 shopping-mall">
				<h1>Online Shopping Mall</h1>
			</div>
			<div class="col-sm-3 p-2">
				<img src="img/logo.png" alt="">
			</div>
		</header>
		 <nav class="navbar navbar-expand-lg navbar-dark bg-dark p-2">
			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav">
					<li class="nav-item active"><a class="nav-link" href="#"><i class="fas fa-home"></i> Trang chủ</a></li>
					<li class="nav-item"><a class="nav-link" href="#"><i class="fas fa-list"></i> Giới thiệu</a></li>
					<li class="nav-item"><a class="nav-link" href="#"><i class="fas fa-phone-alt"></i> Liên hệ</a></li>
					<li class="nav-item"><a class="nav-link" href="#"><i class="fas fa-envelope"></i> Góp ý</a></li>
					<li class="nav-item"><a class="nav-link" href="#"><i class="fas fa-question-circle"></i> Hỏi đáp</a></li>
				</ul>
			</div>
		</nav>
		<div class="row">
			<article class="col-sm-9">
				<div class="row mt-2" style="margin-left: 1px">
					<div class="card col-sm-4 bg-light mb-2">
						<jsp:include page="item.jsp">
							<jsp:param name="name" value="Macbook" />
							<jsp:param name="image" value="mac.jpg" />
						</jsp:include>
					</div>
					<div class="card col-sm-4 bg-light mb-2">
						<jsp:include page="item.jsp">
							<jsp:param name="name" value="Ipad mini" />
							<jsp:param name="image" value="ipad.png" />
						</jsp:include>
					</div>
					<div class="card col-sm-4 bg-light mb-2">
						<jsp:include page="item.jsp">
							<jsp:param name="name" value="Ipad pro]" />
							<jsp:param name="image" value="ipad2.jpg" />
						</jsp:include>
					</div>
				</div>
				<div class="row mt-2" style="margin-left: 1px">
					<div class="card col-sm-4 bg-light mb-2">
						<jsp:include page="item.jsp">
							<jsp:param name="name" value="Iphone 14 pro" />
							<jsp:param name="image" value="iphone.jpg" />
						</jsp:include>
					</div>
					<div class="card col-sm-4 bg-light mb-2">
						<jsp:include page="item.jsp">
							<jsp:param name="name" value="Hinh 5" />
							<jsp:param name="image" value="acer.jpg" />
						</jsp:include>
					</div>
					<div class="card col-sm-4 bg-light mb-2">
						<jsp:include page="item.jsp">
							<jsp:param name="name" value="Hinh 6" />
							<jsp:param name="image" value="mac.jpg" />
						</jsp:include>
					</div>
				</div>
			</article>
			<aside class="col-sm-3">
				<%@include file="login.jsp"%>
				<%@include file="category.jsp"%>
			</aside>
		</div>
		<footer>
			<div class="card text-center">
				<div class="card-body ">
					<h5 class="card-title pt-2">FPT Polytechnic &copy 2023. All rights reserved.</h5>
				</div>
			</div>
		</footer>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>