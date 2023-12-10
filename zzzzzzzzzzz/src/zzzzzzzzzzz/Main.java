package zzzzzzzzzzz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of Employees:");
		EmployeeManager em=new EmployeeManager(scanner.nextInt());
		while(true) {
		System.out.println("1----> AddEmployee");
		System.out.println("2----> DisplayEmployee");
		System.out.println("3----> AllEmployee");
		System.out.print("Enter Your Choice Here:");
		int n=scanner.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter Employee Name:");
			String name=scanner.next();
			System.out.println("Enter Employee Salary");
			double salary=scanner.nextDouble();
			em.addEmployee(name, salary);
			break;
		case 2:
			System.out.println("Enter the Employee Id to Display:");
			int id=scanner.nextInt();
			em.displayEmployee(id);
			break;
		case 3:
			em.allEmployee();
		}
		
		}
	}
}
