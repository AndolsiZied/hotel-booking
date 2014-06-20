package com.ando.booking.logic.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ando.booking.logic.repository.RepositoryConfiguration;

@Configuration
@Import(value = RepositoryConfiguration.class)
public class ServiceConfiguration {

}
