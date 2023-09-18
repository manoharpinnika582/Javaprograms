
public class PrintM {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(  ((i>1 & i<Math.ceilDiv(5,2))& j%2==0)||(i==Math.ceilDiv(5,2) & j==Math.ceilDiv(5,2))|| j==5 || j==1 ) {
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
