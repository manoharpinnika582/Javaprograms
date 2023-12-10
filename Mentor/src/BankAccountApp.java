import java.util.Scanner;

public class BankAccountApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		BankAccount account=new BankAccount(scanner.nextLong(), scanner.next());
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Account Holder Name: "+account.getHolderName());
		scanner.close();
	}
}
