import java.util.Scanner;

public class LowerToUpperApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=scan.nextLine();
		LowerToUpper lowerToUpper=new LowerToUpper();
		lowerToUpper.converter(str);
	}

}
