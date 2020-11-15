package com.app.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Reservation;

@Service
@Transactional
public class ReservationServiceImpl implements IReservationService {
	
	@Autowired
	private EntityManager mgr;
	
	@Override
	public Reservation confirmReservation(Reservation r) {
		return mgr.merge(r);
	}

}
