<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="card shadow mb-4" style="width: 100%;">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách người dùng</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Tên đăng nhập</th>
						<th>Mật khẩu</th>
						<th>Nhớ người dùng</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${items}">
						<tr>
							<td>${item.username}</td>
							<td>${item.password}</td>
							<td>${item.remember ? 'Yes' : 'No'}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>