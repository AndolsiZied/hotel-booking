package com.ando.booking.logic.facade;

import java.util.List;

import com.ando.booking.logic.domain.entities.Guest;

public interface BookingFacade {

	Guest save(Guest guest);

	List<Guest> findAllGuests();

}
