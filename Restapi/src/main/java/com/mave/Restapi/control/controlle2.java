package com.mave.Restapi.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controlle2 {

	@GetMapping("/wish/{id}/name/{name}")
	public String wish(@PathVariable int id,String name) {
		return "hello this is..."+id+", name is..."+ name;
		
	}
}
