package com.example.Gradle2.map;

import com.example.Gradle2.entit.product;
import com.example.Gradle2.entit.productentit;

public class proconnect {

	public productentit moduleToEntit(product product) {
		
		productentit productentit= new productentit();
		productentit.setPid(product.getPid());
		productentit.setPname(product.getPname());
		productentit.setPrice(product.getPrice());
		
		
		return productentit;
		
	}
}
