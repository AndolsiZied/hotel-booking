package com.ando.booking.presentation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ando.booking.logic.facade.BookingFacade;
import com.ando.booking.logic.util.exception.BookingLogicException;

@Controller
public class GuestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuestController.class);

	@Autowired
	private BookingFacade bookingFacade;

	@RequestMapping("/guest_list.html")
	public ModelAndView getListUsersView() {
		LOGGER.debug("Received request to get guest list view");
		ModelMap model = new ModelMap();
		try {
			model.addAttribute("users", bookingFacade.getAllGuests());
		} catch (BookingLogicException e) {
			LOGGER.error("error occurred when trying to load all guests : " + e.getLocalizedMessage());
		}
		return new ModelAndView("guest_list", model);
	}
}