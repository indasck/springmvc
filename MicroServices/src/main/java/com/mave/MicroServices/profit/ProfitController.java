package com.mave.MicroServices.profit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profit")
public class ProfitController {

	@Autowired
	profit profit;
	
	@GetMapping(value= "/{pid}")
	public profit getprofit(@PathVariable("pid") String pid) {
		List<String> message= new ArrayList<>();
		message.add("mes1");
		message.add("mes2");
		
		List<String> notification= new ArrayList<>();
		notification.add("note1");
		notification.add("note2");
		
		return new profit(pid, message, notification);
		
	}
}
