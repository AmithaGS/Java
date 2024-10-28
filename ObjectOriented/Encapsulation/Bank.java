package Encapsulation;

public class Bank {
	private int amount = 50;
	private int pin = 1231;
	
	// setter n getter method are in public aceess specifier
	
	public void setAmount(int newAmount, int password) {
		if (password == pin) {
			amount = newAmount;
		} else {
			System.out.println("Invalid access!!!!");
		}
	}
	
	public int getAmount(int password) {
		if (password == pin) {
			return amount;
		} else {
			System.out.println("Invalid access!!!!");
			return 0;
		}
	}
}

class Hero {
	
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Balance amount: "+ b.getAmount(1231));
		
		b.setAmount(20, 12310);
		System.out.println("Balance amount: "+ b.getAmount(1231));
	}
}
