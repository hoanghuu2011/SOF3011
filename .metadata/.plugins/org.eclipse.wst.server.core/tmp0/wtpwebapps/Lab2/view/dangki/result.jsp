<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Dang ki</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="col-6 mx-auto">
		<h2>THÔNG TIN ĐĂNG KÝ</h2>
		<br>
		<div class="row">
			<div class="col-6 row pl-3 pb-2">
				<ul class="">
					<li>Tên đăng nhập: <b>${param.username}</b></li>
					<li>Mật khẩu: <b>${param.password}</b></li>
					<li>Giới tính: <b>${gender}</b></li>
					<li>Tình trạng hôn nhân: <b>${married}</b></li>
					<li>Quốc tịch: <b>${param.country}</b></li>
					<li>Sở thích: <b>${hobbies}</b></li>
					<li>Ghi chú: <b>${param.notes}</b></li>
				</ul>
			</div>
		</div>
	</div>

</body>
</html>