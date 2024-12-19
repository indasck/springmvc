package com.mave.springSecurity.pen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pen {
	
	@GetMapping("/pen")
	public String write() {
		
		return "they write story for move";
	}


}
