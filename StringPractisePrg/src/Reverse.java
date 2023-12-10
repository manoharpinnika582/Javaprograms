import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  a String");
		String str=scanner.nextLine();
		
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		System.out.println(str1);
		
//		char ch[]=str.toCharArray();
//		
//		char rev[]=new char[ch.length];
//		int j=0;
//		for(int i=ch.length-1;i>=0;i--) {
//			rev[j]=ch[i];
//			j++;
//		}
//		
//		for(char c:rev) {
//			System.out.print(c);
//		}
	}
}
