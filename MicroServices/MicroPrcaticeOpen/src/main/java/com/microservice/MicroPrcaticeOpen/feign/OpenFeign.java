package com.microservice.MicroPrcaticeOpen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "MICROPRCATICE")
public interface OpenFeign {

	@GetMapping("/mpractice")
	public String getmicropractice();
	
}