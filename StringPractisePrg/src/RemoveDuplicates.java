import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String/Line");
		String str=scanner.nextLine();
		
		removeDuplicates(str);
	}

	public static void removeDuplicates(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ')
				System.out.print(ch[i]);
		}
	}
}
