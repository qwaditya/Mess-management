<!DOCTYPE html>
<html lang="en" class="csstransforms csstransforms3d csstransitions">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="webthemez">
  <title>MESS MANAGEMENT</title>
  <!-- core CSS -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/font-awesome.min.css" rel="stylesheet">
  <link href="css/animate.min.css" rel="stylesheet">
  <link href="css/prettyPhoto.css" rel="stylesheet">
  <link href="css/styles.css" rel="stylesheet">
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <![endif]-->
  <link rel="shortcut icon" href="">
</head>

<body id="home" >

<header id="header">
  <nav id="main-nav" class="navbar navbar-default navbar-fixed-top" role="banner">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="home.jsp"><span style="font-size: 35px;color: #FFF;line-height: 1em;font-weight: bold;">MESS MANAGEMENT SYSTEM</span></a>
      </div>
       <div class="collapse navbar-collapse navbar-right">
        <ul class="nav navbar-nav">
         <li class="scroll"><a href="home22.jsp">Admin</a></li>
          <li class="scroll"><a href="about.jsp">Daily Expense</a></li>
          <li class="scroll"><a href="features12.jsp">Supplier</a></li>
          <li class="scroll"><a href="services.jsp">Kitchen Stock</a></li>
          <li class="scroll"><a href="display">Stores</a></li>
          <li class="scroll"><a href="contact.jsp">Reports</a></li>
        </ul>
      </div>
    </div>
    <!--/.container-->
  </nav>
  <!--/nav-->
 </header>
<!--/header-->
<div class="about-us-container"></div>
  <div class="container">
      <br>
      <br>
      <br>
      <br>
    <div class="section-header">
      <h2 class="section-title wow fadeInDown animated"
          style="visibility: visible; animation-name: fadeInDown; -webkit-animation-name: fadeInDown;">ABOUT EXPENSE DETAILS</h2>

      <p class="wow fadeInDown animated"
         style="visibility: visible; animation-name: fadeInDown; -webkit-animation-name: fadeInDown;">KEEPS THE EXPENSE DETAILS
      ABOUT THE TRANSACTIONS MADE</p>
    </div>

    <div class="row">
      <div class="col-sm-6 wow fadeInLeft animated"
           style="visibility: visible; animation-name: fadeInLeft; -webkit-animation-name: fadeInLeft;">
        <img class="img-responsive" src="demo/about2.png" alt="">
      </div>

      <div class="col-sm-6 wow fadeInRight animated"
           style="visibility: visible; animation-name: fadeInRight; -webkit-animation-name: fadeInRight;">
        <h3 class="column-title">Expense details</h3>

        <form action="daily.jsp" method="post">
                    
                <table border="0">
                     <tbody>
                        <tr>
                            <td><h5>Expense Date</h5></td>
                            <td><h5><input type="text" name="NewName" value="" requred/></h5></td>
                        </tr>
                        <tr>
                            <td><h5>Expense Type</h5></td>
                            <td><h5><input type="text" name="EmailAddress" value="" required=/></h5></td>
                        </tr>
                         <tr>
                            <td><h5>Amount</h5></td>
                            <td><h5><input type="text" name="Nationality" value="" requred/></h5></td>
                        </tr>
                        
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Submit"/></td>
                            
                        </tr>
                             
                   
                    </tbody>
                </table>
                   
</form>
        <form name="form"  action="Expense">
                    
                <table border="0">
                     <tbody>
                        
                        <tr>
                            <td></td>
                            <td><input type="submit" value="ExpenseHistory" name="cmdSubmit" /></td>
                            
                        </tr>
                             
                   
                    </tbody>
                </table>
                   
</form>

      </div>
    </div>
  </div>
<!--/#about-->

<!--/#bottom-->

<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/mousescroll.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/jquery.isotope.min.js"></script>
<script src="js/jquery.inview.min.js"></script>
<script src="js/wow.min.js"></script>
<script src="js/custom-scripts.js"></script>

</body>
</html>