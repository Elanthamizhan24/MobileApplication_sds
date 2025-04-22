package com.MobileApplication.Exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class NameNotFoundException extends Exception{
	
	public NameNotFoundException(String message) {
		super(message);
	}
 
}
