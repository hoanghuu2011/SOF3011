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
<div class="col">
				<h1>Thông tin đã được đăng kí</h1>
				<ul>
				  <li>
				     <img src="uploads/${staff.imageName }" class="img-fluid" width="400px"/>
				  </li>
                  <li>Ten dang nhap: ${staff.username}</li>
                  <li>Mat khau: ${staff.password}</li>
                  <li>Gioi tinh: ${staff.gender ? 'Nam': 'Nu'}</li>
                  <li>Lap gia dinh: ${staff.married ? 'Da lap gia dinh': 'chua lap gia dinh'}</li>
                  <li>Quoc tich: ${staff.nationality}</li>
                  <li>So thich: ${staff.favorites}</li>
                   <li>Ghi chu: ${staff.note}</li>
				</ul>
			</div>
</body>
</html>