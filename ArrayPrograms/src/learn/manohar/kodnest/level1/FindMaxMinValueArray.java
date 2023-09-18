package learn.manohar.kodnest.level1;

public class FindMaxMinValueArray {
int findMaxValue(int arr[]) {
	int max=arr[0];
	
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}
	return max;
}
int findMinValue(int arr[]) {
	int min=arr[0];
	for(int i=0;i<=arr.length-1;i++) {
		
	   if(arr[i]<min) {
		   min=arr[i];
	   }
	}
	return min;
}
}

