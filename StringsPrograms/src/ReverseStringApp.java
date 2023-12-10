import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A String Want You Want To Print Reverse");
		String str=scanner.nextLine();
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		System.out.println("Your Revrsed String Is.....");
	System.out.println(revStr);
	
	}

}
