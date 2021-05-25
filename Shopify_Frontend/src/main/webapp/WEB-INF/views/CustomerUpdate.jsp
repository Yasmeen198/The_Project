<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="CommonHeader.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
	<div class="container">
		<div class="col-md-12  col-md-8">
			<form action="${pageContext.request.contextPath}/updateCustomer" method="post">
				<table class="table table-bordered table-responsive" align="center">
					<tr bgcolor="87ceeb">
						<td align="center" colspan="2"><h3>Customer Details</h3></td>
					</tr>
					<tr>
						<td>UserID</td>
						<td><input type="text" name="userId" class="form-control"
							value="${customer.userId}" readonly /></td>
					</tr>
					<tr>
						<td>Role</td>
						<td><input type="radio" name="role" 
							value="ROLE_USER" />Customer
							<input type="radio" name="role" 
							 value="ROLE_ADMIN" />Admin
							</td>
					</tr>
					<tr>
						<td>Status</td>
						<td><input type="radio" name="enabled" 
							value="true" />Enabled
							<input type="radio" name="enabled" 
							 value="false" />Disabled
							</td>
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