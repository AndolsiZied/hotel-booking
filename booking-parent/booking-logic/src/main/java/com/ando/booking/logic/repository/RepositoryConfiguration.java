package com.ando.booking.logic.repository;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.mapping.Neo4jMappingContext;

@Configuration
@EnableNeo4jRepositories("com.ando.booking.logic.repository")
public class RepositoryConfiguration {

	// @Value("graphDb.url")
	private String graphDbUrl;

	@Bean
	public SpringRestGraphDatabase getGraphDataBase() {
		return new SpringRestGraphDatabase("http://localhost:7474/db/data");
	}

	@Bean
	public Neo4jTemplate neo4jTemplate() {
		return new Neo4jTemplate((GraphDatabaseService) getGraphDataBase());
	}

	@Bean
	public Neo4jMappingContext neo4jMappingContext() {
		return new Neo4jMappingContext();
	}
}
