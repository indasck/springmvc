package com.microservice.MicroPrcatice.controll;

import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mipraticeContorll {

	@Autowired
	private Environment envi;
	
	@GetMapping("/mpractice")
	public String getmicro() {
		String port= envi.getProperty("server.port");
		String msg= "this is micropractice...("+port+")";
		return msg;
		
	}
}
