package com.mave.Restapi.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mave.Restapi.entit.HospitalDetails;
import com.mave.Restapi.entit.Hospitalent;
import com.mave.Restapi.service.HospitalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

@Autowired	
HospitalService hospitalService;	

Hospitalent hospitalent;
	
	@PostMapping()
	public Hospitalent postMethodName(@RequestBody HospitalDetails hospitalDetails) {
		Hospitalent hospitalent= hospitalService.createhospitalDetail(hospitalDetails);
		return hospitalent;
		
		
	}
	
	@GetMapping("/{hno}")
	public Hospitalent getMethodName(@PathVariable int hno) {
		return hospitalService.gethospitalDetails(hno);
		
	}
	
	
	@PutMapping("/update/{hno}")
	public Hospitalent updatehospital(@PathVariable int hno, @RequestBody HospitalDetails hospitalDetails) {		
		return hospitalService.updatedhospitalDetails(hno, hospitalDetails);
	}
	
	@GetMapping("/getall")
	public List<Hospitalent> getMethodName() {
		return hospitalService.getAllhospitalDetails();
	}
	

}