package com.ando.booking.logic.facade;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.facade.impl.BookingFacadeImpl;
import com.ando.booking.logic.service.GuestService;
import com.ando.booking.logic.util.exception.BookingLogicException;
import com.ando.booking.logic.util.exception.DataBaseException;

/**
 * This class {@link BoookingFacadeTest} tests behavior of the Booking logic tier operations.
 * 
 * @author Zied ANDOLSI
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context-logic-all-test.xml" })
public class BoookingFacadeTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(BoookingFacadeTest.class);

	private BookingFacade bookingFacade;

	private GuestService guestService;

	@Before
	public void doSetup() {
		guestService = mock(GuestService.class);
		bookingFacade = new BookingFacadeImpl(guestService);
	}

	@Test
	public void createGuest() {
		LOGGER.debug("starting test createGuest method...");
		Guest guest = new Guest();
		guest.setId(Long.valueOf("1"));
		guest.setFirstName("Zied");
		guest.setLastName("Andolsi");
		assertNotNull(bookingFacade);

		try {
			when(guestService.save(guest)).thenReturn(guest);
			bookingFacade.createGuest(guest);
		} catch (BookingLogicException e) {
			LOGGER.error("error occurred when trying to create guest : " + e.getLocalizedMessage());
			fail("error occurred when trying to create guest : " + e.getLocalizedMessage());
		} catch (DataBaseException e) {
			LOGGER.error("error occurred when trying to create guest : " + e.getLocalizedMessage());
			fail("error occurred when trying to create guest : " + e.getLocalizedMessage());
		}

		LOGGER.debug("testing createGuest method ends.");
	}
}
