package com.ando.booking.logic.service.impl;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.ando.booking.logic.service.GenericService;

public abstract class GenericServiceImpl<Type> implements GenericService<Type> {

	protected GraphRepository<Type> repository;

	public Type save(Type entity) {
		return (Type) repository.save(entity);
	}

	public Type findOne(Long id) {
		return repository.findOne(id);
	}

}
