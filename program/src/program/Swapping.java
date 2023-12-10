package program;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping without using third variable");
		System.out.println(a+" "+b);
		scan.close();
		// write a java program to calculate the parimeter of a rectangle 2(a+b)
		//write a java program to create a 
		//student obj name and age read the input for stu fields and update the values
		}
	    void swap(int a,int b) {
		int c;
	
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println(a+" "+b); 
	}
}
