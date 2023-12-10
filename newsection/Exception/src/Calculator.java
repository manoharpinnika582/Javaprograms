import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) throws Exception{
		addition();
		substarct();
		try {
		multiply();
		}catch(Exception e) {
			
		}
		try {
			division();
			}catch(Exception e) {
				
			}
		
	}

	

	public static void addition() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers for Addition:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int res=a+b;
		System.out.println("Addition = "+res);
	
	}

	public static void substarct() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter two numbers for Substraction:");
		
		
		int sub=0;
		try {
			int a=scanner.nextInt();
			
			int b=scanner.nextInt();
		    sub=a-b;
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Handled ==>");
		}
		finally {
		System.out.println("Substraction = "+sub);
		}
	}
	public static void multiply() throws InputMismatchException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers for Multiplication:");
		
		
		int mul=0;
		try {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
		    mul=a*b;
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Handled ==> "+e);
			throw e;
		}
		finally{
		System.out.println("Multiplication = "+mul);
		}
	}

	public static void division() {
		Scanner scanner=null;
		scanner=new Scanner(System.in);
		
		System.out.println("Enter two numbers for Division:");
		int div=0;
		try {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			div=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled ===> "+e);
			throw e;
		}
		finally {
			scanner.close();
			System.out.println("Division = "+div);
		}
	}
}
