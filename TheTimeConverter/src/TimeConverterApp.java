import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int minutes=scan.nextInt();
		System.out.println(TimeConverter.convertToHours(minutes));
        scan.close();
	}

}
