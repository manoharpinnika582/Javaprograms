
public class BirdApp {
	public static void main(String[] args) {
		
		int k=20;
		System.out.println("Without using final keyword:");
		System.out.println("Before k value: "+k);
		k=30;
		System.out.println("After assigning same k value: "+k);
		System.out.println("========================");
		
		final int a=10;
		System.out.println(a);
// Error:The final local variable a cannot be  assigned.
//		 It must be blank and not using a compound assignment		
//		a=20;
		final Sparrow sparrow=new Sparrow();
		System.out.println(sparrow);
//ERROR:The final local variable sparrow cannot be assigned. 
//		It must be blank and not using a compound assignment		
//		sparrow=new Sparrow();
		
		
	}
}
