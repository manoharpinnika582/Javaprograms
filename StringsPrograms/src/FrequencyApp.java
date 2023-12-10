import java.util.Scanner;

public class FrequencyApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scanner.nextLine();
		Frequency theFrequency=new Frequency();
		 theFrequency.findFrequency(str);
	
	}

}
