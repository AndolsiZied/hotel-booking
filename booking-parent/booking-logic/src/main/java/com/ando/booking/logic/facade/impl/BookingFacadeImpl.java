package com.ando.booking.logic.facade.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.facade.BookingFacade;
import com.ando.booking.logic.service.GuestService;
import com.ando.booking.logic.util.exception.BookingLogicException;
import com.ando.booking.logic.util.exception.DataBaseException;

/**
 * This class implements the Booking's logic tier facade.
 * 
 * @author Zied ANDOLSI
 */
@Service
@Transactional
public class BookingFacadeImpl extends AbstractFacade implements BookingFacade {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingFacadeImpl.class);

	public BookingFacadeImpl() {

	}

	public BookingFacadeImpl(GuestService guestService) {
		this.guestService = guestService;
	}

	/**
	 * {@inheritDoc}
	 */
	public Guest createGuest(Guest guest) throws BookingLogicException {
		LOGGER.info("starting createGuest method...");
		try {
			return guestService.save(guest);
		} catch (DataBaseException e) {
			LOGGER.error("error occured when trying to create guest.", e);
			throw new BookingLogicException(e);
		}

	}

	/**
	 * {@inheritDoc}
	 */
	public List<Guest> getAllGuests() throws BookingLogicException {
		LOGGER.info("starting getAllGuests method...");
		try {
			return guestService.findAll();
		} catch (DataBaseException e) {
			LOGGER.error("error occured when trying to load all guests.", e);
			throw new BookingLogicException(e);
		}
	}

}
