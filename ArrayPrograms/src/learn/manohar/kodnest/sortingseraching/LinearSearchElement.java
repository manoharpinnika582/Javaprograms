package learn.manohar.kodnest.sortingseraching;

public class LinearSearchElement {
int findKey(int arr[],int key) {
	for(int i=0;i<=arr.length-1;i++) {
		if(key==arr[i]) {
			return i;
		}
	}
	return -1;
}
}
