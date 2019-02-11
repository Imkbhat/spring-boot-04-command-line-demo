package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHelloWorld() {
		return "Hello WOrld time on Server is" +LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkOut() {
		
		return "Run Hard 5k";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		
		return "Today is ur lucky Day";
	}
}
