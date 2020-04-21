package model;

public class Contact {
	private String name;
	private String email;
	
	public Contact(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}	
}