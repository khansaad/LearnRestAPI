package com.saad.webservices.restful;

public class TestBean{

	private String message;

	public TestBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TestBean [message=" + message + "]";
	}
	
	

}
