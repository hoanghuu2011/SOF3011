<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<title>FPT Polytechnic</title>
</head>
<body>
	<div class="container col-6 mt-2">
		<div class="row p-3 m-0 border rounded bg-light">
			<div class="col-sm-12">
				<h2 class="p-3 bg-danger text-white rounded">Gửi mailL</h2>
				<form action="SendMailServlet" method="post">
					<div class="form-group">
						<label>To:</label> <input type="text" class="form-control" name="to" placeholder="Enter Email">
					</div>
					<div class="form-group">
						<label>Tiêu đề :</label> <input type="text" class="form-control" name="subject" placeholder="Enter Subject">
					</div>
					<div class="form-group">
						<label for="content">Nội dung:</label>
						<textarea class="form-control" rows="3" name="content"></textarea>
					</div>
					<button type="submit" class="btn btn-primary">Send</button>
					<button type="reset" class="btn btn-danger">Cancel</button>
				</form>
				<br>
				<mark class="p-0">${message}</mark>
			</div>
		</div>
	</div>
</body>
</html>