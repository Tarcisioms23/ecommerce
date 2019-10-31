package com.tarcisio.moreira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tarcisio.moreira.services.S3Service;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		s3Service.uploadFile("C:\\Users\\tmoreirs\\Documents\\temp\\Fotos\\ANA.jpg");
	}

}
