package abcRestaurantwebapp;
import abcRestaurantwebapp.service.DataUtility;

import com.mysql.cj.util.Util;
import java.util.Date;

import static org.junit.Assert.assertEquals;


import abcRestaurantwebapp.model.UserModel;
import org.junit.Test;

public class UserModelTest {

	private static final Date Date = null;

	@Test
	public void testGettersAndSetters() {
		UserModel userModel =new UserModel();
		
		userModel.setId(14);
		assertEquals(14, userModel.getId());
		
		userModel.setFirstName("Jane");
		assertEquals("Jane", userModel.getFirstName());
		
		userModel.setLastName("don");
		assertEquals("don", userModel.getLastName());
		
		
		userModel.setLogin("don@gmail.com");
		assertEquals("don@gmail.com", userModel.getLogin());
		
		
		userModel.setDob(Date );
		assertEquals(Date, userModel.getDob());
		
		userModel.setMobileNo("444455");
		assertEquals("444455", userModel.getMobileNo());
		
	}
	
	
	
	
}
