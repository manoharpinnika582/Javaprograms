
public class Example1 {
private int temp;

public void setTemparature(int temp) {
	if(temp>0 && temp<35)
	{
	this.temp=temp;
	}
	else
	{
		System.out.println("Invalid temparature");
	}
}
public int getTemparature() {
	return temp;
}
}
