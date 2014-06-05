package com.ando.booking.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.repository.GuestRepository;
import com.ando.booking.logic.service.GuestService;

@Service
public class GuestServiceImpl extends GenericServiceImpl<Guest> implements
		GuestService {

	@Autowired
	public GuestServiceImpl(GuestRepository guestRepository) {
		super();
		this.repository = guestRepository;
	}

}
