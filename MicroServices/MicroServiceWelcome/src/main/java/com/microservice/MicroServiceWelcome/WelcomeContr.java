package com.microservice.MicroServiceWelcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.MicroServiceWelcome.fegin.welcomeFeginclient;

@RestController
public class WelcomeContr {

	@Autowired
	private welcomeFeginclient fegin;
	
	@GetMapping("/welcome")
	public String getwelcomemsg() {
		
		String welcomemsg= fegin.getmicro();
		String msg= "this is welcome...";
		
		return msg+welcomemsg;
	}
}
