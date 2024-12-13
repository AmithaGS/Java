package com.advanceJava.CustomException;

public class Matrimoney {
	void initiate() {
		User user = new User();
		try {
			user.register();
		}
		catch (Exception e) {
			try {
				user.register();
			}
			catch (Exception e1) {
				try {
					user.register();
				}
				catch (Exception e2) {
					System.out.println("You will not get married...");
				}
			}
		}
	}
}
