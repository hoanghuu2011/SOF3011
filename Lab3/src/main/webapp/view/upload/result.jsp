<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Upload</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<ul>
				<li>Hình ảnh:${image}<br /> 
				<img src="uploads/${image}" height="400px">
				</li>
				<li>Tài liệu:${document}<br /> 
				<a href="uploads/${document}">Kíck vào đây để tải về</a>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>