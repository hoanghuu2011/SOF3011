<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="padding">
	<div class="heading py-2 d-flex ">
		<div>
			<div class="text-muted text-sm sr-item"></div>
			<h5 class="text-highlight sr-item">My Favorite</h5>
		</div>
		<span class="flex"></span>
	</div>
	<div class="row">
		<c:forEach var="item" items="${listVideo}">
			<div class="col-4 col-sm-4 col-md-3 pb-3" data-category="all">
				<div class="list-item">
					<div class="media">
						<%-- <a href="detail?videoId=${item.videoId}" class="ajax media-content"
							style="background-image: url(${ empty item.poster ? 'images/laptop.jpg' : item.poster}"></a>
 --%>							<a href="admin/detail?videoId=${item.videoId}" class="media-body">
				          <img src="${ empty item.poster ? 'images/sieuanhhung.jpg': item.poster }" width="90%"> </a>
						<div class="media-action "></div>
					</div>
					<div class="list-content">
						<div class="list-body">
							<p style="display: flex; justify-content: space-between;">
								<span><a href="admin/detail?videoId=${item.videoId}" class="list-title title ajax h-1x">${item.title}</a></span>
								
							</p>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>