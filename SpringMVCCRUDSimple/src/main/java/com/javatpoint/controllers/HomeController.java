package com.javatpoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/home")
public class HomeController {
	public String home() {
		
		System.out.println("hello");
		System.out.println("Hello Pushed By faraz shaikh");
		System.out.println("hello from ap");
		System.out.println("jadjf");
		return "home";
		
	  
	}
}
