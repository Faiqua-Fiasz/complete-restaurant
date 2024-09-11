package abcRestaurantwebapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abcRestaurantwebapp.dao.ReserveDAO;
import abcRestaurantwebapp.dao.UserDAO;
import abcRestaurantwebapp.service.DataUtility;
import abcRestaurantwebapp.service.ServletUtility;

/**
 * Servlet implementation class ReservationViewListController
 */
@WebServlet(name = "ReservationViewListController", urlPatterns = {"/ReservationViewListController"})
public class ReservationViewListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationViewListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReserveDAO model=new ReserveDAO();
		  
	    long id=DataUtility.getLong(request.getParameter("id"));
	    if(id>0) {
	    	ReserveDAO.delete(id);
	      ServletUtility.setSuccessMessage("Reservation Deleted Successfully", request);
	    }
	    
	    
	  
	    List list=null;
	    list=model.list(); 
	    if(list==null && list.size()==0){
	      ServletUtility.setErrorMessage("Record Not Found", request);
	    }
	    
	  
	    
	    ServletUtility.setList(list, request);
	    
	  
	ServletUtility.forward(ARWView.ReservationViewList, request, response);
}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
