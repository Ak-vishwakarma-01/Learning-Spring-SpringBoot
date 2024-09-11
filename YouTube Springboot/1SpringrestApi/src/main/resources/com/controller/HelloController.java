package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	// need to add every dependency manually with its version
	// we need to add sever also to deploy server
	@GetMapping("/home")
	public static void main(String... ak[]) {
		return "Hello to my page"
	}
}
