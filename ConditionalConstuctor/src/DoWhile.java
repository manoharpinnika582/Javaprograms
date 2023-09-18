import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 boolean bored = true;
		 int i=1;
		 do
		 {
			 System.out.println("Student Intrested to read the book.....!!!! "+i);
			 i++;
		     System.out.println("Do yo want read the next page....😊😊😊😊");
			
			 bored=sc.nextBoolean();
			 if(i==100) {
				 System.out.println("Book pages has ended......");
				 break;
			 }
			 else if(bored==false){
				 System.out.println("Take a rest ........");
				 break;
			 }
			 else {
				 continue;
			 }
		 }while(bored);
		 sc.close();
       
       
       
	}

}
