package abcRestaurantwebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abcRestaurantwebapp.dao.UserDAO;
import abcRestaurantwebapp.model.UserModel;
import abcRestaurantwebapp.service.DataUtility;
import abcRestaurantwebapp.service.ServletUtility;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet(name = "RegisterController", urlPatterns = {"/RegisterController"})
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Edit....
		  UserDAO userDAO = new UserDAO();
		  long id = DataUtility.getLong(request.getParameter("id"));
		  if(id>0) {
		    UserModel userModel = null;
		    userModel = userDAO.FindByPk(id);
		    request.setAttribute("userModel", userModel);
		  }
		ServletUtility.forward(ARWView.UserView, request, response);
	

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 UserModel user = new UserModel();
		    user.setFirstName(request.getParameter("firstName"));
		    user.setLastName(request.getParameter("lastName"));
		    user.setLogin(request.getParameter("login"));
		    user.setPassword(request.getParameter("password"));
		    user.setDob(DataUtility.getDate(request.getParameter("dob")));
		    user.setMobileNo(request.getParameter("mobile"));
		    
		    user.setId(DataUtility.getLong(request.getParameter("id")));
		    
		    
		    if(user.getId()>0) {
		    	
		    	long i = UserDAO.UpdateUser(user);
	            if(i>0) {
	              ServletUtility.setSuccessMessage("User Updated sucessfully", request);
	              
	            }else {
	              ServletUtility.setErrorMessage("Not insterted", request);
	            }
		    	
		    }else {
				
			
		    long i = UserDAO.addUser(user);
		    if(i>0) {
		      ServletUtility.setSuccessMessage("Sucessfully registered", request);
		      
		    }else {
		      ServletUtility.setErrorMessage("Not insterted", request);
		    }
		    
		  }
		request.getRequestDispatcher(ARWView.UserView).forward(request, response);
}
	
	
}
		
	


