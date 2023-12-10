import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String to find Sub Strings");
		String sub=scanner.next();
		for(int i=0;i<sub.length();i++) {
			String temp="";
			for(int j=i;j<sub.length();j++) {
				temp=sub.substring(i,j+1);
				//another logic
//				temp+=sub.charAt(j);
				System.out.println(temp);
			}
			System.out.println();
		}
	}
}
