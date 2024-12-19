package com.mave.MicroServices1.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mave.MicroServices.user.user;

@RestController
@RequestMapping("/informe")
public class infoController {
	
	@Autowired
	informe informe;
	
	@GetMapping(value="/{infoid}")
	public informe getinforme(@PathVariable("infoid") String infoid) {
     String url= "http://localhost:8011/users/1";
	informe informe= new informe(infoid, "namer", null);
	RestTemplate restTemplate= new RestTemplate();
	
	user user= restTemplate.getForObject(url,user.class );
	informe.setUser(user);
	return informe;
	}
}
