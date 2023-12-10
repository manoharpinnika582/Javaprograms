
public class MyThread extends Thread{
	public void run() {
		Thread t1= Thread.currentThread();
		System.out.println(t1);
	}
}
