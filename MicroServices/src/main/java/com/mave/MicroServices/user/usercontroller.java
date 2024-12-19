package com.mave.MicroServices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mave.MicroServices.profit.profit;

@RestController
@RequestMapping("/users")
public class usercontroller {
	
	@Autowired
	user user;
	
	@GetMapping(value= "/{userid}")
	public user getuser(@PathVariable("userid") String userid) {
		
		user user= new user("1", "name",12345678, null);
		RestTemplate restTemplate= new RestTemplate();
		profit profit= restTemplate.getForObject("http://localhost:8011/profit/1",profit.class);
		user.setProfit(profit);
		return user;
				
	}

}
