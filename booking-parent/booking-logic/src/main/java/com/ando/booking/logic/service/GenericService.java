package com.ando.booking.logic.service;

import java.util.List;

public interface GenericService<Type> {

	Type save(Type entity);

	Type findOne(Long id);

	List<Type> findAll();

}
