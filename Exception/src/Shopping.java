import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		shop();
		System.out.println("**********main() method ended**********");
	}
	public static void shop() {
		System.out.println("**********Shop() method started**********");
		try {
		pay();
		}catch(InputMismatchException e) {
			System.out.println("shopping has to be failed due to inappeopriate input !");
		}
		System.out.println("**********Shop() method ended**********");
	}
	public static void pay() throws InputMismatchException{
		System.out.println("**********pay() method ended**********");
		Scanner scanner=null;
		System.out.println("Enter the amount to be paid=");
		try {
			scanner=new Scanner(System.in);
			double amout=scanner.nextDouble();
			System.out.println("Your Amount= "+amout);
		}
		catch(InputMismatchException ime) {
			System.out.println("Exception Handled pay() method....");
			throw ime;
		}
		scanner.close();
		System.out.println("**********Pay() method ended**********");
	}
}
