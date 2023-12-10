import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String/Line");
		String str=scanner.nextLine();
		reverseEachword(str);
	}

	public static void reverseEachword(String str) {
		String word[]=str.split(" ");
		String revWord="";
		String str1=null;
		for(int i=0;i<word.length;i++) {
			String words = word[i];
			char arr[]=words.toCharArray();
			char rev[]=new char[arr.length];
			int j=arr.length-1;
			for(int k=0;k<arr.length;k++) {
				rev[j]=arr[k];
				j--;
			}
			 str1=new String(rev);
			revWord+=str1+" ";
		}
		System.out.println(revWord);
	}
}
