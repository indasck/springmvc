package com.example.Gradle2.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Gradle2.entit.product;
import com.example.Gradle2.entit.productentit;

public class proclient implements CommandLineRunner{
   @Autowired
	JpaRepository prorepository;
	
   @Autowired
	proconnect proconnect;

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	product product= new product();
	product.setPid(1);
	product.setPname("pen");
	product.setPrice(10);
	
	productentit productentit= proconnect.moduleToEntit(product);
    prorepository.save(productentit);
   
	
}
	
   
   
	
	
}
