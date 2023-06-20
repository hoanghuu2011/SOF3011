<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="offset-3 col-6">
				<form action="/Lab3/login" method="post">
					<div class="card">
						<div class="card">
							<div class="card-header">
								<h3>Trang Login</h3>
							</div>
							<div class="card-body">
								<div class="form-group">
									<label for="username">Username</label> <input type="text"
										class="form-control" name="username" id="username" />
								</div>
								<div class="form-group">
									<label for="password">Password</label> <input type="password"
										class="form-control" name="password" id="password" />
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check-input" id="remember"
										name="remember" /> <label for="remember"
										class="form-check-Label">Remember me</label>
								</div>

							</div>
							<div class="form-group">
								<i class="alert alert-danger">${message}</i>
							</div>
							<div class="card-footer">
								<input type="submit" class="btn btn-danger" value="Login" />
							</div>
						</div>
					</div>
					</from>
			
		</div>
	</div>
	</div>
</body>
</html>