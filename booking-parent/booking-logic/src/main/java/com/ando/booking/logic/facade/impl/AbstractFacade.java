package com.ando.booking.logic.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ando.booking.logic.service.GuestService;

/**
 * Abstract generic class for booking application facade.
 * 
 * @author Zied ANDOLSI
 * 
 */
public abstract class AbstractFacade {

	/**
	 * GuestService bean declaration.
	 */
	@Autowired
	protected GuestService guestService;

}
