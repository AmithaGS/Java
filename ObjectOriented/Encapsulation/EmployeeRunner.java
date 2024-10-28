package Encapsulation;

import java.util.Scanner;

public class EmployeeRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter employee designation: ");
		String designation = sc.nextLine();
		System.out.println("Enter employee salary: ");
		int salary = sc.nextInt();
		
		Employee e = new Employee(id, name, designation, salary);
	}
}

class Employee {
	private int empId;
	private String empName;
	private String designation;
	private int salary;
	
	public Employee(int empId, String empName, String designation, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}