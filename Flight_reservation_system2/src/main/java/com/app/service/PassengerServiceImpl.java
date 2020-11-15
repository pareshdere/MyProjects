package com.app.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Passenger;

@Service
@Transactional
public class PassengerServiceImpl implements IPassengerService {

	@Autowired
	private EntityManager mgr;
	
	@Override
	public Passenger addPassenger(Passenger p) {
		return mgr.merge(p);
	}

}
