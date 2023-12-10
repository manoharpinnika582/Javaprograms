import java.util.Scanner;

public class UtoLAndLtoUApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str=scan.nextLine();
		UtoLAndLtoU theConverter=new UtoLAndLtoU();
		theConverter.letterConverter(str);
	}

}
