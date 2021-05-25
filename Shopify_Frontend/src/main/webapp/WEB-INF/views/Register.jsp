<%@ page language="java" contentType="text/html"%>
<%@include file="CommonHeader.jsp"%>
<html>
<head><title>Register</title></head>
<body>
<div class="container">
            <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/registerUser" method="post">
                <h2 align="center">Registration</h2>
                <div class="form-group">
                    <label for="customerName" class="col-sm-3 control-label">Full Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="customerName"  name="customerName" placeholder="Name" class="form-control" autofocus required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userName" class="col-sm-3 control-label">UserName</label>
                    <div class="col-sm-9">
					<input type="text" id="username" class="form-control" name="username" placeholder="UserName"  required>     
					               </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" name="password" placeholder="Password" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="mobileNumber" class="col-sm-3 control-label">Mobile Number </label>
                    <div class="col-sm-9">
                        <input type="text" id="mobileNumber" placeholder="Mobile Number" class="form-control" name= "mobileNumber">
                    </div>
                </div>            
               
                <div class="form-group">
                    <label for="emailID" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="text" id="emailID" placeholder="Email" class="form-control" name="emailID">
                    </div>
                </div>
                
                <div class="form-group">
                        <label for="customerAddress" class="col-sm-3 control-label">Address </label>
                    <div class="col-sm-9">
                        <input type="text" id="customerAddress" placeholder="Address" name="customerAddress" class="form-control">
                    </div>
                </div>
                
            
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                         <button type="submit" name="submit" class="btn btn-primary btn-block">Register</button>
         
                    </div>
                </div>

</form>
<!-- /form -->
</div> <!-- ./container -->
</body>
</html>
<%@include file="Footer.jsp"%>