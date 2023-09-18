import java.util.Scanner;

public class PrintD {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if( j==1 || (i==1 & j<=n-1)|| (i==n & j<=n-1)||(i>1 & i<=n-1)& j==n ) {
					System.out.print(" *");
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
