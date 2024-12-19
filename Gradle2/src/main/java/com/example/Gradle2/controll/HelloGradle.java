package com.example.Gradle2.controll;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradle{
	
	@PostMapping(value="/api")
	public String HelloBoot() {
		
		System.out.println("this is gradle project");
		return "this is gradle";

		
	}

}
