package com.mave.springSecurity.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
public class Security {

	@GetMapping("/first")
	public String getmessage() {
		return "this is spring security";
	}
	
	@GetMapping("/second")
	public String getMethodName() {
		return "this is second metod";
	}
	
}
