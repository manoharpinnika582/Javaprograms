package learn.manohar.kodnest.level3;

public class FindSum {
public int findSum(int arr[]) {
	int sum=0;
	for(int i=0;i<=arr.length-1;i++) {
		
		sum=sum+arr[i];
	}
		return sum;
}
}
