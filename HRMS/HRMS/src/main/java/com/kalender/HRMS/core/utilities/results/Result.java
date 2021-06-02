package com.kalender.HRMS.core.utilities.results;

public class Result {

	private String message;
	private Boolean success;
	
	public Result(Boolean success) {
		this.success = success;
	}

	public Result(String message, Boolean success) {
		this.message = message;
		this.success = success;
	}
	
	
	public Boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage()
	{
		return this.message;
	}
}
