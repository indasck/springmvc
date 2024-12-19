package com.mave.Restapi.control;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mave.Restapi.model.promodel;

@RestController
@RequestMapping("/api/product")
public class Procontroll {

	promodel promodel;
	
	@GetMapping("/{proid}")
	public promodel   getpromodelDetails(@PathVariable int proid) {
		
		return  promodel;
		
	}
	
	@PostMapping
	public String createpromodel(@RequestBody promodel promodel) {
		this.promodel= promodel;
		
		return "create succeful";
	}
	
	@PutMapping
	public String updaepromoderDetails(@RequestBody promodel promodel) {
		this.promodel= promodel;
		
		return "update succesful";
	}
	
	@DeleteMapping("/{proid}")
	public String deletepromodel(@PathVariable int proid ) {
		return "delete succesfuly";
	}
}
