package com.revature.beans;

//@Entity
//@Table(name="USER_TABLE")
public class User {
	
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}

	public User(int userId, String firstName, String lastName, String password, String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + "]";
	}
	
	

}
