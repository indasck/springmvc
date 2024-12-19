package com.microservice.MicroServiceGreet.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.MicroServiceGreet.feign.MyMicroserviceClient;



@RestController
public class microGreetcontr {
	
	@Autowired
	private MyMicroserviceClient feignClient;

	@GetMapping("/microgreet")
	public String getcontroll() {
		  
		String fegmsg= feignClient.getGreeting();
		String msg="get controller";
		
		return fegmsg+msg;
	}
}
