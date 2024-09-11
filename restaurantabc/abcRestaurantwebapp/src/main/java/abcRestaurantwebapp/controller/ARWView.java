package abcRestaurantwebapp.controller;

public interface ARWView {
	
	
	public String APP_CONTEXT = "/abcRestaurantwebapp";
	
	public String PAGE_FOLDER="/jsp";
	
	public String home = APP_CONTEXT+PAGE_FOLDER+"/home.jsp";
	
	public String LoginView =PAGE_FOLDER+"/LoginView.jsp";
	
	public String UserView =PAGE_FOLDER+"/UserView.jsp";
	
	public String AdminDashboard=PAGE_FOLDER+ "/AdminDashboard.jsp";
	
	public String UserViewList=PAGE_FOLDER+ "/UserViewList.jsp";
	
	public String CustomerDashboard=PAGE_FOLDER+ "/CustomerDashboard.jsp";
	
	public String StaffDahboard=PAGE_FOLDER+ "/StaffDahboard.jsp";
	
	public String QueryView =PAGE_FOLDER+"/QueryView.jsp";
	
	public String ReservationView =PAGE_FOLDER+"/ReservationView.jsp";
	
	public String QueryViewList=PAGE_FOLDER+ "/QueryViewList.jsp";
	
	public String ReservationViewList=PAGE_FOLDER+ "/ReservationViewList.jsp";
	
	public String CustomerQ=PAGE_FOLDER+ "/CustomerQ.jsp";

	
	
	
	
	public String LoginController =APP_CONTEXT+ "/LoginController";
	
	public String RegisterController =APP_CONTEXT+ "/RegisterController";
	
 	public String AdminDController=APP_CONTEXT+ "/AdminDController";
 	
 	public String UserViewListController=APP_CONTEXT+ "/UserViewListController";
 	
 	public String CustomerDController=APP_CONTEXT+ "/CustomerDController";
 	
 	public String StaffDController=APP_CONTEXT+ "/StaffDController";
 	
 	public String QueryViewController=APP_CONTEXT+ "/QueryViewController";
 	
 	public String ReservationViewController=APP_CONTEXT+ "/ReservationViewController";
 	
 	public String QueryViewListController=APP_CONTEXT+ "/QueryViewListController";
 	
 	public String ReservationViewListController=APP_CONTEXT+ "/ReservationViewListController";
 	
 	public String CustomerQController=APP_CONTEXT+ "/CustomerQController";

 	
 	
}
