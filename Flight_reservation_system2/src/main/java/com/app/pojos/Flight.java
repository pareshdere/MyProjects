package com.app.pojos;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fid")
	private int flightId;
	@Enumerated(EnumType.STRING)
    private Airlines airline;
	@Enumerated(EnumType.STRING)
    @Column(name = "departure_city")
    private City departureCity;
	@Enumerated(EnumType.STRING)
    @Column(name = "arrival_city")
    private City arrivalCity;
    @Column(name = "date_of_departure")
    private LocalDate dateOfDeparture;
    @Column(name = "departure_time")
    private Time departureTime;
    
    public Flight() {
		System.out.println("in flight const");
	}

	public Flight(Airlines airline, City departureCity, City arrivalCity, LocalDate dateOfDeparture, Time departureTime) {
		super();
		this.airline = airline;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.departureTime = departureTime;
	}
	
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public Airlines getAirline() {
		return airline;
	}

	public void setAirline(Airlines airline) {
		this.airline = airline;
	}

	public City getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(City departureCity) {
		this.departureCity = departureCity;
	}

	public City getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(City arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public LocalDate getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(LocalDate dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airline=" + airline + ", departureCity=" + departureCity
				+ ", arrivalCity=" + arrivalCity + ", dateOfDeparture=" + dateOfDeparture + ", departureTime="
				+ departureTime + "]";
	}
	
	
    
}
