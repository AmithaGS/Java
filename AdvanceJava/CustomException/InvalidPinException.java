package com.advanceJava.CustomException;

public class InvalidPinException extends Exception {
	public String getMessage() {
		return "Invalid pin Please try again....";
	}
}
