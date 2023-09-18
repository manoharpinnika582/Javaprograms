
public class PrintArray {
 

public void printArray(int arr[]) {
	
	 
	System.out.println("Your Forward Array Contents Are.......");
	for(int i:arr) {
		 
		System.out.print((i)+" ");
	 }
	
	System.out.println("Your Reversed Array Contents Are.......");
  for(int i=arr.length-1;i>=0;i--) {
	  System.out.print(arr[i]);
  }
	
}
}
