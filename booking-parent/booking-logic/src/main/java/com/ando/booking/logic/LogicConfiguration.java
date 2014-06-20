package com.ando.booking.logic;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ando.booking.logic.facade.FacadeConfiguration;

@Configuration
@Import(value = FacadeConfiguration.class)
public class LogicConfiguration {

}
