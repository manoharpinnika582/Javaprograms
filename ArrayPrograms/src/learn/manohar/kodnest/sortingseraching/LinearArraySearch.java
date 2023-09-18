package learn.manohar.kodnest.sortingseraching;

public class LinearArraySearch {
	boolean isPresent(int arr[],int target) {
	for(int i=0;i<=arr.length-1;i++) {
		if(target==arr[i]) {
			return true;
		}
	}
	return false;
	}
}
