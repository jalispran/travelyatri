package com.travelyatri.exception;

public class DuplicateRecordException  extends RuntimeException {

	private static final long serialVersionUID = -2431811979582474502L;
	
	Object obj;
	
	public DuplicateRecordException(String msg) {
		super(msg);
	}
	
	public DuplicateRecordException(String msg, Object obj) {
		super(msg);
		this.obj = obj;
	}
}
