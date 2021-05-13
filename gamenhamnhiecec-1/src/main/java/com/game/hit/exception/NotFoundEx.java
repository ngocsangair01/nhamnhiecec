package com.game.hit.exception;

public class NotFoundEx extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public NotFoundEx(String message) {
		super(message);
	}
}
