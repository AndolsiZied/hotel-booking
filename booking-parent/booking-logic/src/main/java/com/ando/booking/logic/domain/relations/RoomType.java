package com.ando.booking.logic.domain.relations;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

import com.ando.booking.logic.domain.entities.Room;
import com.ando.booking.logic.domain.entities.Type;

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
}
