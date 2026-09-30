package com.jayant.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("Greet function is called");
		 return "Welcome to Home Page, Designed by Jayant ";
	}
	
	@RequestMapping("/about")
	public String features() {
		return "You are at about page";
	}
	
}

