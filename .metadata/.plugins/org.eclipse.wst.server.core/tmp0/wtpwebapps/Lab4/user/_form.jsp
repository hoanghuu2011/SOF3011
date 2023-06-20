<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="card shadow mb-3" style="width: 100%;">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Quản lý người dùng</h6>
	</div>
	<div class="card-body">
		<form action="/Lab4/user" method="post">
			<div class="form-group">
				<label>Username:</label> <input type="text" class="form-control" placeholder="Tên đăng nhập" name="username"
					value="${form.username}">
			</div>
			<div class="form-group">
				<label>Password:</label> <input type="password" class="form-control" placeholder="Mật khẩu" name="password"
					value="${form.password}">
			</div>
			<div class="form-group">
				<div class="custom-control custom-checkbox">
					<input type="checkbox" class="custom-control-input" id="customCheck" name="remember"
						${form.remember ? 'checked' : ''}> <label class="custom-control-label" for="customCheck">Remember
						me?</label>
				</div>
			</div>
			<button type="submit" class="btn btn-primary btn-user btn-block">Create</button>
		</form>
		<div class="mt-3">
			<mark class="p-0">${message}</mark>
		</div>
	</div>
</div>