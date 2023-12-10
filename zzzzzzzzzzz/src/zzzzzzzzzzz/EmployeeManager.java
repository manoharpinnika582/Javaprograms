package zzzzzzzzzzz;

import java.util.Scanner;

public class EmployeeManager {
	private Employee e[];
	private int size;
	private int capacity;
	
	public EmployeeManager(int capacity) {
		
		e=new Employee[capacity];
		this.capacity=capacity;
		size=0;
	}

	public void addEmployee(String name, double salary) {
		if(size<capacity) {
			e[size]=new Employee(name, salary);
			System.out.println("Employee ID for the given Employee is:"+e[size].getId());
			size++;
		}
		else {
			System.out.println("No vacancy In the Company.....");
		}

	}
	public void displayEmployee(int id) {
		for(int i=0;i<size;i++) {
			if(id==e[i].getId()) {
				System.out.println("Employee Details:");
				System.out.println("Employee ID: "+e[i].getId());
				System.out.println("Employee Name: "+e[i].getName());
				System.out.println("Employee Salary: "+e[i].getSalary());
				System.out.println("====================================");
			}
		}
	}
	public void allEmployee() {
		for(int i=0;i<size;i++) {
				System.out.println("Employee Details:");
				System.out.println("Employee ID: "+e[i].getId());
				System.out.println("Employee Name: "+e[i].getName());
				System.out.println("Employee Salary: "+e[i].getSalary());
				System.out.println("====================================");
		}
	}
}