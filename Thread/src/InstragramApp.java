
public class InstragramApp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Insragram Application Started");
		Chatting c=new Chatting();
		Reels r=new Reels();
		
		c.start();
		r.start();
		
		c.join();
		r.join();
		System.out.println("Insragram Application Terminated");

	}
}
