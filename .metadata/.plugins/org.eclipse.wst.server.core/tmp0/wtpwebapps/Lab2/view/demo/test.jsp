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
	<main class="container">
		<header class="row">
			<div class="col">
				<h1>Đăng kí</h1>
			</div>
		</header>
		<section class="row">
			<div class="col-7">
				<div class="row">
					<div class="col">
						<form action="/Lab2/demo" method="post">
							<div class="form-group">
								<label for="username">Tên đăng nhập:</label> <input type="text"
									id="username" name="username" class="form-control" />
							</div>
							<div class="form-group">
								<label for="password">Mat khau:</label> <input type="password"
									id="password" name="password" class="form-control" />
							</div>
							<div class="form-group">
								<label for="genderM">Gioi tinh:</label>
								<div class="form-check form-check-inline">
									<input type="radio" class="form-check-input" id="genderM"
										name="gender" /> <label for="genderM">Nam</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="radio" class="form-check-input" id="genderF"
										name="gender" /> <label for="genderF">Nữ</label>
								</div>
							</div>
							<div class="form-group">
								<div class="form-check">
									<input type="checkbox" class="form-check-input" name="married"
										id="married" /> <label for="married">Ban da co gia
										dinh chua!!</label>
								</div>
							</div>
							<div class="form-group">
								<label for="nationality">Quoc tich:</label> <select
									name="nationality" id="nationality" class="form-control">
									<option value="vi">Viet Nam</option>
									<option value="us">My</option>
									<option value="jp">Nhat ban</option>
								</select>
							</div>
							<div class="form-group">
								<label for="favorites">So thich:</label>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check-input" id="favorites"
										name="favorites" value="Read" /> <label for="favorites">Doc
										sach</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check-input" id="favorites"
										name="favorites" value="Music" /> <label for="favorites">Am
										nhac</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check-input" id="favorites"
										name="favorites" value="Tour" /> <label for="favorites">Du
										lich</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check-input" id="favorites"
										name="favorites" value="others" /> <label for="favorites">Khac</label>
								</div>
							</div>
							<div class="form-group">
								<label for="note">Ghi chu</label>
								<textarea name="note" id="note" rows="3" class="form-control"></textarea>
							</div>
							<br>
							<button type="submit" class="btn btn-danger">Dang ki</button>

						</form>
					</div>
				</div>
			</div>
			<div class="col-5">
				<h1>Thông tin đã được đăng kí</h1>
				<ul>
                  <li>Ten dang nhap: ${username}</li>
                  <li>Mat khau: ${password}</li>
                  <li>Gioi tinh: ${gender}</li>
                  <li>Lap gia dinh: ${married}</li>
                  <li>Quoc tich: ${nationality}</li>
                  <li>So thich: ${favorites}</li>
                   <li>Ghi chu: ${note}</li>
				</ul>
			</div>
		</section>
	</main>
</body>
</html>