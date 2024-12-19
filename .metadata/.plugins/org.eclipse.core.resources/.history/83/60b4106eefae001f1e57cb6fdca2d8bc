package com.mave.springMVCex_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mave.springMVCex_1.enti.studententi;
import com.mave.springMVCex_1.reposit.stuRepository;

@Service
public class stuSeviceImpl implements stuService{

	@Autowired
	private stuRepository stuRepository;
	
	@Override
	public boolean savestu(studententi studententi) {
	studententi stuentisave= stuRepository.save(studententi);
		return stuentisave.getSId()!=null;
	}

}
