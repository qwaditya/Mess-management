<!DOCTYPE HTML>
<html>
	<head>
		<title>MESS MANAGEMENT SYSTEM</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.poptrox.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel-noscript.css" />
			<link rel="stylesheet" href="css/style.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
                <style>
                    
                    .button {
  display: inline-block;
  padding: 12px 21px;
  font-size: 19px;
  text-align: center;
  right:300px;
  cursor: pointer;
  text-decoration: none;
  position:center;
  outline: none;
  color: black;
  background-color: whitesmoke;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px activecaption;
 
}

.button:hover {background-color: window}

.button:active {
  background-color: white;
  box-shadow: 0 5px blue;
  transform: translateY(4px);
}
                    body{
                        background-image: url("one.jpg");
                    }
                    h3{
                        top:100px;
                        right:450px;
                        color:white;
                        font-family: sans-serif;
                        text-align: center;
                        
                        
                    }
                    h1{
                      
    text-align: center;
    
                    }
                    form{
        text-align:center;
       padding: 40px;
      
                    }
                </style>
	</head>
        
	<body >

		<!-- Header -->
			<header id="header">

				<!-- Logo -->
					 <img src='messs.png' alt='mess management'/></a> 
				
				

			</header>
			
		<!-- Intro -->
			
                                    <h1>MESS MANAGEMENT SYSTEM</h1>
                                    <h3><b>Hardwork should be rewarded by good food</b></h3>
                                     
					
        &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;   &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;     &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;   &nbsp;&nbsp;                <button id="show-dialog" class="button">LOGIN</button>
  <dialog class="mdl-dialog">
    
    <div class="mdl-dialog__content">
      <form action="Home2.jsp" method="POST">
   
    
     USERNAME:
     <input type="text" name="email" value="" autocomplete="on" required
     
     <br>
     PASSWORD:
     <input type="password" name="pass" title="six characters or more" required>
    
    <div class="mdl-dialog__actions">
        <input type="submit" value="SUBMIT" name="cmdSubmit" />
      <button type="button" class="mdl-button close">CLOSE</button>
    </div>
      </form>
     </div>
  </dialog>
        
  <script>
    var dialog = document.querySelector('dialog');
    var showDialogButton = document.querySelector('#show-dialog');
    if (! dialog.showModal) {
      dialogPolyfill.registerDialog(dialog);
    }
    showDialogButton.addEventListener('click', function() {
      dialog.showModal();
    });
    dialog.querySelector('.close').addEventListener('click', function() {
      dialog.close();
    });
  </script>
			
                
		
	</body>
</html>