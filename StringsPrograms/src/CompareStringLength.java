import java.util.Scanner;

public class CompareStringLength {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a 1st String");
		String s1=scanner.nextLine();
		System.out.println("Enter a 2st String");
		String s2=scanner.nextLine();
		if(s1.length()==s2.length())
		{
			System.out.println("Both string are of the same length");
		}
		else {
			System.out.println("Both string are of the different length");

		}

	}

}
