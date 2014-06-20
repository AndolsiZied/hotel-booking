package com.ando.booking.logic.facade;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.neo4j.kernel.impl.transaction.SpringTransactionManager;
import org.neo4j.kernel.impl.transaction.UserTransactionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.ando.booking.logic.repository.RepositoryConfiguration;
import com.ando.booking.logic.service.ServiceConfiguration;

@Configuration
@Import(value = ServiceConfiguration.class)
@ComponentScan(basePackages = "com.ando.booking.logic")
@EnableTransactionManagement
public class FacadeConfiguration {

	@Autowired
	private RepositoryConfiguration repositoryConfiguration;

	@Bean
	public TransactionManager springTransactionManager() {
		return new SpringTransactionManager(repositoryConfiguration.getGraphDataBase());
	}

	@Bean
	public UserTransaction userTransaction() {
		return new UserTransactionImpl(repositoryConfiguration.getGraphDataBase());
	}

	@Bean
	public JtaTransactionManager transactionManager() {
		return new JtaTransactionManager(userTransaction(), springTransactionManager());
	}

}
