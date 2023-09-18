import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);

	void addition(){
		System.out.println("Enter 2 number for addtion");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+ "and"+b+"is"+(a+b));
	}
	
	void substraction() {
		System.out.println("Enter 2 number for Substraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Substraction of "+a+ "and"+b+"is"+(a-b));
	}
	
	void multiplication(){
		System.out.println("Enter 2 number for multipllication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("multipllication of "+a+ "and"+b+"is"+(a*b));
	}
	
	void divition(){
		System.out.println("Enter 2 number for Divition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Divition of "+a+ "and"+b+"is"+(a/b));
	}
	
	void findReminder(){
		System.out.println("Enter 2 number for Remainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Remainder of "+a+ "and"+b+"is"+(a%b));

	}
	
	void findSquare(){
		System.out.println("Enter 2 number for Square");
		int a=scan.nextInt();
		System.out.println("Square of number "+a+"is"+(a*a));

	}


}
