<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="col mt-4">
	<jsp:include page="/common/inform.jsp"></jsp:include>
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item" role="presentation">
			<button class="nav-link active" id="videoEditing-tab"
				data-toggle="tab" data-target="#videoEditing" type="button"
				role="tab" aria-controls="videoEditing" aria-selected="true">Video
				Editing</button>
		</li>
		<li class="nav-item" role="presentation">
			<button class="nav-link" id="videoList-tab" data-toggle="tab"
				data-target="#videoList" type="button" role="tab"
				aria-controls="videoList" aria-selected="false">Video List</button>
		</li>
	</ul>

	<div class="tab-content" id="myTabContent">
		<div class="tab-pane fade show active" id="videoEditing"
			role="tabpanel" aria-labelledby="videoEditing-tab">
			<form action="" method="post" enctype="multipart/form-data">
				<div class="card">
					<div class="card-body">
						<div class="row">
							<div class="col-3">
								<div class="border p-3">
									<img src="${video.poster !=null?video.poster: 'images/sieuanhhung.jpg'}" alt="" class="img-thumbnail">
									<div class="input-group mb-3 mt-3">
										<div class="input-group-prepend">
											<span class="input-group-text">Upload</span>
										</div>
										<div class="custom-file">
											<input type="file" class="custom-file-input" name="cover" /><label
												for="cover">Choose File</label>
										</div>
									</div>
								</div>
							</div>
							<div class="col-9">
								<div class="form-group">
									<label for="youtubeId">Youtube ID</label> <input type="text"
										class="form-control" name="videoId" id="youtubeId" value="${video.videoId}"
										aria-describedby="youtubeIdHid" placeholder="Youtube ID">
									<small id="youtubeIdHid" class="form-text text-muted">Youtube
										id is required</small>
								</div>
								<div class="form-group">
									<label for="vidoeTitle">Video Title</label> <input type="text"
										class="form-control" name="title" id="vidoeTitle" value="${video.title}"
										aria-describedby="videoTitle" placeholder="Video Title">
									<small id="videoTitle" class="form-text text-muted">Video
										title is required</small>
								</div>
								<div class="form-group">
									<label for="viewCount">View Count</label> <input type="text"
										class="form-control" name="views" id="viewCount" value="${video.views}"
										aria-describedby="viewCountHid" placeholder="View Count">
									<small id="viewCountHid" class="form-text text-muted">View
										count is requrired</small>
								</div>
								<div class="from-check form-check-inline">
									<label><input type="radio" class="form-chck-input"
										name="active" id="status" value="true"  ${video.active? 'checked':''}>Active</label> <label><input
										type="radio" class="form-chck-input" name="active" id="status"
										value="false"  ${! video.active? 'checked':''}>Inactive</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="description">${video.description}</label>
								<textarea name="description" id="description" cols="30" rows="4"
									class="form-control"></textarea>
							</div>
							<div class="col">
								<label>Code</label> <input name="code" value="${video.code}" class="form-control"></input>
							</div>
						</div>
						
					</div>
					<div class="card-footer text-muted">
						<button class="btn btn-primary" formaction="create">create</button>
						<button class="btn btn-warning" formaction="admin/update">Update</button>
						<button class="btn btn-danger" formaction="admin/delete">Delete</button>
						<button class="btn btn-info" formaction="admin/reset">Reset</button>
					</div>
				</div>
			</form>
		</div>
		<div class="tab-pane fade" id="videoList" role="tabpanel" aria-labelledby="videoList-tab">
			<table class="table table-stripe">
				<tr>
					<td>ID</td>
					<td>Video Title</td>
					<td>View Count</td>
					<td>Status</td>
					<td>&nbsp;</td>
				</tr>
				<c:forEach var="item" items="${videos}">
					<tr>
						<td>${item.videoId}</td>
						<td>${item.title}</td>
						<td>${item.views}</td>
						<td>${item.active? 'Active': 'Deactive'}</td>
						<td><a href="admin/edit?videoId=${item.videoId}">Edit</a>
							<a href="admin/delete?videoId=${item.videoId}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>