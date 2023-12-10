package program;

import java.util.Scanner;

public class Perimeter {
	static double areaPerimeter(double a, double b) {
		return 2*(a+b);
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find area of paremeter");
		double d1=scan.nextDouble();
	    double d2=scan.nextDouble();
	    double res=areaPerimeter(d1, d2);
	    System.out.println("The area of paremeter is :"+res);
	}

}
