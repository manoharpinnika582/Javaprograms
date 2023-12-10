import java.util.Scanner;

public class RemoverDuplicateApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A String");
		String s=scanner.nextLine();
		RemoveDuplicate theDuplicate=new RemoveDuplicate();
		theDuplicate.removeRepeated(s);
	}

}
