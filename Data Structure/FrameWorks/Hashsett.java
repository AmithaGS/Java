package DataStructures.ArraysFrameworks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Hashsett {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		// Step 1: Create HashSet to store Unique Person objects
		HashSet<Person> people = new HashSet<>();
		
		// Step 2: Read the number of people
		
		int n = sc.nextInt();
		sc.nextLine();
		
		// Step 3: Add person objects to HashSet
		
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			Person person = new Person(name, age);
			people.add(person);
		}
		
		// Step 4: print the contents of the HashSet
		
		System.out.println("Unique people in the HashSet: ");
		for (Person p : people) {
			System.out.println(p);
		}
		sc.close();
	}
}

// Step 5: Define the Person class with hashCode() and equals() methods

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person person = (Person) obj;
		return age == person.age && name.equals(person.name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person{name='" + name + "' , age=" + age +"}";
	}	
}

