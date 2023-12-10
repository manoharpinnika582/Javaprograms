import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Withdrawal Amount");
		double withdrawal=0.0;
		try {
		withdrawal= scanner.nextDouble();
		}
		catch(InputMismatchException e) {
			System.out.println("Exception Handled ");
			e.printStackTrace();
		}
		try {
			withdrawalAmunt(withdrawal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void withdrawalAmunt(double withdrawal) throws InsuffieciantBalanceException {
		double bankBalance=100000;
		try {
		if(withdrawal>0 && withdrawal<=bankBalance) {
			System.out.println(withdrawal+" has debuted in your account");
			bankBalance-=withdrawal;
			System.out.println("Remaining Balance = "+bankBalance);
		}
		}
		catch(Exception e){
			throw new InsuffieciantBalanceException("Insufficient Bank Balance");
		}
		
	}
}
