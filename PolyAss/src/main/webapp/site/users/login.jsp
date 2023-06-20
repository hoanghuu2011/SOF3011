<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="offset-4 col-4 mt-4">
	<form action="" method="post">
		<div class="card">
			<div class="card-header">
				<b>Login to page</b>
			</div>
			<div class="card-body">
				<jsp:include page="/common/inform.jsp"></jsp:include>
				<div class="form-group">
					<label for="username">Username</label> <input type="text"
						class="form-control" name="username" id="username"
						aria-describedby="usernameHid" placeholder=""> <small
						id="usernameHid" class="form-text text-muted">Username is
						required</small>
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" name="password" id="password"
						aria-describedby="passwordHid" placeholder=""> <small
						id="passwordHid" class="form-text text-muted">Password is
						required</small>
				</div>
				<div class="form-check form-check-inline">
					<label><input type="checkbox" class="form-check-input"
						name="remember">Remember me</label>
				</div>
				<div>
				Do not have an account? <a href="Registration" class="text-primary">Sign up</a>
			</div>
			</div>
			<div class="card-footer text-muted">
				<button class="btn btn-primary">Login</button>
			</div>
			
			<jsp:include page="/common/inform.jsp"></jsp:include>

		</div>
	</form>
</div>