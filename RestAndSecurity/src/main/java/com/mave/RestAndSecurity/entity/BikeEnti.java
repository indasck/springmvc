package com.mave.RestAndSecurity.entity;

import com.mave.RestAndSecurity.model.Bikemodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Bike")
public class BikeEnti {
	
	   @Id
		private int BikeNo;
		private String Bikename;
		private double Bikeprice;

}
