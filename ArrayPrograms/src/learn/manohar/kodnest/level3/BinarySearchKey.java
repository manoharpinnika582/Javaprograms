package learn.manohar.kodnest.level3;

public class BinarySearchKey {
boolean searchKey(int arr[],int key) {
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(key==arr[mid]) {
			return true;
		}
		else if(key>arr[mid]) {
			low=mid+1;
			//high=high;  ------Optional
		}
		else {
			high=mid-1;
			//low =low; -------Optional
		}
	}
	return false;
}
}
