package com.ems;

public class Employee {
	
	private int id;
	private String name; 
	private double salary;

	public Employee(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name= name;
		this.salary = salary; 
	}

	public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
