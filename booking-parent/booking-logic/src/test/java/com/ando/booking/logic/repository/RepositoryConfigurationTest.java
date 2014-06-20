package com.ando.booking.logic.repository;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.mapping.Neo4jMappingContext;

@Configuration
@EnableNeo4jRepositories("com.ando.booking.logic.repository")
public class RepositoryConfigurationTest {

	@Bean
	public GraphDatabaseFactory graphDbFactoryBean() {
		return new GraphDatabaseFactory();
	}

	@Bean
	public GraphDatabaseService graphDatabaseServiceBean() {
		return graphDbFactoryBean().newEmbeddedDatabase("target/config-test");
	}

	@Bean
	public Neo4jTemplate neo4jTemplate() {
		return new Neo4jTemplate(graphDatabaseServiceBean());
	}

	@Bean
	public Neo4jMappingContext neo4jMappingContext() {
		return new Neo4jMappingContext();
	}

}
