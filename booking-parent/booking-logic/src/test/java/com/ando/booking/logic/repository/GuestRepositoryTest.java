package com.ando.booking.logic.repository;

import static com.lordofthejars.nosqlunit.neo4j.Neo4jRule.Neo4jRuleBuilder.newNeo4jRule;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ando.booking.logic.domain.entities.Guest;
import com.google.common.collect.Lists;
import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.core.LoadStrategyEnum;
import com.lordofthejars.nosqlunit.neo4j.Neo4jRule;

/**
 * This class {@link GuestRepositoryTest} tests behavior of the {@link GuestRepository} methods.
 * 
 * @author Zied ANDOLSi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/application-context-logic-all-test.xml" })
public class GuestRepositoryTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuestRepositoryTest.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private GuestRepository guestRepository;

	@Rule
	public Neo4jRule neo4jRule = newNeo4jRule().defaultSpringGraphDatabaseServiceNeo4j();

	@Test
	@UsingDataSet(locations = "/com/ando/booking/logic/repository/repository-dataset.xml", loadStrategy = LoadStrategyEnum.CLEAN_INSERT)
	public void findAll() {
		LOGGER.debug("starting test findAll method...");
		EndResult<Guest> guests = guestRepository.findAll();
		assertNotNull(guests);
		assertTrue("size of returned list must be 2", Lists.newArrayList(guests.iterator()).size() == 2);
		LOGGER.debug("testing saveGuest method ends.");
	}

}
