package abcRestaurantwebapp.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import abcRestaurantwebapp.dao.UserDAO;
import abcRestaurantwebapp.model.UserModel;
import abcRestaurantwebapp.service.ServletUtility;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 	   
 	  
		String op=request.getParameter("operation");
		System.out.println("Operation: "+op);
		try {
			if(op.equals("logout")) {
				HttpSession session=request.getSession(false);
				 session.invalidate();
			      ServletUtility.setSuccessMessage("Logout Sucessfully",request);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		ServletUtility.forward(ARWView.LoginView, request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserModel user = new UserModel();
	       String login=request.getParameter("login");
	       String pwd=request.getParameter("password");
	       
    	   HttpSession session=request.getSession(true);

	       user = UserDAO.UserLogin(login,pwd);
	       if(user != null) {
	           //ServletUtility.setSuccessMessage(request.getParameter("login")+ " is login successfully", request);
	    	 //Set attribute for session
	    	 session.setAttribute("user", user.getFirstName());
	    	 if(login.equals("Adminabc@gmail.com")) {
		    	   ServletUtility.redirect(ARWView.AdminDController, request, response);
	    	 }else if (login.equals("Staffabc@gmail.com")) {
	    		 
		    	   ServletUtility.redirect(ARWView.StaffDController, request, response);

			}else {
		    	   ServletUtility.redirect(ARWView.CustomerDController, request, response);

			}

    	 
	       }else {
	           ServletUtility.setErrorMessage("Invalid User", request);
	           ServletUtility.forward(ARWView.LoginView, request, response);
	       }
	}
	}


