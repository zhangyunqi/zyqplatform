package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	static{
		Logger logger = Logger.getLogger(DemoApplication.class);
		logger.info("111111");
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
