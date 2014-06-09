package com.ando.booking.logic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.repository.GuestRepository;
import com.ando.booking.logic.service.GuestService;

/**
 * This class implements the guest service operations.
 * 
 * @author Zied ANDOLSI
 */
@Service
public class GuestServiceImpl extends GenericServiceImpl<Guest> implements GuestService {

	/**
	 * Constructor that injects the required repository.
	 * 
	 * @param guestRepository
	 *            guestRepositroy bean.
	 */
	@Autowired
	public GuestServiceImpl(GuestRepository guestRepository) {
		super();
		this.repository = guestRepository;
	}

}
