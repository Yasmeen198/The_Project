<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp"%>
<html>
<head>
<title>UpdateProduct</title>
</head>
<body>
	<div class="container">
		<div class="col-md-12  col-md-8">
			<form action="${pageContext.request.contextPath}/updateProduct" method="post">
				<table class="table table-bordered table-responsive" align="center">
					<tr bgcolor="87ceeb">
						<td align="center" colspan="2"><h3>Product Details</h3></td>
					</tr>
					<tr>
						<td>Product Id</td>
						<td><input type="text" name="productID" class="form-control"
							value="${product.productID}" readonly /></td>
					</tr>
					<tr>
						<td>Product Name</td>
						<td><input type="text" name="productName"
							class="form-control" value="${product.productName}" /></td>
					</tr>
					<tr>
						<td>Product Description</td>
						<td><input type="text" name="description"
							class="form-control" value="${product.description}" /></td>
					</tr>
					<tr>
						<td>Stock</td>
						<td><input type="text" name="quantity" class="form-control"
							value="${product.quantity}" /></td>
					</tr>
					<tr>
						<td>Price</td>
						<td><input type="text" name="price" class="form-control"
							value="${product.price}" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Product Update" class="btn btn-info" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>