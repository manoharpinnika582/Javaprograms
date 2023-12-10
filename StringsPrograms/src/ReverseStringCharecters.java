import java.util.Scanner;

public class ReverseStringCharecters {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scanner.nextLine();
		char ch[]=str.toCharArray();
		
		System.out.println("Your Revesed String Is ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(ch[i]+" ");		
			}
	}

}
