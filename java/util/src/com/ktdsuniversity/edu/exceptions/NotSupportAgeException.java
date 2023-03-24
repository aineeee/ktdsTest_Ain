package com.ktdsuniversity.edu.exceptions;

public class NotSupportAgeException extends RuntimeException {

	private static final long serialVersionUID = -1141534712752025431L;

	public NotSupportAgeException() {
		super();
		}
	
	public NotSupportAgeException(String message) {
		super(message);
		
	}
	
	
}
