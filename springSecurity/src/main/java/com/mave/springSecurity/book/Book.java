package com.mave.springSecurity.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book {

	@GetMapping( "/book")
	public String book() {
		
		return "book get to used by pen and pencil";
	}
}
