package com.tarcisio.moreira.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tarcisio.moreira.services.DBService;
import com.tarcisio.moreira.services.EmailService;
import com.tarcisio.moreira.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	

	
	
	@Bean
	public boolean instatiateDatabase() throws ParseException {
		
		if (!"create".equals(strategy)) {
			return false;
		}
		dbService.instantiateTestDatabase();		
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
