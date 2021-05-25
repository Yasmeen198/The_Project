<%@ include file="CommonHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
</head>
<body>
<div class="container">
		<div class="col-md-12 col-sm-8 ">
			<form action="${pageContext.request.contextPath}/placeOrder" method="post" align="center" >
				<table class="table table-bordered " align="center">
					<tr bgcolor="#87ceeb">
						<td colspan="2"><h3>Order Details</h3></td>
					</tr>
					<tr>
						<td>UserName</td>
						<td><input type="text" class="form-control"
							name="username" /></td>
					</tr>
					<tr>
						<td>Mobile</td>
						<td><input type="text" class="form-control"
							name="mobileNumber" /></td>
					</tr>
					<tr>
						<td>Quantity</td>
						<td><input type="text" class="form-control" name="quantity"></td>
			
					</tr>
					<tr>
						<td>Shipping Address</td>
						<td><input type="text" class="form-control" name="shippingAddress"></td>
					</tr>
					<tr>
						<td>ProductID</td>
						<td><input type="text" class="form-control" name="productId" value="${product.productID}" ></td>
					</tr>
					<tr>
						<td colspan="2">
							<center>
								<input type="submit" value="SUBMIT" class="btn btn-info">
							</center>
						</td>
					</tr>

				</table>
				</form>
		</div>
	</div>
</body>
</html>
<%@include file="Footer.jsp"%>