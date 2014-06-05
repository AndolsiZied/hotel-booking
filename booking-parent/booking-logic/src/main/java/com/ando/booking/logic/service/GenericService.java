package com.ando.booking.logic.service;


public interface GenericService<Type> {

	Type save(Type entity);

	Type findOne(Long id);

}
