import java.util.Scanner;

public class SumOfPrimeNosArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		SumOfPrimeNosArray sumPrime=new SumOfPrimeNosArray();
		int res=sumPrime.findSumOfPrimeNumber(arr);
		if(res!=-1) {
			System.out.println(res);
		}
	}
}
