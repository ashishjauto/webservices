package com.aj.webservices.salutations;

public class Namaskara {
	
	
	private String message;
	
	public Namaskara(String message) {
		 
		this.message = message;
	}
	

	@Override
	public String toString() {
		return "Namaskara [message=" + message + "]";
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	

}
