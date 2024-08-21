/*package lab24;

import java.util.Scanner;

class Employee{
	String name, address;
	long phoneNo;
	int age, salary;
	
	void print_Employee(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone No: " + phoneNo);
		System.out.println("Address: " + address);
	}
	
	void print_Salary(){
		System.out.println("Salary: " + salary);
	}
}

class Officer extends Employee{
	String specialization;
	
	void print_Specialization(){
		System.out.println("Specialization: " + specialization);
	}
}

class Manager extends Employee{
	String department;
	
	void print_Department(){
		System.out.println("Department: " + department);
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Officer of = new Officer();
		Manager ma = new Manager();
		
		System.out.println("Enter Officer details:");
		System.out.print("Name: ");
		of.name = sc.nextLine();
		System.out.print("Age: ");
		of.age = sc.nextInt();
		System.out.print("Phone No: ");
		of.phoneNo = sc.nextLong();
		System.out.print("Address: ");
		of.address = sc.next();
		System.out.print("Salary: ");
		of.salary = sc.nextInt();
		System.out.print("Specialization: ");
		of.specialization = sc.next();
		
		System.out.println("\nEnter Manager details:");
		System.out.print("Name: ");
		ma.name = sc.nextLine();
		sc.nextLine();
		System.out.print("Age: ");
		ma.age = sc.nextInt();
		System.out.print("Phone No: ");
		ma.phoneNo = sc.nextLong();
		System.out.print("Address: ");
		ma.address = sc.next();
		System.out.print("Salary: ");
		ma.salary = sc.nextInt();
		System.out.print("Department: ");
		ma.department = sc.next();
		
		sc.close();
		
		System.out.println("\nOfficer details:");
		of.print_Employee();
		of.print_Salary();
		of.print_Specialization();
		
		System.out.println("\nManager details:");
		ma.print_Employee();
		ma.print_Salary();
		ma.print_Department();
	}
	
}

*/