package com.mave.Restapi.control;

import org.springframework.web.bind.annotation.RestController;

import com.mave.Restapi.entit.VechicalEn;
import com.mave.Restapi.model.vehicalDetail;
import com.mave.Restapi.servic.VehicalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("api/vechical")
public class VechicalController {
	VechicalEn vechicalEn;
	
	VehicalService vehicalService;

	public VechicalController(VehicalService vehicalService) {
		super();
		this.vehicalService = vehicalService;
	}
	

	@PostMapping("/save")
	public VechicalEn createvechicaldetail(@RequestBody vehicalDetail vehicalDetail) {
		//TODO: process POST request
		VechicalEn vechicalEn= vehicalService.createvehical(vehicalDetail);
		return vechicalEn;
	}
	
	@GetMapping("/{vno}")
	public VechicalEn findById(@PathVariable int vno) {
		
		return vehicalService.getById(vno);
		
	}
	
	@PutMapping("update/{vno}")
	public VechicalEn updatedById(@PathVariable int vno, @RequestBody vehicalDetail vehicalDetail ) {
		//TODO: process PUT request
		
		return vehicalService.updatedById(vno,vehicalDetail) ;
	}
	
	@DeleteMapping("/{vno}")
	public void deletById(@PathVariable int vno) {
		
		 vehicalService.deleteById(vno);
	}
	
}
