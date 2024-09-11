package abcRestaurantwebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import abcRestaurantwebapp.model.QueryModel;
import abcRestaurantwebapp.model.UserModel;

public class QueryViewDAO {

	
		 public static long nextPk() {
			    long pk = 0;
			    Connection conn;
			    try {
			      conn = JDBCDataSource.getConnection();
			      PreparedStatement stmt = conn.prepareStatement("select Max(id) from query");
			      ResultSet rs = stmt.executeQuery();
			      while(rs.next()){
			        pk = rs.getLong(1);
			      }
			    } catch (Exception e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }
			    return pk+1;
			    
			  }
		 
		 
				 //add
				  public static long addQuery(QueryModel query) {
				    int i = 0;
				    try {
				      Connection conn = JDBCDataSource.getConnection();
				      PreparedStatement stmt = conn.prepareStatement("insert into query values(?,?,?,?,?)");
				      stmt.setLong(1, nextPk());
				      stmt.setString(2 , query.getFullname() );
				      stmt.setString(3 , query.getQuery() );
				      stmt.setString(4 , query.getResponse());
				      stmt.setString(5 , query.getStatus() );
				     
				        i =     stmt.executeUpdate();
				      
				    } catch (Exception e) {
				      // TODO Auto-generated catch block
				      e.printStackTrace();
				    }
				    
				    
				    return i;
				  }
		  
				  
				  
				  //getdata from the database
				  
				  public static List list() {
					  ArrayList list=new ArrayList();
					  Connection conn=null;
					  try {
					     conn=JDBCDataSource.getConnection();
					    PreparedStatement pstmt=conn.prepareStatement("Select * from query");
					    
					    ResultSet rs= pstmt.executeQuery();
					    while (rs.next()) {
					    QueryModel query=new QueryModel();
					    query.setId(rs.getLong("id"));
					    query.setFullname(rs.getString("fullname"));
					    query.setQuery(rs.getString("query"));
					    query.setResponse(rs.getString("response"));
					    query.setStatus(rs.getString("status"));
					   
					    list.add(query);
					    }
					  } catch (Exception e) {
					    // TODO Auto-generated catch block
					    e.printStackTrace();
					  }finally {
					    JDBCDataSource.closeConnection(conn);
					  }
					  
					  return list;
					}
				  
				  
				  
				  //edit
				  public static QueryModel FindByPk(long id) {
					    Connection con;
					    QueryModel query = null;
					    try {
					      con = JDBCDataSource.getConnection();
					      PreparedStatement stmt = con.prepareStatement("Select * from query where id=?");
					      stmt.setLong(1, id);
					      ResultSet rs = stmt.executeQuery();
					      if (rs.next()) {
					    	  query = new QueryModel();
					        System.out.println("ID: " + rs.getLong("id"));
					        query.setId(rs.getLong("id"));
						    query.setFullname(rs.getString("fullname"));
						    query.setQuery(rs.getString("query"));
						    query.setResponse(rs.getString("response"));
						    query.setStatus(rs.getString("status"));
					        
					      }
					    } catch (Exception e) {
					      // TODO Auto-generated catch block
					      e.printStackTrace();
					    }
					    return query;
					  }
				  
				  
				  
				//update user
				  public static long UpdateQuery(QueryModel query) {
				      int i = 0;
				      try {
				        Connection conn = JDBCDataSource.getConnection();
				        PreparedStatement stmt = conn.prepareStatement("update query set fullname=?, query=?, response=?,status=? where id=?");
				        
				        stmt.setString(1 , query.getFullname() );
					      stmt.setString(2 , query.getQuery() );
					      stmt.setString(3 , query.getResponse());
					      stmt.setString(4 , query.getStatus() );
				        stmt.setLong(5, query.getId());
				          i =   stmt.executeUpdate();
				        
				      } catch (Exception e) {
				        // TODO Auto-generated catch block
				        e.printStackTrace();
				      }
				      
				      
				      return i;
				    }
				  
				//delete
				  public static long delete(long id) {
					  int i = 0;
					  try {
					    Connection conn = JDBCDataSource.getConnection();
					    PreparedStatement stmt = conn.prepareStatement("DELETE from query where id=?");
					    stmt.setLong(1, id);
					    i = stmt.executeUpdate();
					  } catch (Exception e) {
					    // TODO Auto-generated catch block
					    e.printStackTrace();
					  }
					  return i;
					}
	  
	
}
