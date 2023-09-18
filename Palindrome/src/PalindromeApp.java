import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
	
		     Scanner scanner=new Scanner(System.in);
		     System.out.println("Enter A number to Print The Reverse order");
		     int n=scanner.nextInt();
		     Palindrome palindrome=new Palindrome();
		     
		    int res= palindrome.findReverseNumber(n); 
		    if(n==res) {
		    	System.out.println("Entered Number Is Palindrome");
		    }
		    else {
		    	System.out.println("Entered Number Is Not Palindrome");
		    }
		     scanner.close();
	}

}
