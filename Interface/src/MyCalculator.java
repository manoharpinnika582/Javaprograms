import java.util.Scanner;

public class MyCalculator implements Calculator{
	Scanner scanner=new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("Addition: "+(a+b));
	}

	@Override
	public void sub() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("Addition: "+(a-b));		
	}

	@Override
	public void mul() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("Addition: "+(a*b));		
	}

	@Override
	public int div() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		return a/b;
	}
}
