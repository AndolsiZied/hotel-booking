package com.ando.booking.logic.repository;
import static com.lordofthejars.nosqlunit.neo4j.Neo4jRule.Neo4jRuleBuilder.newNeo4jRule;
import static org.junit.Assert.assertNotNull;

import java.util.Iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ando.booking.logic.domain.entities.Guest;
import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.core.LoadStrategyEnum;
import com.lordofthejars.nosqlunit.neo4j.Neo4jRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context-logic-all-test.xml"})
public class GuestRepositoryTest {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private GuestRepository guestRepository ;
	
	@Rule
    public Neo4jRule neo4jRule = newNeo4jRule().defaultSpringGraphDatabaseServiceNeo4j();
	
	@Test
	@UsingDataSet(locations = "/com/ando/booking/logic/repository/repository-dataset.xml", loadStrategy = LoadStrategyEnum.CLEAN_INSERT)
	public void saveGuest(){
		EndResult<Guest> guests=guestRepository.findAll();
		assertNotNull(guests);
		Iterator<Guest> itartor= guests.iterator();
		while(itartor.hasNext()){
			Guest guest=itartor.next();
			System.out.println(guest.getId());
			System.out.println(guest.getFirstName());
		}
	}

}
