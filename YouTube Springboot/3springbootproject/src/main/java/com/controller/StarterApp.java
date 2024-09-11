package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration  // to five the sever
@ComponentScan   // without this it will 404 error on sever
public class StarterApp {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(StarterApp.class);
		springApplication.run();
	}
}
