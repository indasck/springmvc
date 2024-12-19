package com.mave.RestAndSecurity.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mave.RestAndSecurity.entity.BikeEnti;
import com.mave.RestAndSecurity.model.Bikemodel;
import com.mave.RestAndSecurity.service.BikeService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
public class BikeController {

	@Autowired
	BikeService bikeService;
	
	BikeEnti bikeEnti;
	
@GetMapping("/{no}")
public Optional<BikeEnti> getBikeDetail(@PathVariable int no) {
    return bikeService.getbikeDetail(no);
}
	
@PostMapping("/save")
public BikeEnti createBikedetail(@RequestBody Bikemodel bikemodel) {
    //TODO: process POST request
    BikeEnti bikeenti= bikeService.createBikeinfo(bikemodel);

    return bikeenti;

}
}
