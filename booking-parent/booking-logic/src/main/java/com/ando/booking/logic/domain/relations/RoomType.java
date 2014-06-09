package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.entities.Room;
import com.ando.booking.logic.domain.entities.Type;

/**
 * RoomType entity mapping relationship between room and type nodes.
 * 
 * @author Zied ANDOLSI
 */
@RelationshipEntity(type = "HAS_TYPE")
public class RoomType {

	@GraphId
	private Long id;
	@Fetch
	@StartNode
	private Room room;
	@Fetch
	@EndNode
	private Type type;

	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
