package com.mave.SprinMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mave.SprinMvc.entit.proEntit;
import com.mave.SprinMvc.reposit.proRepository;

@Service
public class ProServiceImpl implements Proservice {
	
	@Autowired
	private proRepository proRepository;

     
	@Override
	public boolean saveproentit(proEntit proEntit) {
    proEntit proEntitsave=	proRepository.save(proEntit);
	return proEntitsave.getProid() != null;	
		}


	
}
