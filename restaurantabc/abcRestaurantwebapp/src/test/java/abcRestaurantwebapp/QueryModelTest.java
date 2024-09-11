package abcRestaurantwebapp;

import static org.junit.Assert.assertEquals;
import abcRestaurantwebapp.model.QueryModel;
import org.junit.Test;
public class QueryModelTest {
	
	@Test
	public void testGettersAndSetters() {
		QueryModel queryModel =new QueryModel();
		
		queryModel.setId(14);
		assertEquals(14, queryModel.getId());
		
		queryModel.setFullname("Jane");
		assertEquals("Jane", queryModel.getFullname());
		
		queryModel.setQuery("Indoor gaming area availability?");
		assertEquals("Indoor gaming area availability?", queryModel.getQuery());
		
		
		queryModel.setResponse("respon in 24hours");;
		assertEquals("respon in 24hours", queryModel.getResponse());
		
		
		queryModel.setStatus("Processing");
		assertEquals("Processing", queryModel.getStatus());
		
	}
	
	
	@Test
	public void testConstructors() {
		QueryModel queryModel =new QueryModel("Jane","Indoor gaming area availability?","respon in 24hours","Processing",14);
		
		assertEquals("Jane", queryModel.getFullname());
		assertEquals("Indoor gaming area availability?", queryModel.getQuery());
		assertEquals("respon in 24hours", queryModel.getResponse());
		assertEquals("Processing", queryModel.getStatus());
		assertEquals(14, queryModel.getId());
		
		
	}
	
	

	
}
