<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<div class="col-9">
	<div class="row p-2"style="width: 1100px;">
	    	<c:forEach var="item" items="${videos}">
		<div class="col-3 mt-2">
			<div class="card">
				<div class="card-body">
				 <a href="admin/detail?videoId=${item.videoId}">
				<img src="${ empty item.poster ? 'images/sieuanhhung.jpg': item.poster }" class="iframe-fluid" width="105%" height="230" alt=""  class="img-fluid"> 
				</a>
					<div class="row mt-2">
						<b class="mx-auto" style="font-weight: 400;">${item.title }</b>
					</div>
				</div>
			 <%-- <a href="LikeVideo?videoId=${item.videoId } "class="btn btn-warning">Like</a> 
				<a href="ShareVideo?videoId=${item.videoId }" class="btn btn-danger">Share</a> --%>
			</div>
			 <%--  <div class="card-footer">
					<a href="LikeVideo?videoId=${item.videoId } "class="btn btn-warning">Like</a> 
					<a href="ShareVideo?videoId=${item.videoId }" class="btn btn-danger">Share</a>
				</div>  --%>
		</div>
		</c:forEach>
	</div>
	<div class="row">
	
		<div class="col">
			<nav aria-label="Page navigation">
				<ul class="pagination justify-content-center">
					<li class="page-item disabled"><a class="page-link" href="#"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
							<span class="sr-only">Previous</span>
					</a></li>
					<li class="page-item active"><a class="page-link" href="#">1</a></li>
					<li class="page-item"><a class="page-link" href="#">2</a></li>
					<li class="page-item"><a class="page-link" href="#">3</a></li>
					<li class="page-item"><a class="page-link" href="#">...</a></li>
					<li class="page-item"><a class="page-link" href="#"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
							class="sr-only">Next</span>
					</a></li>
				</ul>
			</nav>
		</div>
	</div>
</div>
<!-- <div class="col-3">
	<div class="row mt-3 mb-3">
		<div class="col">
			<div class="card">
				<div class="card-header">
					<i class="fa fa-thumbs-up" aria-hidden="true"></i>Favorites
				</div>
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Laptop</li>
					<li class="list-group-item">Đoremon</li>
					<li class="list-group-item">Mixigaming</li>
					<li class="list-group-item">Bóng đá</li>
				</ul>
			</div>
		</div>
	</div>
</div> -->