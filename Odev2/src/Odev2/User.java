package Odev2;

public class User {
	
	private int id;
	private String fistName;
	private String lastName;
	private String email;
	private String course;
	private String country;
	
	
	

	public User() {
		
	}
	
	
	public User(int id,String fistName,String lastName,String email,String course,String country) {
		
		this();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
		this.course = course;
		this.country = country;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	

}
