package com.ando.booking.logic.facade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ando.booking.logic.domain.entities.Guest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context-logic-all-test.xml" })
public class BoookingFacadeTest {

	@Autowired
	private BookingFacade bookingFacade;

	@Test
	public void saveGuest() {
		Guest guest = new Guest();
		guest.setFirstName("Zied");
		guest.setLastName("Andolsi");
		assertNotNull(bookingFacade);
		bookingFacade.save(guest);
	}

}
