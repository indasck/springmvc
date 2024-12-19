package com.microservice.MicroServiceGreet.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MICROSERVICE")  // This assumes MICROSERVICE is registered in Eureka or service registry
public interface MyMicroserviceClient {
    @GetMapping("/microgreet")
    String getGreeting();
}


		
	

