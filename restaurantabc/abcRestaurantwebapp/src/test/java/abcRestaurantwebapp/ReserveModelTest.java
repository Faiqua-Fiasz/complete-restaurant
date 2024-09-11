package abcRestaurantwebapp;
import abcRestaurantwebapp.service.DataUtility;

import com.mysql.cj.util.Util;
import java.util.Date;

import static org.junit.Assert.assertEquals;


import abcRestaurantwebapp.model.ReserveModel;
import org.junit.Test;

public class ReserveModelTest {

	private static final Date Date = null;

	@Test
	public void testGettersAndSetters() {
		ReserveModel reserveModel =new ReserveModel();
		
		reserveModel.setId(14);
		assertEquals(14, reserveModel.getId());
		
		reserveModel.setFullName("Jane");
		assertEquals("Jane", reserveModel.getFullName());
		
		reserveModel.setDate(Date );
		assertEquals(Date, reserveModel.getDate());
		
		
		reserveModel.setTime("10:30 p.m");
		assertEquals("10:30 p.m", reserveModel.getTime());
		
		reserveModel.sethPeople("4" );
		assertEquals("4", reserveModel.gethPeople());
		
		reserveModel.setMobileNo("444455");
		assertEquals("444455", reserveModel.getMobileNo());
		
	}
	
	
	
	
}
