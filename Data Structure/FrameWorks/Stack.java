package DataStructures.ArraysFrameworks;

import java.util.Scanner;

public class Stack {
	private static int[] st;
	private static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		int size = sc.nextInt();
		st = new int[size];
		while (true) {
			System.out.println("Please choose the operation:");
			System.out.println(" 1. Adding element \n 2. Removing element \n 3. display \n 4.exit");
			int op = sc.nextInt();
			if (op == 4) 
			break;
			switch (op) {
				case 1: System.out.println("please enter element to add: ");
					int ele = sc.nextInt();
					push(ele);
					break;
				case 2: pop();
					break;
				case 3: display();
					break;
				default: System.out.println("Invalid choice...");
			}
		}
	}

	public static void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(st[i]);
		}
	}

	public static void pop() {
		// TODO Auto-generated method stub
		if (top < 0) {
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println("Remoing element is: " + st[top]);
		st[top] = 0;      
		top--;
	}

	public static void push(int ele) {
		if (top == st.length - 1) {
			System.out.println("Stack is full!");
			return;
		}
		// TODO Auto-generated method stub
		System.out.println("Adding element: " + ele);
		top++;   // increment the top after store the element in the stack
		st[top] = ele;
	}
}
