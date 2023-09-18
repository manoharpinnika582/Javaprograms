package learn.manohar.kodnest.level1;

public class Frequency {
static int [] findFrequency(int arr[]) {
	int fr[]=new int [arr.length];
	int visited=-1;
	for(int i=0;i<=arr.length-1;i++) {
		int count=1;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				count++;
				
				fr[j]=visited;
			}
		}
		if(fr[i]!=visited) {
			fr[i]=count;
		}
	}
	return fr;
}
}
