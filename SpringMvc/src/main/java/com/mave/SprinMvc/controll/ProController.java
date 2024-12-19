package com.mave.SprinMvc.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mave.SprinMvc.entit.proEntit;
import com.mave.SprinMvc.service.ProServiceImpl;
import com.mave.SprinMvc.service.Proservice;

import ch.qos.logback.core.status.Status;

@Controller
public class ProController {
	
	@Autowired
	private Proservice proservice;
	
	//module is the empty class to get the obj from html
	@GetMapping("/")
	public String index(Model model) {
		proEntit proEntitobj= new proEntit();
		
  model.addAttribute("proEntit", proEntitobj);
		
		return "procreate";
		
	}
	
	@PostMapping("/savepro")
	public String saveIndex(proEntit proEntit, Model model) {
		  boolean proentit= proservice.saveproentit(proEntit);
		
		  if(proentit){
			  model.addAttribute("sms","it exits");
		  }else {
			  model.addAttribute("ems","it doesn't exist");
		  }
		  
		return "procreate";
		
	}
	
	
}
