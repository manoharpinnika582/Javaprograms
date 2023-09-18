import java.util.Scanner;

public class PrintS {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number odd number");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if((i==1 & j>1) || (i==n & j<n) || ((i<Math.ceilDiv(n,2) & i>1) & j==1) || ((i==Math.ceilDiv(n,2) & i>1) &j<n)|| ((i>Math.ceilDiv(n,2) & i<n) & j==n)) {
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
