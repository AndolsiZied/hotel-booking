package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.common.Status;
import com.ando.booking.logic.domain.entities.Booking;
import com.ando.booking.logic.domain.entities.Guest;

@RelationshipEntity(type = "BOOKED")
public class GuestBooking {
	@GraphId
	private Long id;
	@Fetch
	@StartNode
	private Guest guest;
	@Fetch
	@EndNode
	private Booking booking;
	
	private Status status;

	public GuestBooking() {

	}
	
	public GuestBooking(Guest guest, Booking booking) {
		this(guest, booking, Status.RESERVED);
	}


	public GuestBooking(Guest guest, Booking booking, Status status) {
		this.guest = guest;
		this.booking = booking;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
