import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=scan.nextInt();
		if(marks<0) {
			System.out.println("Negative marks not allowed");	
		}
		else if(marks<50) {
			System.out.println("D-Grade");
			System.out.println("Congractulations");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("C-Grade");
			System.out.println("Congractulations");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("B-Grade");
			System.out.println("Congractulations");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("A-Grade");
			System.out.println("Congractulations");
		}
		else if(marks>=80 && marks<=100){
			System.out.println("A+-Grade");
			System.out.println("Congractulations");
		}
		else {
			System.out.println("Marks is out of range");
		}
		scan.close();

	}

}
