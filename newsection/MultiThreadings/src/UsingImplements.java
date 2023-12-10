class Hii implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);}catch (Exception e) {}
		}
	}
}
class Helloo implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);}catch (Exception e) {}
		}
	}
}
public class UsingImplements {
	public static void main(String[] args) {
		//instread of runnable you can write Hii 
		//and Helloo objects also
		Runnable hii=new Hii();
		Runnable helloo=new Helloo();
		Thread t1=new Thread(hii);
		Thread t2=new Thread(helloo);
		t1.start();
		try {Thread.sleep(10);}catch (Exception e) {}
		t2.start();
	}
}
