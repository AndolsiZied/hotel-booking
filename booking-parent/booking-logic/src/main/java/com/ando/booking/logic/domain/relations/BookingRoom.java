package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.entities.Booking;
import com.ando.booking.logic.domain.entities.Room;

/**
 * BookingRoom entity mapping relationship between booking and room nodes.
 * 
 * @author Zied ANDOLSI
 */
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

	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
