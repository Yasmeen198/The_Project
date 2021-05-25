<%@ page language="java" contentType="text/html" %>
<%@include file="CommonHeader.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<html>
<body>

<c:if test="${pageContext.request.userPrincipal.name == null}">
		<%@include file="MyCarousel.jsp" %>
		</c:if>
		
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h3 align="justify">Welcome: ${pageContext.request.userPrincipal.name}</h3>
			
			<strong><a href="<c:url value="/perform_logout" />" class="btn btn-info">Logout</a></strong>
			<br>
			<br>
			<security:authorize access="hasRole('ROLE_ADMIN')">
				<h1>Admin Page</h1>
				
				<%@ include file="/WEB-INF/views/AdminHome.jsp" %>
						
			</security:authorize>
			<security:authorize access="hasRole('ROLE_USER')">
				<h1>USER Page</h1>
				
				
				<a href="showProduct" class="btn btn-info">Shop Now!!</a>
						
			</security:authorize>
			</c:if>
</body>
</html>
<%@include file="Footer.jsp" %>