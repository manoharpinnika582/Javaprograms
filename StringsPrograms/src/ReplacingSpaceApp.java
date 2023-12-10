import java.util.Scanner;

public class ReplacingSpaceApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A String");
		String s=scanner.nextLine();
		ReplacingSpace theReplacingSpace=new ReplacingSpace();
		theReplacingSpace.replaceSpace(s);
	}

}
