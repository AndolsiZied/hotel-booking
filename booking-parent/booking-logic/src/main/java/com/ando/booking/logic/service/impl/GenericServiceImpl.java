package com.ando.booking.logic.service.impl;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.ando.booking.logic.service.GenericService;
import com.ando.booking.logic.util.exception.DataBaseException;
import com.google.common.collect.Lists;

/**
 * This class provides the basic implementations needed to manage entity.
 * 
 * @author Zied ANDOLSI
 * 
 * @param <Type>
 *            Entity's type this instance has to manage.
 */
public abstract class GenericServiceImpl<Type> implements GenericService<Type> {

	/**
	 * GraphRepository bean declaration.
	 */
	protected GraphRepository<Type> repository;

	/**
	 * {@inheritDoc}
	 */
	public Type save(Type entity) throws DataBaseException {
		return (Type) repository.save(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	public Type findOne(Long id) throws DataBaseException {
		return repository.findOne(id);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Type> findAll() throws DataBaseException {
		return Lists.newArrayList(repository.findAll());
	}

}
