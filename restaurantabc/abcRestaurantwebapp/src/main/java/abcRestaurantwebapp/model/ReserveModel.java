package abcRestaurantwebapp.model;
import java.util.Date;

public class ReserveModel {

	private String fullName;
	private Date date;
	  private String time;
	  private String hPeople;
	  private String mobileNo;
	  private long id;
	  
	  
	public ReserveModel() {
		
	}


	public ReserveModel(String fullName, Date date, String time, String hPeople, String mobileNo, long id) {
		super();
		this.fullName = fullName;
		this.date = date;
		this.time = time;
		this.hPeople = hPeople;
		this.mobileNo = mobileNo;
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String gethPeople() {
		return hPeople;
	}


	public void sethPeople(String hPeople) {
		this.hPeople = hPeople;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	  
	  
	

}
