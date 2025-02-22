package abcRestaurantwebapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abcRestaurantwebapp.dao.QueryViewDAO;
import abcRestaurantwebapp.dao.UserDAO;
import abcRestaurantwebapp.service.DataUtility;
import abcRestaurantwebapp.service.ServletUtility;

/**
 * Servlet implementation class QueryViewListController
 */

@WebServlet(name = "QueryViewListController", urlPatterns = {"/QueryViewListController"})

public class QueryViewListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryViewListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QueryViewDAO model=new QueryViewDAO();
		  
		    long id=DataUtility.getLong(request.getParameter("id"));
		    if(id>0) {
		    	QueryViewDAO.delete(id);
		      ServletUtility.setSuccessMessage(" Deleted Successfully", request);
		    }
		    
		    
		  
		    List list=null;
		    list=model.list(); 
		    if(list==null && list.size()==0){
		      ServletUtility.setErrorMessage("Record Not Found", request);
		    }
		    
		  
		    
		    ServletUtility.setList(list, request);
		    
		  
		ServletUtility.forward(ARWView.QueryViewList, request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
