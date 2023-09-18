package com.kodnest.userdefined.arrays;
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Students :");
		Student s[]=new Student[scanner.nextInt()];
		
		for(int i=0;i<s.length;i++) {
			s[i]=new Student();
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter the id,Name,Gender,Marks of Student:"+(i+1));
			s[i].id=scanner.nextInt();
			scanner.nextLine();
			s[i].name=scanner.nextLine();
			s[i].gender=scanner.nextLine();
			s[i].marks=scanner.nextInt();
		}
		for(int i=0;i<s.length;i++) {
			System.out.println("Details of "+(i+1)+"st Student:");
			System.out.println(s[i].id);
			System.out.println(s[i].name);
			System.out.println(s[i].gender);
			System.out.println(s[i].marks);
		}
	}
}
