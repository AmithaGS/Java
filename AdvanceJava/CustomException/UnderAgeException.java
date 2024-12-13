package com.advanceJava.CustomException;

public class UnderAgeException extends Exception {
	
	public String getMessage() {
		return "You are too young to get married please wait....";
	}
}
