package com.ando.booking.logic.service;

import java.util.List;

import com.ando.booking.logic.util.exception.DataBaseException;

/**
 * The interface {@link GenericService} provides all the generic methods required to manage an entity. The provided
 * methods allow performing the CRUD operations on the regarded entity.
 * 
 * @param <Type>
 *            Class of the entity to managed by this service.
 * 
 * @author Zied ANDOLSI
 */
public interface GenericService<Type> {

	/**
	 * The method {@link #save(Object)} saves an entity to the database and returns it after the operation has been
	 * successfully performed.
	 * <p>
	 * This method is useful when some modifications are done on the entity during its insertion (auto-incremented
	 * primary key for example) and these modifications have to be loaded in the returned object.
	 * 
	 * @param entity
	 *            Entity to save in the database.
	 * @return Entity loaded from the data source once the operation has been successfully performed.
	 * @throws DataBaseException
	 *             Thrown if an exception occurs when trying to save the entity in the data source.
	 */
	Type save(Type entity) throws DataBaseException;

	/**
	 * The method {@link #findOne(Long)} loads and returns the entity whose identifier is received as parameter.
	 * <p>
	 * This method returns <code>null</code> if no entity is found in the data source.
	 * 
	 * @param id
	 *            Identifier of the entity to load.
	 * @return The entity corresponding to the identifier received as parameter. <code>null</code> if no entity is found
	 *         corresponding to the identifier.
	 * @throws DataBaseException
	 *             Thrown if an exception occurs when trying to load the entity from the data source.
	 */
	Type findOne(Long id) throws DataBaseException;

	/**
	 * The method {@link #findAll()} loads and returns all entities.
	 * <p>
	 * This method returns an empty collection if no entity is found in the data source.
	 * 
	 * @return Collection of he entity. An empty collection if no entity is found.
	 * 
	 * @throws DataBaseException
	 *             Thrown if an exception occurs when trying to load all entities from the data source.
	 */
	List<Type> findAll() throws DataBaseException;

}
