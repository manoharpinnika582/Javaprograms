package program;
// area of rectangle
import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length and width");
		int l=scan.nextInt();
	    int w=scan.nextInt();
	    int res=areaOfRectangle(l,w);
	    System.out.println("Area Of Rectangle is:"+res);
	    scan.close();
	}
	public static int areaOfRectangle(int a,int b) {
		int c= a*b;
		return c;
	}

}
