import java.util.Scanner;

public class UnicodeConverter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scanner.nextLine();
		System.out.println("Your String :"+s1);
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int uniCode=(int)ch;
			System.out.println("character : "+ch+" and Unicode Value :"+uniCode);
		}
		
		
	}

}
