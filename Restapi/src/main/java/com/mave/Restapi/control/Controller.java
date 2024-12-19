package com.mave.Restapi.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/wish/{name}")
	public  String greet(@PathVariable String name) {
		return "hello how are you man..."+name;
	}
}
