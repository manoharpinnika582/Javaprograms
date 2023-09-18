
public class ArmsrongNumber {
int findArmstrongNumber(int n) {
	int last=0;
	int sum=0;
	int count=0;
	int temp;
	temp=n;
	while(temp>0)    
	{   
	temp = temp/10;   
	count++;   
	}   
	temp = n;   
	while(temp!=0) {
		 last=temp%10;
		 
		 sum +=  (Math.pow(last, count));  
		temp=temp/10;
	}
	return sum;
}
}
