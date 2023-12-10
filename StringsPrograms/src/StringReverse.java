import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scanner.nextLine();
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		for (char c : arr2) {
			System.out.print(c+" ");
		}
		System.out.println();
		String s2=new String(arr2);
		 System.out.println(s2);
	}

}
