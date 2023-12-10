import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		try {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int c=a/b;
			System.out.println("Division is: "+c);
		}
		catch (ArithmeticException   | InputMismatchException e1) {
			System.out.println(e1);
		}
		finally{
			System.out.println("Hello Thank You");
		}
		scanner.close();
	}
}
