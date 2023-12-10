package program;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		MulDiv md=new MulDiv();
		int res1=md.mul(a,b);
		int res2=md.div(a, b);
		System.out.println("The multiplication result is :"+res1);
		System.out.println("The  Division result is :"+res2);

	}

}
