package com.travelyatri.exception;

public class InvalidInputFormatException extends RuntimeException{

	private static final long serialVersionUID = -413185412090741942L;
	
	Object obj;
	
	public InvalidInputFormatException(String message){
		super(message);
	}
	
	public InvalidInputFormatException(String message, Object obj) {
		super(message);
		this.obj = obj;
	}
}
