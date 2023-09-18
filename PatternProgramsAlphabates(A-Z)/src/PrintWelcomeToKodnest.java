
public class PrintWelcomeToKodnest {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(  i>=3 & i+j==6 || j==1 || j==5|| i==4 & j==4) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if( j==1 || i==1 || i==5 || i==3 ) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
