package learn.manohar.kodnest.level1;

public class FindMinValueArray {
int findMinValue(int arr[]) {
	int minValue=arr[0];
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]<minValue) {
			minValue=arr[i];
		}
	}
return minValue;
}
}
