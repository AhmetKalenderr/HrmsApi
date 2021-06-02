package com.kalender.HRMS.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(String message, Boolean success) {
		super(null, message, false);	
	}
	
	public ErrorDataResult(Boolean success) {
		super(null,false);
	}
	
	public ErrorDataResult(T data,String message,Boolean success) {
		super(data,message,false);
	}
	
	public ErrorDataResult(T data,Boolean success) {
		super(data,false);
	}
}
