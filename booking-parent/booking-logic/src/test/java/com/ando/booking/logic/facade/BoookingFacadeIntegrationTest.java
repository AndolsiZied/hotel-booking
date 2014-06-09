package com.ando.booking.logic.facade;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.util.exception.BookingLogicException;

/**
 * This class {@link BoookingFacadeIntegrationTest} tests behavior of the Booking logic tier operations with related
 * layers.
 * 
 * @author Zied ANDOLSI
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context-logic-all-test.xml" })
public class BoookingFacadeIntegrationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(BoookingFacadeIntegrationTest.class);

	@Autowired
	private BookingFacade bookingFacade;

	@Test
	public void createGuest() {
		LOGGER.debug("starting test createGuest method...");
		Guest guest = new Guest();
		guest.setFirstName("Zied");
		guest.setLastName("Andolsi");
		assertNotNull(bookingFacade);
		try {
			bookingFacade.createGuest(guest);
		} catch (BookingLogicException e) {
			LOGGER.error("error occurred when trying to create guest : " + e.getLocalizedMessage());
			fail("error occurred when trying to create guest : " + e.getLocalizedMessage());
		}

		LOGGER.debug("testing createGuest method ends.");
	}
}
