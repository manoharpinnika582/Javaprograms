import java.util.Scanner;

public class NumberToStringApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		 String words = NumberToString.convertToWords(number);
	        System.out.println(number + " in words: " + words);
	}
}
