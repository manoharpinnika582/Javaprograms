import java.util.Scanner;

public class SubStringApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A String");
		String s=scanner.nextLine();
		SubString theString=new SubString();
		theString.findSubString(s);
		
	}

}
