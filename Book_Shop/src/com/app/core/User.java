package com.app.core;

public class User {
	private String name;
	private String email;
	private String password;
	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name= " + name + " , email= " + email + " , password= " + password + "]";
	}
	public User(String email) {
		super();
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User)
			return this.email.equals(((User) obj).email);
		return false;
	}
	
}
