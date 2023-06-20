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
	<div class="col-6 mx-auto mt-2">
		<div class="row">
			<form action="/Lab2/dangki" method="post">
				<div class="form-group text-center">
					<h2>
						<a class="text-white bg-danger">ĐĂNG KÝ TÀI KHOẢN</a>
					</h2>
				</div>
				<div class="form-group">
					<label>Tên đăng nhập:</label> <input type="text"
						class="form-control" name="username">
				</div>
				<div class="form-group">
					<label>Mật khẩu:</label> <input type="password"
						class="form-control" name="password">
				</div>
				<label>Giới tính:</label>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						value="true" checked="checked"> <label
						class="form-check-label">Nam</label>
				</div>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						value="false" value="option2"> <label
						class="form-check-label">Nữ</label>
				</div>
				
				<br>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="checkbox" name="married">
					<label class="form-check-label">Đã có gia đình?</label>
				</div>
				<div class="form-group">
					<label>Quốc tịch:</label> <select class="custom-select"
						name="country">
						<option value="VN" selected>Việt Nam</option>
						<option value="US">Mỹ</option>
						<option value="EN">Anh</option>
					</select>
				</div>
				<label>Sở thích:</label>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="checkbox" name="hobbies"
						value="Đọc sách"> <label class="form-check-label">Đọc
						sách</label>
				</div>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="checkbox" name="hobbies"
						value="Du lịch"> <label class="form-check-label">Du
						lịch</label>
				</div>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="checkbox" name="hobbies"
						value="Âm nhạc"> <label class="form-check-label">Âm
						nhạc</label>
				</div>
				<div class="form-group form-check-inline">
					<input class="form-check-input" type="checkbox" name="hobbies"
						value="Khác"> <label class="form-check-label">Khác</label>
				</div>
				<div class="form-group">
					<label>Ghi chú:</label>
					<textarea class="form-control" name="notes"></textarea>
				</div>
				<button class="btn btn-primary text-while">Đăng ký</button>
			</form>
		</div>
	</div>


</body>
</html>