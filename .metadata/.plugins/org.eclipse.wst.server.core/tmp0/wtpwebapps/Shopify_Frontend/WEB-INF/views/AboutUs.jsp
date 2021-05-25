<%@include file="CommonHeader.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>AboutUs</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Image Gallery</h2>
  <p>Faces of our vision</p>
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="images/ceo1.jpg" target="_blank">
          <img src="images/ceo1.jpg" alt="CEO" style="width:100%">
          <div class="caption">
             <p>Nameera</p>
            <p>C.E.O</p>
            <p>Contact at:nameera@gmail.com</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="images/ceo2.jpg" target="_blank">
          <img src="images/ceo2.jpg" alt="Nature" style="width:100%">
          <div class="caption">
             <p>Sheeraz</p>
            <p>Manager</p>
            <p>Contact at:sheeraz12@gmail.com</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="images/ceo3.jpg" target="_blank">
          <img src="images/ceo3.jpg" alt="Fjords" style="width:100%">
          <div class="caption">
            <p>John Doe</p>
            <p>Designer</p>
            <p>Contact at:doe.John@gmail.com</p>
          </div>
        </a>
      </div>
    </div>
  </div>
</div>

</body>
</html>
<%@include file="Footer.jsp"%>