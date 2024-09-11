
<%@page import="abcRestaurantwebapp.service.DataUtility"%>
<%@page import="abcRestaurantwebapp.service.ServletUtility"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <script>
 $( function() {
      $( "#datepicker" ).datepicker({
          dateFormat : 'mm/dd/yy',
          changeMonth: true,
        changeYear: true
      });
    } );
  </script>
</head>
<body>
<%@ include file="header.jsp"%>
  <main class="login-form">
  <div class="cotainer">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
            User details
            
          </div>
           
          <div class="card-body">
          
          <h3 style="color: green"><%=ServletUtility.getSuccessMessage(request)%></h3>
          <h3 style="color: red">  <%=ServletUtility.getErrorMessage(request)%></h3>
            <jsp:useBean id="userModel" class="abcRestaurantwebapp.model.UserModel" scope="request"></jsp:useBean>
            
            <form action="<%=ARWView.RegisterController %>" method="post">
            
            <input type="hidden" name="id" value="<%=DataUtility.getStringData(userModel.getId())%>"> 
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">First Name<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text"   class="form-control" placeholder="Enter First Name"
                    name="firstName" value="<%=DataUtility.getStringData(userModel.getFirstName())%>" >
                    <font  color="red"></font>
                </div>
              </div>
              
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Last Name<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text"   class="form-control" placeholder="Enter Last Name"
                    name="lastName" value="<%=DataUtility.getStringData(userModel.getLastName())%>" >
                    <font  color="red"></font>
                </div>
              </div>
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Login Id<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text" id="email_address"  class="form-control" placeholder="Enter Login Id"
                    name="login" value="<%=DataUtility.getStringData(userModel.getLogin())%>" >
                    <font  color="red"></font>
                </div>
              </div>
              
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Password<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="password" id="email_address"  class="form-control" placeholder="Enter password"
                    name="password" value="<%=DataUtility.getStringData(userModel.getPassword() )%>" >
                    <font  color="red"></font>
                </div>
              </div>
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Date Of Birth<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text"  id="datepicker" class="form-control" placeholder="Enter Date Of Birth"
                    name="dob" value="<%=DataUtility.getDateString(userModel.getDob())%>" >
                    <font  color="red"></font>
                </div>
              </div>
              
              
              
              <div class="form-group row">
                <label for="email_address" 
                  class="col-md-4 col-form-label text-md-right">Mobile No.<font color="red"></font></label>
                <div class="col-md-6">
                  <input type="text" id="email_address"  class="form-control" placeholder="Enter Mobile No"
                    name="mobile" value="<%=DataUtility.getStringData(userModel.getMobileNo())%>" >
                    <font  color="red"></font>
                </div>
              </div>
             
              
              <%if(userModel.getId()>0){ %>
              <div class="col-md-6 offset-md-4">
                <input type="submit" class="btn btn-primary" name="operation" value="Update">
                
              </div>
              <%} else{ %>
              		
              		 <div class="col-md-6 offset-md-4">
                <input type="submit" class="btn btn-primary" name="operation" value="Register">
                
              </div>
              	
              
              <%} %>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  </main>
  <div style="margin-top: 120px">
    <%@ include file="footer.jsp"%>
  </div>
</body>
</html>