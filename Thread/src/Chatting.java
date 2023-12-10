
public class Chatting extends Thread{
	public void run() {
		try {
			System.out.println("Chatting Started");
			Thread.sleep(2000);
			System.out.println("Chit CHat Chit Chat");
			Thread.sleep(2000);
			System.out.println("Chatting Ended");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
