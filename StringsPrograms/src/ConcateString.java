import java.util.Scanner;

public class ConcateString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a 1st String");
		String s1=scanner.nextLine();
		System.out.println("First String :"+s1);
		System.out.println("Enter a 2st String");
		String s2=scanner.nextLine();
		System.out.println("Second String :"+s1);
		if(s1.equals(s2)) {
		System.out.println("Your Concated String is: "+s1+" "+s2);
		}
		else {
			System.out.println("Your String values are not same");
		}
	}
}
