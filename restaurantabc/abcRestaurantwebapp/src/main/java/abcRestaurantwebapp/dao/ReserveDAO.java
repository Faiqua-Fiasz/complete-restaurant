package abcRestaurantwebapp.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import abcRestaurantwebapp.model.ReserveModel;
import abcRestaurantwebapp.model.UserModel;

public class ReserveDAO {

	 public static long nextPk() {
		    long pk = 0;
		    Connection conn;
		    try {
		      conn = JDBCDataSource.getConnection();
		      PreparedStatement stmt = conn.prepareStatement("select Max(id) from reserve");
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
	 
	 public static long addReserve(ReserveModel reserve) {
		    int i = 0;
		    try {
		      Connection conn = JDBCDataSource.getConnection();
		      PreparedStatement stmt = conn.prepareStatement("insert into reserve values(?,?,?,?,?,?)");
		      stmt.setLong(1, nextPk());
		      stmt.setString(2 , reserve.getFullName() );
		      stmt.setDate(3 , new java.sql.Date(reserve.getDate().getTime()) );
		      stmt.setString(4 , reserve.getTime() );
		      stmt.setString(5 , reserve.gethPeople() );
		      stmt.setString(6 , reserve.getMobileNo() );
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
		    PreparedStatement pstmt=conn.prepareStatement("Select * from reserve");
		    
		    ResultSet rs= pstmt.executeQuery();
		    while (rs.next()) {
		    ReserveModel reserve=new ReserveModel();
		    reserve.setId(rs.getLong("id"));
		    reserve.setFullName(rs.getString("fullname"));;
		    reserve.setDate(rs.getDate("date"));;
		    reserve.setTime(rs.getString("time"));;
		    reserve.sethPeople(rs.getString("hPeople"));;
		    reserve.setMobileNo(rs.getString("mobile"));;
		    list.add(reserve);
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
	  public static ReserveModel FindByPk(long id) {
		    Connection con;
		    ReserveModel reserve = null;
		    try {
		      con = JDBCDataSource.getConnection();
		      PreparedStatement stmt = con.prepareStatement("Select * from reserve where id=?");
		      stmt.setLong(1, id);
		      ResultSet rs = stmt.executeQuery();
		      if (rs.next()) {
		    	  reserve = new ReserveModel();
		        System.out.println("ID: " + rs.getLong("id"));
		        reserve.setId(rs.getLong("id"));
			    reserve.setFullName(rs.getString("fullname"));;
			    reserve.setDate(rs.getDate("date"));;
			    reserve.setTime(rs.getString("time"));;
			    reserve.sethPeople(rs.getString("hPeople"));;
			    reserve.setMobileNo(rs.getString("mobile"));;
		      }
		    } catch (Exception e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    return reserve;
		  }
	  
	  
	//update 
	  public static long UpdateReserve(ReserveModel reserve) {
	      int i = 0;
	      try {
	        Connection conn = JDBCDataSource.getConnection();
	        PreparedStatement stmt = conn.prepareStatement("update reserve set fullname=?, date=?, time=?,hPeople=?,mobile=? where id=?");
	        
	        stmt.setString(1 , reserve.getFullName() );
		      stmt.setDate(2 , new java.sql.Date(reserve.getDate().getTime()) );
		      stmt.setString(3 , reserve.getTime() );
		      stmt.setString(4 , reserve.gethPeople() );
		      stmt.setString(5 , reserve.getMobileNo() );
	        stmt.setLong(6, reserve.getId());
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
		    PreparedStatement stmt = conn.prepareStatement("DELETE from reserve where id=?");
		    stmt.setLong(1, id);
		    i = stmt.executeUpdate();
		  } catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		  }
		  return i;
		}
	  
	 
	 
}
