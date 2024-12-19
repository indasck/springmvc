package com.mave.RestAndSecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mave.RestAndSecurity.entity.BikeEnti;
import com.mave.RestAndSecurity.exceptandSecur.BikeNotFoundException;
import com.mave.RestAndSecurity.model.Bikemodel;
import com.mave.RestAndSecurity.reposit.BikeRepository;

@Service
public class BikeService {
	@Autowired
	BikeRepository bikeRepository;
	
	public BikeEnti createBikeinfo(Bikemodel bikemodel) {
		
		BikeEnti bikeEnti= new BikeEnti();
		
		bikeEnti.setBikeNo(bikemodel.getBikeNo());
		bikeEnti.setBikename(bikemodel.getBikename());
		bikeEnti.setBikeprice(bikemodel.getBikeprice());
		
		BikeEnti bikee= bikeRepository.save(bikeEnti);
		try {
		return bikee;
		}catch (Exception e) {
			// TODO: handle exception
			throw new BikeNotFoundException("the bike is problem");
		}
	}

	public Optional<BikeEnti> getbikeDetail(int bikeno) {
		
		return bikeRepository.findById(bikeno);
		
	}
	

}
