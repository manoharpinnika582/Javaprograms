package learn.manohar.kodnest.level1;

public class CheckMatrixIsNullOrNot {
boolean isMatrix(int arr[][]) {
	 for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			if(arr[i][j]==0) {
				return false;
			}
		}
	}
	return true;
}
}
