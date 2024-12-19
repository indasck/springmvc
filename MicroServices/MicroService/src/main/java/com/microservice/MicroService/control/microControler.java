package com.microservice.MicroService.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class microControler {

	@Autowired
	private Environment envi;
	
	@GetMapping("/micro")
	public String getcontrol() {
		        String port= envi.getProperty("server.port");
		        String msg= "micromsg...("+port+")";
		return msg;
	}
}
