package com.usermicroservice.userms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class UsermsApplication {

	private static final Logger log = LoggerFactory.getLogger(UsermsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UsermsApplication.class, args);
	}

}
