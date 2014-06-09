package com.ando.booking.logic.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.ando.booking.logic.domain.entities.Guest;

/**
 * This interface defines methods required to manage guest entity in database.
 * 
 * @author Zied ANDOLSI
 */
public interface GuestRepository extends GraphRepository<Guest> {

}
