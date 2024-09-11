package abcRestaurantwebapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import abcRestaurantwebapp.dao.QueryViewDAO;
import abcRestaurantwebapp.dao.ReserveDAO;
import abcRestaurantwebapp.dao.UserDAO;
import abcRestaurantwebapp.model.QueryModel;
import abcRestaurantwebapp.model.ReserveModel;
import abcRestaurantwebapp.service.DataUtility;
import abcRestaurantwebapp.service.ServletUtility;

/**
 * Servlet implementation class QueryViewController
 */
@WebServlet(name = "QueryViewController", urlPatterns = {"/QueryViewController"})
public class QueryViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Edit....
		QueryViewDAO queryViewDAO = new QueryViewDAO();
		  long id = DataUtility.getLong(request.getParameter("id"));
		  if(id>0) {
		   QueryModel queryModel = null;
		   queryModel = queryViewDAO.FindByPk(id);
		    request.setAttribute("queryModel", queryModel);
		  }
		ServletUtility.forward(ARWView.QueryView, request, response);
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				QueryModel query = new QueryModel();
				query.setFullname(request.getParameter("fullname"));
				
				query.setQuery(request.getParameter("query"));
				query.setResponse(request.getParameter("response"));
				query.setStatus(request.getParameter("status"));
			    
				query.setId(DataUtility.getLong(request.getParameter("id")));
			    
			    
			    
					
				
				  
			    if(query.getId()>0) {
			    	
			    	long i = QueryViewDAO.UpdateQuery(query);
		            if(i>0) {
		              ServletUtility.setSuccessMessage("Query Responded Sucessfully", request);
		              
		            }else {
		              ServletUtility.setErrorMessage("failed To Respond", request);
		            }
			    	
			    }else {
					
				
			    long i = QueryViewDAO.addQuery(query);
			    if(i>0) {
			      ServletUtility.setSuccessMessage("Sucessfully Sent", request);
			      
			    }else {
			      ServletUtility.setErrorMessage("failed ", request);
			    }
			    
			  }
			request.getRequestDispatcher(ARWView.QueryView).forward(request, response);
	}

}
