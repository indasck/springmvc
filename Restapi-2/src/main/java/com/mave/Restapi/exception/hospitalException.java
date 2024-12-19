package com.mave.Restapi.exception;

import org.springframework.http.HttpStatus;


import lombok.Data;


@Data
public class hospitalException {

	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;
	
	public hospitalException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}
	
	
	
}
