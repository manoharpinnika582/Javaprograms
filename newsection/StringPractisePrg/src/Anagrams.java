import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two String to check anagram or not");
		String str1=scanner.next().toLowerCase();
		String str2=scanner.next().toLowerCase();
		if(str1.length()!=str2.length())
			System.out.println("Lengths or not Equal then how will it anagrams....IDIOT WHO THOUGHT U JAVA");
		else
		checkAngrams(str1,str2);
	}

	public static void checkAngrams(String str1, String str2) {
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		str1=new String(arr1);
		str2=new String(arr2);
		
		if(str1.contains(str2)) {
			System.out.println("Entered String are Anagrams");
		}
		else {
			System.out.println("Entered Strings Are not Anagrams");
		}
		
	}
}
