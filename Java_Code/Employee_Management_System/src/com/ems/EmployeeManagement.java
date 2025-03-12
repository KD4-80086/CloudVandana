package com.ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, "Aditya", 50000);
        Employee emp2 = new Employee(2, "Pranav", 60000);
        Employee emp3 = new Employee(3, "Varad", 70000);
        
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        
        System.out.println("Employee Details:");
        list.stream().forEach(Employee::displayDetails);

	}
	
	

}
