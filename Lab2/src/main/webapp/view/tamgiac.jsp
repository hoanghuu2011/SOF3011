<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tam giac</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="col-sm-6 mx-auto">
		<h2>
			<a class="text-danger">Hình tam giác</a>
		</h2>
		<form action="/Lab2/tamgiac" method="post">
			<div class="form-group">
				<input class="form-control" name="a" placeholder="Cạnh a?">
			</div>

			<div class="form-group">
				<input class="form-control" name="b" placeholder="Cạnh b?">
			</div>

			<div class="form-group">
				<input class="form-control" name="c" placeholder="Cạnh c?">
			</div>
            <hr>
			<button formaction="/Lab2/dientich">Tinh dien tich</button>
			<button formaction="/Lab2/chuvi">Tinh chu vi</button>
		</form>
		<h3>${message}</h3>
	</div>
</body>
</html>