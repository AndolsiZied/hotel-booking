package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.common.BookingStatus;
import com.ando.booking.logic.domain.entities.Booking;
import com.ando.booking.logic.domain.entities.Guest;

/**
 * GuestBooking entity mapping relationship between booking and service nodes.
 * 
 * @author Zied ANDOLSI
 */
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

	private BookingStatus status;

	/**
	 * Default constructor.
	 */
	public GuestBooking() {

	}

	/**
	 * Creates new relationship between a guest and a booking with default booking's status.
	 * 
	 * @param guest
	 *            a guest entity
	 * @param booking
	 *            a booking entity
	 */
	public GuestBooking(Guest guest, Booking booking) {
		this(guest, booking, BookingStatus.RESERVED);
	}

	/**
	 * Creates new relationship between a guest and a booking with booking's status received as parameter..
	 * 
	 * @param guest
	 *            a guest entity
	 * @param booking
	 *            a booking entity
	 * @param status
	 *            booking's status
	 */
	public GuestBooking(Guest guest, Booking booking, BookingStatus status) {
		this.guest = guest;
		this.booking = booking;
		this.status = status;
	}

	// getter and setter
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

	public BookingStatus getStatus() {
		return status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}
}
