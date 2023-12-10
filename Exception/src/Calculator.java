import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner	scanner=new Scanner(System.in);
		System.out.println("Entre first number");
		int a=scanner.nextInt();
		System.out.println("Enter second number");
		int b=scanner.nextInt();
		multiply(a,b);
		System.out.println("********Main() ended *******");
	}

	public static void multiply(int a, int b) {	
		System.out.println("Multiply () started");
		int product=a*b;
		System.out.println("Product is= "+product);
		devide(a,b);
		System.out.println("********Multiply() ended *******");

	}

	public static void devide(int a, int b) {
		System.out.println("Devide() Started");
		double dev=0;
		try {
			dev=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled......");
		}
		System.out.println("Devision ="+dev);
		System.out.println("********Devide() ended *******");
	}
}
