package com.kalender.HRMS.core.utilities.results;

public class ErrorResult extends Result {

	public ErrorResult(String message, Boolean success) {
		super(message, false);
	}
	
	public ErrorResult(Boolean success) {
		super(false);
	}

}
