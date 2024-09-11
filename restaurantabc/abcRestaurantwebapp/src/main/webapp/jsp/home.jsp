<%@ include file="header.jsp"%>
<style>
.about-section {
  padding: 50px;
  text-align: center;
  background-color: black;
  color: white;
}
body{background-color: black;}
h1{padding: 50px;
  text-align: center;
  background-color: black;
  color: white;}
</style>
<body>
	<div class="home-content-wrapper">
		<div class="overlay-box">
			<div class="container">
			<div class="welcome-text"> Welcome To <br> ABC Restaurant</div>
			
			</div>
		
		</div>
	
	</div>
	
	<div class="about-section">
  <h1>About Us</h1>
  <p>Welcome to ABC Restaurant, a renowned restaurant chain celebrated across Sri Lanka for its exceptional cuisine and warm hospitality.<br> With locations in multiple cities, we take pride in offering a diverse menu that showcases the finest local and international flavors.<br>Our commitment to quality, fresh ingredients, and impeccable service makes every dining experience unforgettable. Whether you're enjoying a family meal, celebrating a special occasion, or just savoring a quick bite,<br> ABC Restaurant is your go-to destination for delicious food and a welcoming atmosphere.</p>
  
</div>
	<h1> Gallery</h1>
	<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/abcRestaurantwebapp/images/5.png" class="d-block w-100" alt="..." height="500px" width="300px" >
    </div>
    <div class="carousel-item">
      <img src="/abcRestaurantwebapp/images/1.jpg" class="d-block w-100" alt="..." height="500px" width="300px">
    </div>
   
    <div class="carousel-item">
      <img src="/abcRestaurantwebapp/images/7.jpg" class="d-block w-100" alt="..." height="500px" width="300px">
    </div>
        <div class="carousel-item">
      <img src="/abcRestaurantwebapp/images/3.jpg" class="d-block w-100" alt="..." height="500px" width="300px">
    </div>
    
     <div class="carousel-item">
      <img src="/abcRestaurantwebapp/images/8.jpg" class="d-block w-100" alt="..." height="500px" width="300px">
    </div>
    
    
     <div class="carousel-item">
      <img src="/abcRestaurantwebapp/images/4.jpg" class="d-block w-100" alt="..." height="500px" width="300px">
    </div>
     <div class="carousel-item">
      <img src="/abcRestaurantwebapp/images/6.jpg" class="d-block w-100" alt="..." height="500px" width="300px">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</body>
<%@ include file="footer.jsp"%>

</html>