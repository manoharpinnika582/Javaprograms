package com.kodnest.userdefined.arrays;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Employees : ");
		Employee []e=new Employee[scanner.nextInt()];
		for(int i=0;i<e.length;i++) {
			e[i]=new Employee();
		}
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter Name and Age of : "+(i+1));
			scanner.nextLine();
			e[i].name=scanner.nextLine();
			e[i].age=scanner.nextInt();
		}
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].name+" : "+e[i].age);
		}
	}
}
