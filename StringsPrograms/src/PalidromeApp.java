import java.util.Scanner;

public class PalidromeApp {

	public static void main(String[] args) {
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a String");
			String s1=scanner.nextLine();
			System.out.println("String Before Reverse=====> "+s1);
			Palindrom palindrom=new Palindrom();
			boolean res=palindrom.isPalindrome(s1);
			if(res==true) {
				System.out.println("String is palindrome");
			}
			else {
				System.out.println("String is not palindrome");
			}

		}

	}

}


