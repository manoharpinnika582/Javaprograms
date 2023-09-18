import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("Enter number between 1 to 7");
		int week=scan.nextInt();
		switch(week) {
		case 1:
			System.out.println("happy sunday");
			break;
		case 2:
			System.out.println("Boring Monday");
			break;
		case 3:
			System.out.println("tune Tuesday");
			break;
		case 4:
			System.out.println("Middle day");
			break;
		case 5:
			System.out.println("Temple");
			break;
			case 6:
				System.out.println("WAiting for weekend");
				break;
			case 7:
				System.out.println("Weekend");
				break;
			
			default:
				System.out.println("Idiot pls see the msg carefully");
		scan.close();
		}

	}

}
