package com.mave.springMVCex_pract.model.entit;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class productEntit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	//@NotEmpty(message = "name must not null")
	private String proname;
	
	//@NotEmpty(message = "brand must not null")
	private String brand;
	
	//@Min(0)
	private double price;
	
	private MultipartFile imagefile;

}
