import java.util.Scanner;

public class RevEachWordPresSpaces {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String/Line");
		String str=scanner.nextLine();
		
		revEachStringPreserveSpaces(str);
	}

	public static void revEachStringPreserveSpaces(String str) {
		char arr[]=str.toCharArray();
		char revArr[]=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				revArr[i]=arr[i];
				
			}
		}
		
		int j=revArr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				if(revArr[j]==' ') {
					j--;
				}
				revArr[j]=arr[i];
				j--;
			}
		}
		for(char c:revArr) {
			System.out.print(c);
		}
	}
}
