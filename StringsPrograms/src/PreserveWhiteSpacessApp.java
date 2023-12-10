import java.util.Scanner;

public class PreserveWhiteSpacessApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=scan.nextLine();
		PreserveWhiteSpaces whiteSpace=new PreserveWhiteSpaces();
		whiteSpace.removerSpaces(str);
	}

}
