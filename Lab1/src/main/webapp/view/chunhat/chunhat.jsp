<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Bai6</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="col-sm-6 mx-auto">
		<h2>Hình chữ nhật</h2>
		<br>
		<form action="/Lab1/chunhat"method="post">
			<div class="form-group">
				<label>chieu dai</label> <input class="form-control" type="text" name="dai">
			</div>
			<div class="form-group">
				<label>chieu rong</label> <input class="form-control" type="text" name="rong">
			</div>
			<button class="btn btn-primary btn-lg">Tinh</button>
		</form>
	</div>
</body>
</html>