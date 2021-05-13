package com.game.hit.exception;

public class ErrorResponse {
	private String message;
	private Integer status;
	public ErrorResponse(String message, Integer status) {
		super();
		this.message = message;
		this.status = status;
	}
	public ErrorResponse() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
