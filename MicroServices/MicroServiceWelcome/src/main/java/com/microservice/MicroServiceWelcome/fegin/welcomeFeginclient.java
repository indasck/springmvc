package com.microservice.MicroServiceWelcome.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="MICROSERVICE")
public interface welcomeFeginclient {

	@GetMapping("/micro")
	public String getmicro();
}
