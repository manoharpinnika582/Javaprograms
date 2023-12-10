import java.util.Scanner;

public class FrquencyCount {
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a String/Line");
			String str=scanner.nextLine();
			findFrequency(str);
	}

	public static void findFrequency(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int freq=1;
			if(ch[i]!=' ') {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
					freq++;
					ch[j]=' ';
					}
				}
				System.out.println(ch[i]+" | "+freq);

			}
			
		}
	}
}
