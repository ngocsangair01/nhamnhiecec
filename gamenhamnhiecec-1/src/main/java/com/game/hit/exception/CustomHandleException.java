package com.game.hit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
@RestControllerAdvice
public class CustomHandleException {
	
	@ExceptionHandler(NotFoundEx.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse notFoundErrorResponse (NotFoundEx ex, WebRequest request) {
		return new ErrorResponse(ex.getMessage(), 404);
	}

	@ExceptionHandler(DuplicateEx.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse duplicatErrorResponse (NotFoundEx ex, WebRequest request) {
		return new ErrorResponse(ex.getMessage(), 403);
	}

}
