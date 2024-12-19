package com.mave.Restapi.control;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mave.Restapi.model.Studenmodel;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/student")
public class studencontroller {
	
	Studenmodel studenmodel;
	
	@PostMapping
	public String createstudentdetails(@RequestBody Studenmodel studenmodel) {
		this.studenmodel= studenmodel;
		
		return "create successfully";
		
	}
	
	@GetMapping("/{sid}")
	public Studenmodel getstudentdetails(@PathVariable int sid) {
		return studenmodel;
	}
	
	
	@PutMapping("/{sid}")
	public String updatestudentdetails( @RequestBody Studenmodel studenmodel) {
		//TODO: process PUT request
		this.studenmodel= studenmodel;
		return "update successfully";
	}
	

	@DeleteMapping("/{sid}")
	public String deletestudentdetails(@PathVariable int sid) {
		return "delete succefully";
	}
}
