package com.mave.RestAndSecurity.exceptandSecur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BikeExceptionHandler {

	@ExceptionHandler(value= {BikeNotFoundException.class})
	public ResponseEntity<Object> handlerbikenotfoundException(BikeNotFoundException bikeNotFoundException){
		
		BikeException bikeException= new BikeException(
		bikeNotFoundException.getMessage(),
		bikeNotFoundException.getCause(),
		 HttpStatus.NOT_FOUND
		
		);
		return new ResponseEntity<Object>(bikeException, HttpStatus.NOT_FOUND);
		
	}
}
