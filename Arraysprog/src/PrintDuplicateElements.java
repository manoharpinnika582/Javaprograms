
public class PrintDuplicateElements {
 public void findDuplicate(int arr1[]) 
{
	 for(int i=0;i<=arr1.length-1;i++) 
			{
				for(int j=i+1;j<=arr1.length-1;j++) 
				{
					if(arr1[i]==arr1[j]) 
					{
						System.out.print(arr1[j]+" ");
					}
				}
			}
}


}
