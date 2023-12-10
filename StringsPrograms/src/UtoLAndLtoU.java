
public class UtoLAndLtoU {
void letterConverter(String str) {
	char arr[]=str.toCharArray();
	for(int i=0;i<=arr.length-1;i++) {
	char c=arr[i];
	if(Character.isLowerCase(c)) 
	{
		arr[i]=Character.toUpperCase(c);
	}
	else 
	{
		arr[i]=Character.toLowerCase(c);
	}
	}
	String str1=new String(arr);
	System.out.println("Your Converted String is : "+str1);
}
}
