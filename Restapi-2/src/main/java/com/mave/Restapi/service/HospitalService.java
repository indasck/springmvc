package com.mave.Restapi.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mave.Restapi.entit.HospitalDetails;
import com.mave.Restapi.entit.Hospitalent;
import com.mave.Restapi.exception.hospitalnotfoundExciption;
import com.mave.Restapi.reposit.HospitalRepository;

@Service
public class HospitalService  {
	
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	public Hospitalent createhospitalDetail(HospitalDetails hospitaldetail) {
		
		Hospitalent hospitalent= new Hospitalent();
		hospitalent.setHno(hospitaldetail.getHno());
		hospitalent.setHname(hospitaldetail.getHname());
		hospitalent.setHlocation(hospitaldetail.getHlocation());
		hospitalent.setTime_date(LocalDateTime.now());
		hospitalent.setCreted_by(System.getProperty("user.name"));
		Hospitalent hospitale= hospitalRepository.save(hospitalent);
		 return hospitale;
	}

	
		public Hospitalent gethospitalDetails(int hno) {
			
		Optional<Hospitalent> hospitalent=hospitalRepository.findById(hno);
		if(hospitalent.isEmpty()) 
			throw new hospitalnotfoundExciption("the hno is not found");
		
		return hospitalent.get();
	}

		public Hospitalent updatedhospitalDetails(int hno,HospitalDetails hospitalDetails) {
		 Optional<Hospitalent> hospitalent= hospitalRepository.findById(hno);
			if(hospitalent.isPresent()) {
		 Hospitalent hospitalent2= new Hospitalent();
			hospitalent2.setHno(hospitalDetails.getHno());
			hospitalent2.setHname(hospitalDetails.getHname());
			hospitalent2.setHlocation(hospitalDetails.getHlocation());
			hospitalent2.setTime_date(LocalDateTime.now());
			hospitalent2.setCreted_by(System.getProperty("user.name"));
			
		Hospitalent hosp= hospitalRepository.save(hospitalent2);
		return hosp;
			}else {
				return null;
			}
		}
		
		public List<Hospitalent> getAllhospitalDetails() {
			return  hospitalRepository.findAll();
			
			
			
			
		}
}
