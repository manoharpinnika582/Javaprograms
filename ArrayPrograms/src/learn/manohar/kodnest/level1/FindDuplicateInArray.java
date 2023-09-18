package learn.manohar.kodnest.level1;

public class FindDuplicateInArray {
int findFrequency(int arr[]) {
	int count=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				count++;
				//break;
			}
		}
	}
	
	return count;
}
}
