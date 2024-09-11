<%@page import="abcRestaurantwebapp.service.DataUtility"%>
<%@page import="abcRestaurantwebapp.service.ServletUtility"%>
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
<script>
 $( function() {
      $( "#datepicker" ).datepicker({
          dateFormat : 'mm/dd/yy',
          changeMonth: true,
        changeYear: true
      });
    } );
  </script>
<style>
/* Style inputs with type="text", select elements and textareas */
input[type=text], select, textarea {
  width: 100%; /* Full width */
  padding: 12px; /* Some padding */ 
  border: 1px solid #ccc; /* Gray border */
  border-radius: 4px; /* Rounded borders */
  box-sizing: border-box; /* Make sure that padding and width stays in place */
  margin-top: 6px; /* Add a top margin */
  margin-bottom: 16px; /* Bottom margin */
  resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
}

/* Style the submit button with a specific background color etc */
input[type=submit] {
  background-color: black;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

/* When moving the mouse over the submit button, add a darker green color */
input[type=submit]:hover {
  background-color: gold;
}

/* Add a background color and some padding around the form */
.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.b1{
background-color: black;
}

</style>
</head>


<body >

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
        <a class="nav-link" href="<%=ARWView.CustomerDController%>">Back</a>
      </li>
 
      
   
       </ul>
  </div>
</nav>

<h2 style="color: #2c3e50; font-family: Arial, sans-serif; text-align: center;">Restaurant Opening Hours</h2>
<p style="font-size: 16px; font-family: 'Times New Roman', serif; color: #555; text-align: justify;">
    Our restaurant is open every day from 10:00 AM to 10:00 PM.<br>
     We welcome you for breakfast, lunch, and dinner, with a special brunch on weekends.<br>
     Please note that reservations are recommended for peak hours.
</p>

<div class="b1">
<div class="container">
<h3 style="color: green"><%=ServletUtility.getSuccessMessage(request)%></h3>
          <h3 style="color: red">  <%=ServletUtility.getErrorMessage(request)%></h3>
            <jsp:useBean id="reserveModel" class="abcRestaurantwebapp.model.ReserveModel" scope="request"></jsp:useBean>


			  <form action="<%=ARWView.ReservationViewController %>" method="post">
			
					<input type="hidden" name="id" value="<%=DataUtility.getStringData(reserveModel.getId())%>"> 
					
					    <label for="fname">Full name</label>
					    <input type="text" id="fullName" name="fullname" 
					    value="<%=DataUtility.getStringData(reserveModel.getFullName())%>" placeholder="full name please">
					
					    
					<label for="email_address">Date</label>
					    <input type="text"  id="datepicker" class="form-control" placeholder="dd/mm/yyyy"
					                    name="date" value="<%=DataUtility.getDateString(reserveModel.getDate())%>" >
					
					
					<label for="email_address">Time</label>
					    <input type="text"  id="time" class="form-control" placeholder=""
					                    name="time" value="<%=DataUtility.getStringData(reserveModel.getTime())%>" >
					
					<label for="fname">How Many People</label>
					    <input type="text" id="email_address"  class="form-control" placeholder="minimum one"
					                    name="hPeople" value="<%=DataUtility.getStringData(reserveModel.gethPeople())%>" >
					    
					
					<label for="fname">Phone Number</label>
					    <input type="text" id="email_address"  class="form-control" placeholder="Enter Mobile No"
					                    name="mobile" value="<%=DataUtility.getStringData(reserveModel.getMobileNo())%>" >
					    
					
					    <input type="submit" class="btn btn-primary" name="operation" value="Reserve Table">
			    
			
			  </form>
</div>
</div>

    <%@ include file="footer.jsp"%>
 
