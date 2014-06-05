package com.ando.booking.logic.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.ando.booking.logic.domain.entities.Guest;

public interface GuestRepository extends GraphRepository<Guest> {

}
