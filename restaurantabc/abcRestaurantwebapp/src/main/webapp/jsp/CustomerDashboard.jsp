
<%@page import="abcRestaurantwebapp.controller.ARWView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<link rel="stylesheet" href="../css/style.css">
<style >
.home-content-wrapper{
	background-image: url("../images/2.jpg");
	background-size: 100%;
	height:100%;
	
}

.overlay-box{
	padding: 200px 0px;
	box-sizing: border-box;
	background: rgba(0,0,0,0.5);
	height: 100%;
	
}

.container{
	width: 1200px;
	margin: 0px auto;
}

.welcome-text{
	color: gold;
	font-size: 100px;
	font-family: ralewaay-bold;
	line-height: 90px;
}


</style>
</head>
<body>



<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <a class="navbar-brand" href=""></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
  
    <ul class="navbar-nav">
      
    
      <li class="nav-item">
        <a class="nav-link" href=<%=ARWView.LoginController+"?operation=logout" %>>Logout</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=ARWView.QueryViewController%>">Query</a>
      </li>
  <li class="nav-item">
        <a class="nav-link" href="<%=ARWView.ReservationViewController%>">Reserve</a>
      </li>
      
   <li class="nav-item">
        <a class="nav-link" href="<%=ARWView.CustomerQController%>">Q&R</a>
      </li>
      
       </ul>
  </div>
</nav>
<div class="home-content-wrapper">
		<div class="overlay-box">
			<div class="container">
			<div class="welcome-text"> WELCOME<br> TO <br>ABC RESTAURANT</div>
			
			</div>
		
		</div>
	
	</div>

<%@ include file="footer.jsp"%>
