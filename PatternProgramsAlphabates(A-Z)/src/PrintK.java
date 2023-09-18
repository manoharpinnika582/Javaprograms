
public class PrintK {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {				
				if(j==1 || i+j==4 ||(i>=3& i+j==k)){
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				k=k+2;
				
			}
			System.out.println();
			
	}
	}

}
