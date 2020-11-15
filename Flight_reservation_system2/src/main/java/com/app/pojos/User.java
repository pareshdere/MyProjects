package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer userId;
		@Column(name = "firstname")
	 	private String firstName;
		@Column(name = "lastname")
	    private String lastName;
		@Column(name = "email")
	    private String email;
		@Column(name = "password")
	    private String password;
		
		public User() {
			System.out.println("in user const");
		}
		
		public User(String firstName, String lastName, String email, String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
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
			
}
