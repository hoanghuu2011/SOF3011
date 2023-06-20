<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!doctype html>
<html lang="en">
<head>
<title>Bai3-4</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="/JAVA4_Lab4/css/style.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
</head>
<body>
	<div class="container">
		<header class="row">
			<div class="col-sm-9 pt-4 ">
				<h1 style="color: red;">Online Shopping Mall</h1>
			</div>
			<div class="col-sm-3 p-2">
				<img src="/JAVA4_Lab4/img/logo.png" alt="">
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
				<div class="card mt-2 p-2" style="margin-left: 1px">
					<div class="row" style="margin-top: 10px;">
						<div class="col-sm-4 mt-3">
							<img src="/Lab4/img/${item.image}" style="width: 250px;">
						</div>
						<div class="col-sm-7 mt-3 ml-4" style="margin-top: 10px; font-size: 16px;">
							<ul style="line-height: 35px;">
								<li >Tên hàng:<a class="badge-pill badge-info">${item.name}</a></li>
								<li>Danh mục: Laptop</li>
								<li>Giá gốc: <b><strike>${item.price}</strike></b></li>
								<li>Giá mới: <b><c:set var="newprice" value="${item.price*(1-item.discount)}" /> <fmt:formatNumber
											value="${newprice}" /></b></li>
								<li>Mức giá: <b><c:choose>
											<c:when test="${newprice < 1000}">Giá thấp</c:when>
											<c:when test="${newprice > 1000}"><a class="badge-pill badge-danger text-white">Giá cao</a></c:when>
											<c:otherwise>Bình thường</c:otherwise>
										</c:choose></b>
								</li>
							</ul>
						</div>
					</div>
					<div class="row mt-5 ">
						<div class="col-sm-12 mt-5 mb-1">
							<h3>Hàng liên quan</h3>
							<hr />
							<a href="/Lab4/danhsach"><img class="img-thumbnail mr-3 mb-2" src="/Lab4/img/mac.jpg"
								style="width: 100px; height: 90px;">
								</a>
								<a href="/Lab4/danhsach"><img class="img-thumbnail mr-3 mb-2"
								src="/Lab4/img/mac.jpg" style="width: 100px; height: 90px;">
								</a><a href="/Lab4/danhsach"><img
								class="img-thumbnail mr-3 mb-2" src="/Lab4/img/mac.jpg" style="width: 100px; height: 90px;"></a>
								<a
								href="/Lab4/danhsach"><img class="img-thumbnail mr-3 mb-2" src="/Lab4/img/mac.jpg"
								style="width: 100px; height: 90px;"></a>
								<a href="/Lab4/danhsach"><img class="img-thumbnail mr-3 mb-2"
								src="/Lab4/img/mac.jpg" style="width: 100px; height: 90px;"></a>
								<a href="/Lab4/danhsach"><img
								class="img-thumbnail mr-3 mb-2" src="/Lab4/img/mac.jpg" style="width: 100px; height: 90px;"></a>
								<a
								href="/Lab4/danhsach"><img class="img-thumbnail mr-3  mb-2" src="/Lab4/img/mac.jpg"
								style="width: 100px; height: 90px;"></a>
						</div>
					</div>
				</div>
			</article>
			<aside class="col-sm-3">
				<%@include file="/user/login.jsp"%>
				<%@include file="/user/category.jsp"%>
			</aside>
		</div>
		<footer class="mt-2">
			<div class="card text-center">
				<div class="card-body">
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