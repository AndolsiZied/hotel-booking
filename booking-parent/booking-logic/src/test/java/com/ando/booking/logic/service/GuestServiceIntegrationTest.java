package com.ando.booking.logic.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class {@link GuestServiceIntegrationTest} tests behavior of {@link GuestService} methods and related layers.
 * 
 * @author Zied ANDOLSI
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context-logic-all-test.xml" })
public class GuestServiceIntegrationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuestServiceIntegrationTest.class);

	@Autowired
	private GuestService guestService;

	@Test
	public void findAll() {
		LOGGER.debug("starting test findAll method...");
		LOGGER.debug("testing saveGuest method ends.");
	}

}
