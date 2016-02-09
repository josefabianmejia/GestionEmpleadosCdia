package com.cdia.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {		
		
				DetailError detailError = new DetailError();
				detailError.setTitle("Mensaje no Legible");
				detailError.setTimeStamp(new Date().getTime());
				detailError.setStatus(status.value());
				detailError.setDetail(ex.getMessage());
				detailError.setDeveloperMessage(ex.getClass().getName());	
				
		return handleExceptionInternal(ex,detailError, headers, status, request);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
				DetailError detailError = new DetailError();
				detailError.setTitle("Argumantos no validos");
				detailError.setTimeStamp(new Date().getTime());
				detailError.setStatus(status.value());
				detailError.setDetail(ex.getMessage());
				detailError.setDeveloperMessage(ex.getClass().getName());	
	
		return handleExceptionInternal(ex,detailError, headers, status, request);
	}
	
}
