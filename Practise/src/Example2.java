import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scanner.nextLine();
		System.out.println(str);
		System.out.println("Enter a Character:");
		char r=scanner.next().charAt(0);
		boolean key=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==r) {
				for(int j=i+1;j<str.length();j++) {
					System.out.print(str.charAt(j));
					key=true;
				}
				break;
			}
		}
		if(!key) {
			System.out.println(str);
		}
	}
}
