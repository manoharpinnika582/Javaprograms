import java.util.Scanner;

public class PetersonNumberApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number TO check it Peterson Number Or Not");
		int num=scanner.nextInt();
		int res=PetersonNumber.checkNumber(num);
		if(res==num) {
			System.out.println("Entered Number is Peterson "+res);
		}
		else {
			System.out.println("Entered Number is not Peterson "+res);
		}
	}

}
