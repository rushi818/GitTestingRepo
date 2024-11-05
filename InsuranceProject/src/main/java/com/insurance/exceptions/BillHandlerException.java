package com.insurance.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BillHandlerException {

	@ExceptionHandler(value = {BillNotFoundException.class})
	public ResponseEntity<Object> getHandlerEmployee(BillNotFoundException idNotFoundException)
	{
		BillException billException = new BillException (idNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(billException,HttpStatus.NOT_FOUND);
	}
}
