
public class PrintChar extends Thread{
	@Override
	public void run() {
		for(int i=65;i<70;i++) {
			System.out.println((char)(i));
			
		}
	}
}
