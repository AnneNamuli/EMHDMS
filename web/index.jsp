<%-- 
    Document   : index
    Created on : 04-May-2015, 07:37:23
    Author     : Elijah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
   <head>

  <meta charset="UTF-8">

  <title>NMS System- Login</title>

    <style>
@import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);
@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);

body{
	margin: 0;
	padding: 0;
	background: #fff;

	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-image:url(nmsfront/imgs/imagesgrennhd.jpg);
	background-size: cover;
	-webkit-filter: blur(5px);
	z-index: 0;
}

.grad{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	/* [disabled]bottom: -40px; */
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header{
	position: absolute;
	top: calc(30% - 35px);
	left: calc(50% - 255px);
	z-index: 2;
}


.header div{
	float: left;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
}

.header div span{
	color: #5379fa !important;
}
.sub{
 position: absolute;
	top: calc(45% - 80px);
	left: calc(33% - 80px);
	font-size: 20px;
	  
    
}
.login{
	position: absolute;
	top: calc(50% - 75px);
	left: calc(45% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.login input[type=text]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=password]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.login input[type=submit]{
	width: 260px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.login input[type=submit]:hover{
	opacity: 0.8;
}

.login input[type=submit]:active{
	opacity: 0.6;
}

.login input[type=text]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=password]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=submit]:focus{
	outline: none;
}

::-webkit-input-placeholder{
   color: rgba(255,255,255,0.6);
}

::-moz-input-placeholder{
   color: rgba(255,255,255,0.6);
}
    </style>

    <script src="js/prefixfree.min.js"></script>

</head>

<body link="green">

  <div class="body"></div>
      
		<div class="grad"></div>
		<div class="header">
			<div >National Medical Stores <span>  Online</span></div>

                </div>
                <div class="sub"> Essential Medicines and Health Supplies Distribution Management System </div>

		<br>
		<div class="login">
                    <form action="nmsfront/pages/GetDistricts.jsp">
				<input type="text" placeholder="username" name="user" required="required"><br>
				<input type="password" placeholder="password" name="password" required="required"><br>
                                <input type="submit" value="Login" name="submit" >
                    </form>
                    <div><a href="nmsfront/pages/Userhome.jsp" style="font-size: 6px" > user loginggggggggg</a></div>  
		</div>

  <script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>

</body>
</html>
