package com.restservice.db.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MongoBootApplication  extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		SpringApplication.run(MongoBootApplication.class, args);
		 new MongoBootApplication().configure(new SpringApplicationBuilder(MongoBootApplication.class)).run(args);
		    
		
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * mongodbservice.deleteAll(); mongodbservice.addSampleData();
	 * mongodbservice.listAll(); mongodbservice.findFirst();
	 * mongodbservice.findByRegex(); }
	 * 
	 */
}
