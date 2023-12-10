import java.util.Scanner;

public class OutputFormate {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter String Value:");
	String str=scanner.nextLine();
	for(int i=0;i<str.length();i++) {
		if(str!=" ") {
		for(int j=i+1;j<str.length();j++) {
			
				System.out.print(str.charAt(j));
		}
	}
	}
}
}
