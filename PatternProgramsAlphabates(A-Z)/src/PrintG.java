import java.util.Scanner;

public class PrintG {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a odd number to visible clearly more than 4");
		int n=scanner.nextInt();
		int mid=Math.ceilDiv(n,2);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {	
				
				if(i==1 || (i==mid & j>=3) || j==1  || i==n || (i>mid & j==n)){
					System.out.print(" G");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		scanner.close();

	}

}
