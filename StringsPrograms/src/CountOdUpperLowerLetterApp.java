import java.util.Scanner;

public class CountOdUpperLowerLetterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=scan.nextLine();
		CountodUpperLowerLetter cl=new CountodUpperLowerLetter();
		cl.countUpperLower(str);
	}

}
