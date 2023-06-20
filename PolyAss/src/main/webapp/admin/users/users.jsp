<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="col mt-4">
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item" role="presentation">
			<button class="nav-link active" id="videoEditing-tab"
				data-toggle="tab" data-target="#videoEditing" type="button"
				role="tab" aria-controls="videoEditing" aria-selected="true">User
				Editing</button>
		</li>
		<li class="nav-item" role="presentation">
			<button class="nav-link" id="videoList-tab" data-toggle="tab"
				data-target="#videoList" type="button" role="tab"
				aria-controls="videoList" aria-selected="false">User List</button>
		</li>
	</ul>

	<div class="tab-content" id="myTabContent">
		<div class="tab-pane fade show active" id="videoEditing"
			role="tabpanel" aria-labelledby="videoEditing-tab">
			<form action="" method="post">
				<div class="card">
					<div class="card-body">
						<jsp:include page="/common/inform.jsp"></jsp:include>
						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="username">Username</label> <input type="text"
										class="form-control" name="username" id="username"
										value="${user.username}" aria-describedby="usernameHid"
										placeholder="Username"> <small id="usernameHid"
										class="form-text text-muted">Username is required</small>
								</div>
								<div class="form-group">
									<label for="Fullname">Fullname</label> <input type="text"
										class="form-control" name="fullname" id="fullname"
										value="${user.fullname}" aria-describedby="fullnameHid"
										placeholder="Fullname"> <small id="fullnameHid"
										class="form-text text-muted">fullname is required</small>
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="password">Password</label> <input type="password"
										class="form-control" name="password" id="password"
										value="${user.password}" aria-describedby="passwordHid"
										placeholder="Password"> <small id="passwordHid"
										class="form-text text-muted">Password is required</small>
								</div>
								<div class="form-group">
									<label for="email">Email</label> <input type="email"
										class="form-control" name="email" id="email"
										value="${user.email}" aria-describedby="emailHid"
										placeholder="Email"> <small id="emailHid"
										class="form-text text-muted">Email is required</small>
								</div>

							</div>
							<div class="form-group">
								<label for="role">Role</label>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" name="admin"
										id="admin"  value="${admin }"<c:if test="${user.admin}">checked</c:if>>
									<label class="form-check-label" for="admin">Admin</label>
									
								</div>
								<div class="form-check">
								<input class="form-check-input" type="checkbox" name="admin"
										id="admin" value="${!admin }" <c:if test="${!user.admin}">checked</c:if>>
									<label class="form-check-label" for="admin">User</label>
								</div>
							</div>

						</div>
					</div>
					<div class="card-footer text-muted">
						<button class="btn btn-primary" formaction="admin/users/create">Create</button>
						<button class="btn btn-success" formaction="admin/users/update">Update</button>
						<button class="btn btn-danger" formaction="admin/users/delete">Delete</button>
						<button class="btn btn-warning" formaction="admin/users/reset">Reset</button>
					</div>
				</div>
			</form>
		</div>
		<div class="tab-pane fade" id="videoList" role="tabpanel"
			aria-labelledby="videoList-tab">
			<table class="table table-strip">
				<tr>
					<td>Username</td>
					<td>Fullname</td>
					<td>Email</td>
					<td>Role</td>
					<td>&nbsp;</td>
				</tr>
				<c:forEach var="item" items="${users}">
					<tr>
						<td>${item.username}</td>
						<td>${item.fullname}</td>
						<td>${item.email}</td>
						<td>${item.admin ? 'Admin' : 'User'}</td>
						<td><a href="admin/users/edit?username=${item.username}">Edit</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>

	</div>
</div>
