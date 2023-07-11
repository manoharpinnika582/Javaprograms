import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		MessageDecode decoder = new MessageDecode();

	System.out.println(decoder.decodeCharacter(ch));
		scan.close();

	}

}
