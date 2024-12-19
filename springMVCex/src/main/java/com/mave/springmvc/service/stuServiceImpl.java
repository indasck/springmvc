package com.mave.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mave.springmvc.Enti.studentEnti;
import com.mave.springmvc.reposit.stuRepository;

@Service
public class stuServiceImpl implements stuService{
	
	@Autowired
	private stuRepository stuRepository;

	@Override
	public boolean savestu(studentEnti studentEnti) {
	studentEnti stuEnti  = stuRepository.save(studentEnti);
		return stuEnti.getSId()!=null;
	}

}
