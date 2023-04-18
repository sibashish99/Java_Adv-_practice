package com.java.map;

public class UserDTO {
	   private int id;
	   private String username;
	   private String email;
	   
	   
	   public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	  }


	  public UserDTO(int id, String username,  String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	   }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
}
