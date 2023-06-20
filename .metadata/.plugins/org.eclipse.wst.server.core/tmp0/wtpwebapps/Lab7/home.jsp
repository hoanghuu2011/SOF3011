
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<base href="/Lab7/">
</head>
<body>
	<c:choose>
		<c:when test="${empty sessionScope.user}">
			<p>Welcome you, please<a href="${pageContext.request.contextPath}/account/sign-in">Đăng nhập tại đây </a></p>
		</c:when>
		<c:otherwise>
			<h1>Xin chào, <c:out value="${user.fullname}" /> (ID đăng nhập: <c:out value="${user.userId}" />)!</h1>
		<a href="${pageContext.request.contextPath}/account/sign-out">Đăng xuất</a>
			<c:if test="${sessionScope.user.admin}">
           <a href="${pageContext.request.contextPath}/account/admin">Quản trị dành cho admin</a>
           
            </c:if>
		</c:otherwise>
	</c:choose>
	<p>${message}</p>
</body>
</html>
  