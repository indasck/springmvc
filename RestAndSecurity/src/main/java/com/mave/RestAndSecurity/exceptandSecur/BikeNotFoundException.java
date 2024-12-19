package com.mave.RestAndSecurity.exceptandSecur;

public class BikeNotFoundException extends RuntimeException{

	public BikeNotFoundException(String message, Throwable bikeno) {
		super(message, bikeno);
	}

	public BikeNotFoundException(String message) {
		super(message);
	}
	

}
