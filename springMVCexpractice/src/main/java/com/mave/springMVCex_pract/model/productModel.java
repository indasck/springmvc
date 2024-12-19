package com.mave.springMVCex_pract.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class productModel {

	private Integer pid;
	private String proname;
	private String brand;
	private double price;
	
	private MultipartFile imagefile;
}
