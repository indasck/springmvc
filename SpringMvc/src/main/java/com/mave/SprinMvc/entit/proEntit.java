package com.mave.SprinMvc.entit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class proEntit {

	@Id
	
	private Integer proid;
	private String proname;
	private String brand;
	private double price;
	
}
