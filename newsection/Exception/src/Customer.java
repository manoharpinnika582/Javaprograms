import java.util.Scanner;

public class Customer {
	int accno=1111;
	int pwd=2222;
	int accountNumber;
	int password;
	int count=0;
	
	public void takeInput(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Your AccNo");
		accountNumber=scanner.nextInt();
		System.out.println("Enter Your Password");
		password=scanner.nextInt();
		
	}
	
	public void verify() throws InvalidAccnoOrPwdException{
		if(accountNumber==accno && password==pwd) {
			System.out.println("Welcome to Kodnest Bank.....");
		}
		
		else {
			++count;
			System.out.println("Finished "+count+" Attemp");
			InvalidAccnoOrPwdException iap=new InvalidAccnoOrPwdException();
			System.out.println(iap.getMessage()+" Accno: "+accountNumber+" Password: "+password);
			throw iap;
		}
	}
}
