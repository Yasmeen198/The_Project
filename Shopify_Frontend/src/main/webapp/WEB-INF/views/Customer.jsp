<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<html>
<head><title>Customer</title></head>
<body>
<div class="container">
	<div class="col-md-12  col-sm-8">
		<table class="table table-striped  table-bordered ">
		<thead bgcolor="#87ceeb">
			<th>User ID</th>
			<th>UserName</th>
			<th>Email</th>
			<th>Mobile Number</th>
			<th>Role</th>
			<th>Address</th>
		
			<th colspan='2'>Action</th>
		</thead>
	<c:forEach items="${allCustomers}" var="customer">
		<tr>
			<td>${customer.userId}</td>
			<td>${customer.username}</td>
			<td>${customer.emailID}</td>
			<td>${customer.mobileNumber}</td>
			<td>${customer.role}</td>
			<td>${customer.customerAddress}</td>
			
			<td><a href="mailto:${customer.emailID}" class="btn btn-info">Contact</a></td>
			
			<td><a href="${pageContext.request.contextPath}/updateCustomer/${customer.userId}" class="btn btn-info">Update Customer</a></td>
		</tr>
	</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/" class="btn btn-info">Back</a>
	</div>
</div>
</body>
</html>
<%@include file="Footer.jsp" %>