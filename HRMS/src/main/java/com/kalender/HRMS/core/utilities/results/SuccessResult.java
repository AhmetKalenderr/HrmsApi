package com.kalender.HRMS.core.utilities.results;

public class SuccessResult extends Result {

	public SuccessResult(String message, Boolean success) {
		super(message,true);
		
	}
	
	public SuccessResult(Boolean success) {
		super(true);
	}



}
