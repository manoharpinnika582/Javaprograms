import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String t chock palindrome or not");
		String str=scanner.next();
		isPalindrome(str);
	}
	public static void isPalindrome(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		 if(str.equalsIgnoreCase(str1)) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Not Palindrome");
		 }
	}
}
