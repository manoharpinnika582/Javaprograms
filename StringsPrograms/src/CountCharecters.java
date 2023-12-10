import java.util.Scanner;

public class CountCharecters {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String Value");
		String str=scanner.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
