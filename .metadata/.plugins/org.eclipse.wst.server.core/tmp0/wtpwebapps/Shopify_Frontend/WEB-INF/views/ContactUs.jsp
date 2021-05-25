<%@include file="CommonHeader.jsp"%>
<!DOCTYPE html>
<html>
<title>ContactUs</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {margin:0;}

.icon-bar {
  position: fixed;
  top: 50%;
  -webkit-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
}

.icon-bar a {
  display: block;
  text-align: center;
  padding: 16px;
  transition: all 0.3s ease;
  color: white;
  font-size: 20px;
}

.icon-bar a:hover {
  background-color: #000;
}

.facebook {
  background: #3B5998;
  color: white;
}

.twitter {
  background: #55ACEE;
  color: white;
}

.google {
  background: #dd4b39;
  color: white;
}

.linkedin {
  background: #007bb5;
  color: white;
}

.youtube {
  background: #bb0000;
  color: white;
}

.content {
  margin-left: 75px;
  font-size: 30px;
}
</style>
<body>

<div class="icon-bar">
  <a href="https://www.facebook.com/" class="facebook"><i class="fa fa-facebook"></i></a> 
  <a href="https://twitter.com/?lang=en" class="twitter"><i class="fa fa-twitter"></i></a> 
  <a href="https://myaccount.google.com/intro/profile" class="google"><i class="fa fa-google"></i></a> 
  <a href="https://in.linkedin.com/" class="linkedin"><i class="fa fa-linkedin"></i></a>
  <a href="https://www.youtube.com/" class="youtube"><i class="fa fa-youtube"></i></a> 
</div>

<div class="content">
<br>
<br>
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
          <a href="mailto:namyas03@gmail.com"><img alt="Mail" src="images/mail.jpg"/>
          <div class="caption">
             <p>Mail us here!!</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="https://goo.gl/maps/Zr3enuHbfqDWiZFi8"><img alt="Address" src="images/address.jpg"/>
          <div class="caption">
            <p>Click to see our help center</p>
          </div>
        </a>
      </div>
    </div>
   
</div>
</div>
</body>
</html> 
<%@include file="Footer.jsp"%>