package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.entities.Booking;
import com.ando.booking.logic.domain.entities.Service;

/**
 * BookingService entity mapping relationship between booking and service nodes.
 * 
 * @author Zied ANDOLSI
 */
@RelationshipEntity(type = "CONTAINS")
public class BookingService {

	@GraphId
	private Long id;
	@Fetch
	@StartNode
	private Booking booking;
	@Fetch
	@EndNode
	private Service service;

	private int number;

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

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
