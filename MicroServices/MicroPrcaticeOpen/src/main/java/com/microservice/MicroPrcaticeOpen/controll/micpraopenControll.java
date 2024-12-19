package com.microservice.MicroPrcaticeOpen.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.MicroPrcaticeOpen.feign.OpenFeign;

@RestController
public class micpraopenControll {
	
	@Autowired
	private OpenFeign feign;
	
	@GetMapping("/mpraopen")
	public String microprace() {
		String mimsg=  feign.getmicropractice();
		String msg= "this micropractice open...,";
		return msg+mimsg;
	}

}
