package com.MobileApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalException {

	@ExceptionHandler(NameNotFoundException.class)
	
	public ResponseEntity<Object>NameNot(NameNotFoundException ne){
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	
	public ResponseEntity<Object>IdNot(IdNotFoundException ie){
		return new ResponseEntity<Object>(ie.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ObjectNotFoundException.class)
	
	public ResponseEntity<Object>objNot(ObjectNotFoundException oe){
		return new ResponseEntity<Object>(oe.getMessage(),HttpStatus.NOT_FOUND);
	}
}
