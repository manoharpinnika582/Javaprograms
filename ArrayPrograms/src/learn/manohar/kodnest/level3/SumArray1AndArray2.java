package learn.manohar.kodnest.level3;

public class SumArray1AndArray2 {
int [] sumOfTwoArray(int arr1[],int arr2[]) {
	int arr3[]=new int[arr1.length];
	
	for(int i=0;i<=arr1.length-1;i++) {
		arr3[ i]=arr1[i]+arr2[i];
	}
	return arr3;
}
}
