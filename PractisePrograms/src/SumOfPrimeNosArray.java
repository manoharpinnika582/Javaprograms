
public class SumOfPrimeNosArray {
	static boolean isPrime(int num) {
		
			if(num<=1) {
				return false;
			}
				for(int j=2;j<num;j++) {
					if(num%j==0) {
						return false;
					}
				}
			return true;
			}
	
	int findSumOfPrimeNumber(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i]))
			{
				sum+=arr[i];
			}
		}
			return sum;
	}
}
