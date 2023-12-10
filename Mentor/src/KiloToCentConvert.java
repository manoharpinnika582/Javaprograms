import java.util.Scanner;

public class KiloToCentConvert {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Kilometer / Centimeter");
		String s=scanner.next();
		System.out.println("Enter a value:");
		Meter.value=scanner.nextDouble();
		if(s.equalsIgnoreCase("kilometer"))
		System.out.println("Kilometer:"+Kilometer.findKilometer()+"KM");
		else if(s.equalsIgnoreCase("centimeter"))
		System.out.println("Centimeter:"+Centimeter.findCentimeter()+"CM");
		else
			System.out.println("Invalid");
		scanner.close();
	}
}
