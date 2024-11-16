package com.Mobile.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Mobile.Exception.CustomException;

@RestControllerAdvice
public class GlobalException {

	
	
	
		@ExceptionHandler(CustomException.class)
		public ResponseEntity<Object>handleprice(CustomException pr)
		{
			return new ResponseEntity<>("brand not Found Exception",HttpStatus.BAD_REQUEST);
		}
	
}
