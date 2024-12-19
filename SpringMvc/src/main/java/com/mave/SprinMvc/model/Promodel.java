package com.mave.SprinMvc.model;

import org.springframework.web.multipart.MultipartFile;

import com.mave.SprinMvc.entit.proEntit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promodel {

	private int proid;
	private String proname;
	private String brand;
	private String catogery;
	private double price;
	
		
	}

