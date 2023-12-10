
public class Reels extends Thread{
	public void run() {
		try {
			System.out.println("Creating Reel");
			Thread.sleep(2000);
			System.out.println("Uploading Reel");
			Thread.sleep(2000);
			System.out.println("Sharing Reel");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
