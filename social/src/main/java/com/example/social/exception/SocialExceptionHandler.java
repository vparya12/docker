package com.example.social.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.social.bean.CustomError;


@ControllerAdvice
public class SocialExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomError> handleException(final Exception exp){
		CustomError customError = new CustomError();
		customError.setMessage(exp.getMessage());
		customError.setStatus("FAILURE");
		return new ResponseEntity<CustomError>(customError, HttpStatus.BAD_REQUEST);
	}
}
