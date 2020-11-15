package com.app.pojos;
  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
  
  @Entity 
  @Table(name = "reservation")
  public class Reservation{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pnr;
	
  	@OneToOne
  	@JoinColumn(name="passenger_id") 
  	private Passenger currentPassenger;
  	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="flight_id") private Flight currentFlight;
	 */
  	
  	public Reservation() { 
  		System.out.println("in reservation const"); 
  	}
  	
	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public Passenger getCurrentPassenger() {
		return currentPassenger;
	}

	public void setCurrentPassenger(Passenger currentPassenger) {
		this.currentPassenger = currentPassenger;
	}

	/*
	 * public Flight getCurrentFlight() { return currentFlight; }
	 * 
	 * public void setCurrentFlight(Flight currentFlight) { this.currentFlight =
	 * currentFlight; }
	 */
	public Reservation(Passenger currentPassenger) {
		super();
		this.currentPassenger = currentPassenger;
	}

	@Override
	public String toString() {
		return "Reservation [pnr=" + pnr + ", currentPassenger=" + currentPassenger + "]";
	}
 
  }
 