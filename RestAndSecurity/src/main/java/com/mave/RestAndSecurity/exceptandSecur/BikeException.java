package com.mave.RestAndSecurity.exceptandSecur;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class BikeException {
	
	private final String message;
	private final Throwable throwable;
	private HttpStatus httpStatus;
	
	
	public BikeException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}
	
	
	
	

}
