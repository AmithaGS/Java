package com.advanceJava.CustomException;

public class OverAgeException extends Exception {
	
	public String getMessage() {
		return "Hey, you think, you are taking risk at this age ";
	}
}
