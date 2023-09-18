import java.util.Scanner;

public class ReverseNumberApp {

	public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter A number to Print The Reverse order");
     int n=scanner.nextInt();
     DigitReverse digitReverse=new DigitReverse();
     System.out.println("Original Number is "+n);
     System.out.println("Reversed Number"+n+" IS "+digitReverse.findReverseNumber(n)); 
     scanner.close();
	}

}
