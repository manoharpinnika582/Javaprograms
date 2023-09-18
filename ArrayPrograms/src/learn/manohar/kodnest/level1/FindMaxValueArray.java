package learn.manohar.kodnest.level1;

public class FindMaxValueArray {
int findmaxValue(int arr[]) {
	int maxValue=arr[0];
	for(int i=0;i<=arr.length-1;i++) 
	{
		if(arr[i]>maxValue) 
		{
			maxValue=arr[i];
		}
	}
	return maxValue;
	
}
}
