package com.ando.booking.logic.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.facade.BookingFacade;
import com.ando.booking.logic.service.GuestService;

@Service
@Transactional
public class BookingFacadeImpl implements BookingFacade {

	@Autowired
	private GuestService guestService;

	@Override
	public Guest save(Guest guest) {
		return guestService.save(guest);
	}

}
