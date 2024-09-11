package abcRestaurantwebapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abcRestaurantwebapp.dao.ReserveDAO;
import abcRestaurantwebapp.dao.UserDAO;
import abcRestaurantwebapp.model.ReserveModel;
import abcRestaurantwebapp.model.UserModel;
import abcRestaurantwebapp.service.DataUtility;
import abcRestaurantwebapp.service.ServletUtility;

/**
 * Servlet implementation class ReservationViewController
 */
@WebServlet(name = "ReservationViewController", urlPatterns = {"/ReservationViewController"})

public class ReservationViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Edit....
		  ReserveDAO reserveDAO = new ReserveDAO();
		  long id = DataUtility.getLong(request.getParameter("id"));
		  if(id>0) {
		    ReserveModel reserveModel = null;
		    reserveModel = reserveDAO.FindByPk(id);
		    request.setAttribute("reserveModel", reserveModel);
		  }
		ServletUtility.forward(ARWView.ReservationView, request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReserveModel reserve = new ReserveModel();
		reserve.setFullName(request.getParameter("fullname"));
		reserve.setDate(DataUtility.getDate(request.getParameter("date")));
		reserve.setTime(request.getParameter("time"));
		reserve.sethPeople(request.getParameter("hPeople"));
		reserve.setMobileNo(request.getParameter("mobile"));
	    
		reserve.setId(DataUtility.getLong(request.getParameter("id")));
	    
	    
	    
			
		
	    long i = ReserveDAO.addReserve(reserve);
	    if(i>0) {
	      ServletUtility.setSuccessMessage("Sucessfully Reserved", request);
	      
	    }else {
	      ServletUtility.setErrorMessage("Failed To Reserved", request);
	    }
	    
	  
	request.getRequestDispatcher(ARWView.ReservationView).forward(request, response);
	}

}
