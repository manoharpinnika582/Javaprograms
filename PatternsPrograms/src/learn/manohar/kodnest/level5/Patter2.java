package learn.manohar.kodnest.level5;


public class Patter2 {

	public static void main(String[] args) {
		
       for(int i=1;i<=3;i++) {
    	   for(int j=1;j<=5;j++) {
    		 
    		   if((i==1 & j==3) || (i==2 & j%2==0)|| i==3 ) {
    			   System.out.print("* ");
    		   }
    		   else {
    			   System.out.print("  ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
