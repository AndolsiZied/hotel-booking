package com.ando.booking.logic.service;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.data.neo4j.conversion.Handler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ando.booking.logic.domain.entities.Guest;
import com.ando.booking.logic.repository.GuestRepository;
import com.ando.booking.logic.service.impl.GuestServiceImpl;
import com.ando.booking.logic.util.exception.DataBaseException;

/**
 * This class {@link GuestServiceTest} tests behavior of {@link GuestService} methods.
 * 
 * @author Zied ANDOLSI
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context-logic-all-test.xml" })
public class GuestServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuestServiceTest.class);

	private GuestService guestService;

	private GuestRepository guestRepository;

	@Before
	public void doSetup() {
		guestRepository = mock(GuestRepository.class);
		guestService = new GuestServiceImpl(guestRepository);
	}

	@Test
	public void findAll() {
		LOGGER.debug("starting test findAll method...");
		EndResult<Guest> guests = new EndResult<Guest>() {

			@Override
			public Iterator<Guest> iterator() {
				List<Guest> guests = new ArrayList<Guest>();
				guests.add(new Guest());
				return guests.iterator();
			}

			@Override
			public Guest singleOrNull() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Guest single() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void handle(Handler<Guest> handler) {
				// TODO Auto-generated method stub

			}

			@Override
			public void finish() {
				// TODO Auto-generated method stub

			}

			@Override
			public <C extends Iterable<Guest>> C as(Class<C> container) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		when(guestRepository.findAll()).thenReturn(guests);
		try {
			guestService.findAll();
		} catch (DataBaseException e) {
			LOGGER.error("Error occurred when trying to load all guests : " + e.getLocalizedMessage());
			fail("Error occurred when trying to load all guests : " + e.getLocalizedMessage());
		}
		LOGGER.debug("testing saveGuest method ends.");
	}
}
