package com.mave.RestAndSecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bikemodel {

	private int BikeNo;
	private String Bikename;
	private double Bikeprice;
}
