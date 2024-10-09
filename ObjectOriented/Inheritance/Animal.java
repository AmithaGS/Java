package Inheritance;

public class Animal {
	public static void main(String[] args) {
		AnimalRun d = new Dog();               //up-casting 
		d.sound();
		
		AnimalRun c = new Cat();               //up-casting
		c.sound();
	}
}

class AnimalRun {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends AnimalRun {
	void sound() {
		System.out.println("Dog barks!!!");
	}
}

class Cat extends AnimalRun {
	void sound() {
		System.out.println("Cat meow!!!");
	}
}

