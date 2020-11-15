
package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "passenger") 
public class Passenger{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "firstname") 
	private String firstName;
  
	@Column(name = "lastname") 
	private String lastName;

	private String email;

	@Column(name = "phone_no" ,length = 10) 
	private String phoneNo;
	
	@OneToOne(mappedBy = "currentPassenger",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Reservation reservation;
	
	@OneToOne
	@JoinColumn(name = "flight_id")
	private Flight my_flight;
	
	public Passenger() { 
		System.out.println("in Passanger const"); 
	}

	public Passenger(String firstName, String lastName, String email, String phoneNo, Reservation reservation,
			Flight my_flight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.reservation = reservation;
		this.my_flight = my_flight;
	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Flight getMy_flight() {
		return my_flight;
	}

	public void setMy_flight(Flight my_flight) {
		this.my_flight = my_flight;
	}

	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNo="
				+ phoneNo + ", my_flight=" + my_flight + "]";
	}
	
	

 }