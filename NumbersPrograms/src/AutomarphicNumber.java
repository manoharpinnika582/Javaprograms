
public class AutomarphicNumber {
public int cheking(int n) {
	//Storing n value To help Variable
	int help=n;
	int count=0;
	//count digits what ever there is in n
	while(help!=0) {
		help=help/10;
		count++;
	}
	int square=n*n;
	//determines the last digit of the variable square 
	int res=(int) (square%(Math.pow(10, count)));
	
	return res;
	
}
}
