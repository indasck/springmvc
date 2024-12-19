package com.mave.Restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class hospitalExeceptionHandler {

	@ExceptionHandler(value= {hospitalnotfoundExciption.class})
	public ResponseEntity<Object> handlehospitalnotfoundException(hospitalnotfoundExciption hospitalnotfoundExciption){
		
		hospitalException hosException= new hospitalException(
				hospitalnotfoundExciption.getMessage(),
				hospitalnotfoundExciption.getCause(),
				HttpStatus.NOT_FOUND
				);
		
		return new ResponseEntity<Object>(hosException, HttpStatus.NOT_FOUND);
}
}
