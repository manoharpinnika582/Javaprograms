import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number what you want to sum");
		int n=scanner.nextInt();
		System.out.println(SumOfNumbers.sum(n));
		scanner.close();

	}

}
