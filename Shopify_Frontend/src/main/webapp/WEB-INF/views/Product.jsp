<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<html>
<head>
<title>Product</title>
</head>
<body>
<br>
<br>
	<div class="container">
		<div class="col-md-12 col-sm-8 ">
		<security:authorize access="hasRole('ROLE_ADMIN')">
			<form action="<c:url value='/insertProduct'/>" method="post" align="center" >
				<table class="table table-bordered " align="center">
					<tr bgcolor="#87ceeb">
						<td colspan="2"><h3>Insert Product</h3></td>
					</tr>
					<tr>
						<td>Product Name</td>
						<td><input type="text" class="form-control"
							name="productName" /></td>
					</tr>
					<tr>
						<td>Product Description</td>
						<td><textarea row="5" cols="50" class="form-control"
								name="description"></textarea></td>
					</tr>
					<tr>
						<td>Stock</td>
						<td><input type="text" class="form-control" name="quantity"></td>
					</tr>
					<tr>
						<td>Price</td>
						<td><input type="text" class="form-control" name="price"></td>
					</tr>
					<tr>
						<td colspan="2">
							<center>
								<input type="submit" value="SUBMIT" class="btn btn-info">
							</center>
						</td>
					</tr>

				</table>
				</form></security:authorize></div>
		<div class="col-md-12  col-sm-8">
			<table class="table table-striped  table-bordered ">
				<thead bgcolor="#87ceeb">
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Description</th>
					<th>Stock</th>
					<th>Price</th>
					<th colspan='2'>Action</th>
				</thead>
				<c:forEach items="${productList }" var="product">
					<tr>
						<td>${product.productID}</td>
						<td>${product.productName}</td>
						<td>${product.description }</td>
						<td>${product.quantity}</td>
						<td>${product.price}</td>
<security:authorize access="hasRole('ROLE_ADMIN')">
						<td><a href="${pageContext.request.contextPath}/editProduct/${product.productID}"
							class="btn btn-info">Edit</a></td>

						<td><a href="${pageContext.request.contextPath}/deleteProduct/${product.productID}"
							class="btn btn-danger">Delete</a></td>
</security:authorize>
<security:authorize access="hasRole('ROLE_USER')">						
		
						    <td><a href="${pageContext.request.contextPath}/buyProduct/${product.productID}"
							class="btn btn-info">Buy Now</a></td>
							
					</security:authorize>
					</tr>

				</c:forEach>
			</table>
			<a href="${pageContext.request.contextPath}/" class="btn btn-info">Back</a>
		</div>
	</div>
</body>
</html>
<%@include file="Footer.jsp"%>