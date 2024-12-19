package com.example.Gradle2.entit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class product {

	private int pid;
	private String pname;
	private double price;
}
