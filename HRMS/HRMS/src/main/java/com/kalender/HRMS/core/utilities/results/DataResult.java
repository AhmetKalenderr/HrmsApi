package com.kalender.HRMS.core.utilities.results;

public class DataResult<T> extends Result{
	
   private T data;

	public DataResult(T data,String message, Boolean success) {
		super(message, success);
		this.data = data;
		
	}
	
	public DataResult(T data,Boolean success) {
		super(success);
		this.data=data;
	}


	
}
