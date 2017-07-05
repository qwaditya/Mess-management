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

<body id="home">

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
<div class="features"></div>
  <div class="container">
    <div class="section-header">
      <h2 class="section-title wow fadeInDown animated"
          style="visibility: visible; animation-name: fadeInDown; -webkit-animation-name: fadeInDown;">SUPPLIER  AND SUPPLY DETAILS</h2>

      <p class="wow fadeInDown animated"
         style="visibility: visible; animation-name: fadeInDown; -webkit-animation-name: fadeInDown;">SUPPLIER  AND SUPPLY DETAILS</p>
    </div>
    <div class="home"></div>
  <div class="banner-inner">
    <div class="container">
      <div class="row">
        <div class="col-sm-6">
          <ul class="nav navbar-nav">
          <li class="scroll"><a href="features12.jsp">PURCHASE DETAILS</a></li>
          <li class="scroll"><a href="features.jsp">PAYMENT DETAILS</a></li>
          <li class="scroll"><a href="features.jsp">RETURN PURCHASE</a></li>
        </ul>

        </div>
      </div>
    </div>
  </div>
    
    <form name="form" method="POST" action="purchase">
                    
                <table border="0">
                     <tbody>
                        <tr>
                            <td><h5>Invoice No.</h5></td>
                            <td><h5><input type="text" name="NewName" value="" required/></h5></td>
                        </tr>
                        
                        <tr>
                            <td><h5>Invoice Date</h5></td>
                            <td><h5><input type="text" name="EmailAddress" value="" required/></h5></td>
                        </tr>
                        
                         <tr>
                            <td><h5>Item Name</h5></td>
                            <td><h5><input type="text" name="Nationality" value="" required/></h5></td>
                        </tr>
                        
                         <tr>
                            <td><h5>Unit Price</h5></td>
                            <td><h5><input type="text" name="UserName" value="" required/></h5></td>
                        </tr>
                        
                        <tr>
                            <td><h5>VAT Percentage</h5></td>
                            <td><h5><input type="text" name="Password" value="" required/></h5></td>
                        </tr>
                        
                         <tr>
                            <td><h5>Quantity</h5></td>
                            <td><h5><input type="text" name="QTY" value="" required/></h5></td>
                        </tr>
                        
                        <tr>
                            <td><h5>Quantity type</h5></td>
                            <td><h5><input type="text" name="Qtytype" value="" required/></h5></td>
                        </tr>
                        
                         <tr>
                            <td><h5>Total Amount</h5></td>
                            <td><h5><input type="text" name="Amount" value="" required/></h5></td>
                        </tr>
                        
                        <tr>
                            <td></td>
                            <td><input type="submit" value="ADD" name="cmdSubmit" /></td>
                            
                        </tr>
                             
                   
                    </tbody>
                </table>
                   
</form>