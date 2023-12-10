import java.util.Scanner;

public class MyCalculator1 implements Calculator{
	Scanner scanner=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if(a==0|| b==0)
			System.out.println("IDIOT FOR THIS YOU NEED CALCULATOR....");
		System.out.println("Addition: "+(a+b));
	}

	@Override
	public void sub() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if(a==0|| b==0)
			System.out.println("IDIOT FOR THIS YOU NEED CALCULATOR....");
		System.out.println("Addition: "+(a-b));
	}

	@Override
	public void mul() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if(a==0|| b==0)
			System.out.println("IDIOT FOR THIS YOU NEED CALCULATOR....");
		System.out.println("Addition: "+(a*b));
	}

	@Override
	public int div() {
		System.out.println("Enter 2 numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		if( b==0)
			System.out.println("IDIOT WHO TAUGHT YOU MATHS... ");
		return a/b;
	}
	
}
