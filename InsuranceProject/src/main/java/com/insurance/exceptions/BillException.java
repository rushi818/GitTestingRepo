package com.insurance.exceptions;

import org.springframework.http.HttpStatus;

public class BillException {

	private final String message;
	private final HttpStatus status;
	
	public BillException(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}
}
