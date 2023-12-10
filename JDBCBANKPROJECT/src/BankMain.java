
import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Where do you have your Account?");
		String bankname=scan.next();
		BankFactory bankf=new BankFactory();
		BankMethods ref=null;
		if(bankname.equalsIgnoreCase("kodnest")) {
			 ref=(KodnestBank) bankf.getBank(bankname);
			 System.out.println("Welcome To Kodnest Bank....");
		}
		else {
			 ref=(ManuBank) bankf.getBank(bankname);
			 System.out.println("Welcome To Manu Bank....");
		}
		
		while(true) {
			System.out.println("1====>Register Account");
			System.out.println("2====>Login Account");
			System.out.println("3====>Change Password");
			System.out.println("4====>Balance Enquiry");
			System.out.println("5====>Transfer Amount");
			System.out.println("6====>Update Profile");
			System.out.println("7====>Delete Account");
			System.out.println("8====>Check Profile");
			System.out.println("9====>Exit");
			System.out.println("Enter your Choice Here...");
			int choice =scan.nextInt();
			
			switch(choice) {
			case 1:
				ref.register();
				break;
			case 2:
				ref.login();
				break;
			case 3:
				ref.changePassword();
				break;
			case 4:
				ref.balanceEnquiry();
				break;
			case 5:
				ref.transferAmount();
				break;
			case 6:
				ref.updateProfile();
				break;
			case 7:
				ref.deleteAccount();
				break;
			case 8:
				ref.checkProfile();
				break;
			case 9:
				System.out.println("Thank you For Using My Application...");
				return;
			default:
				System.out.println("Choose the Option Corretly");
			}
			
		}
	}
}
