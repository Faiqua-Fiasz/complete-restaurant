<%@page import="abcRestaurantwebapp.model.ReserveModel"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
<link rel="stylesheet" href="../css/style.css">

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
        <a class="nav-link" href="<%=ARWView.StaffDController%>">Back</a>
      </li>
 
      
   
       </ul>
  </div>
</nav>


<%=ServletUtility.getSuccessMessage(request) %>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Customer Name</th>
   	  <th scope="col">Date</th>
	  <th scope="col">Time</th>
      <th scope="col">Guest Count</th>
      <th scope="col">Phone Number</th>
     
    </tr>
  </thead>

<%
          int index=1;
          List list=ServletUtility.getList(request);
          Iterator it=list.iterator();
          while(it.hasNext()){
          ReserveModel reserve=(ReserveModel)it.next();
  %>

  <tbody>
    <tr>
      <th scope="row"><%=reserve.getId() %></th>
      <td><%=reserve.getFullName() %></td>
      <td><%=reserve.getDate() %></td>
      <td><%=reserve.getTime() %></td>
      <td><%=reserve.gethPeople() %></td>
      <td><%=reserve.getMobileNo() %></td>
      
      
      <td><a href="ReservationViewListController?id=<%=reserve.getId()%>">Delete</a></td>
      
      
      
    </tr>
    
    <%} %>
  </tbody>
</table>




<%@ include file="footer.jsp"%>