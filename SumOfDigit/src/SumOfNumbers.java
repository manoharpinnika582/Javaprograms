
public class SumOfNumbers {
	public static int sum(int n) {
		int dig=0;
		int sum=0;
		while(n!=0) {
			dig=n%10;
			sum=sum+dig;
			n=n/10;
		}
		return sum;
	}

}
