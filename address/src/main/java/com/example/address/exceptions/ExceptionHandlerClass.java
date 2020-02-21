package com.example.address.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.address.bean.CustomError;

@ControllerAdvice
public class ExceptionHandlerClass {

	CustomError customError = new CustomError();
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<CustomError> handleException(final Exception exp){
		customError.setStatus("FAILURE");
		customError.setMessage(exp.getMessage());
		return new ResponseEntity<CustomError>(customError, HttpStatus.BAD_REQUEST);
	}
}
