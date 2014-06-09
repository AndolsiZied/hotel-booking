package com.ando.booking.logic.facade;

import java.util.List;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.util.exception.BookingLogicException;

/**
 * Booking facade interface declaring possible operations on booking logic-tier.
 * 
 * @author Zied ANDOLSI
 * 
 */
public interface BookingFacade {

	/**
	 * The method {@link BookingFacade#createGuest(Guest)} creates a new guest.
	 * 
	 * @param guest
	 *            guest to save
	 * @return {@link Guest}
	 * @exception BookingLogicException
	 *                Thrown if an exception occurs when trying to save the guest.
	 */
	Guest createGuest(Guest guest) throws BookingLogicException;

	/**
	 * The method {@link BookingFacade#getAllGuests()} loads all guests.
	 * 
	 * @return collection of guest.
	 * @exception BookingLogicException
	 *                Thrown if an exception occurs when trying to load all guests.
	 */
	List<Guest> getAllGuests() throws BookingLogicException;;

}
