package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.entities.Booking;
import com.ando.booking.logic.domain.entities.Room;

@RelationshipEntity(type = "LINKED_TO")
public class BookingRoom {
	
	@GraphId
	private Long id;
	@Fetch
	@StartNode
	private Booking booking;
	@Fetch
	@EndNode
	private Room room;
}
