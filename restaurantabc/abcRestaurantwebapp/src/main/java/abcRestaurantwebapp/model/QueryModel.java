package abcRestaurantwebapp.model;

public class QueryModel {

	private String fullname;
	  private String query;
	  private String response;
	  private String status;
	  private long id;
	  
	public QueryModel() {
		
	}

	public QueryModel(String fullname, String query, String response, String status, long id) {
		super();
		this.fullname = fullname;
		this.query = query;
		this.response = response;
		this.status = status;
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	  
}
