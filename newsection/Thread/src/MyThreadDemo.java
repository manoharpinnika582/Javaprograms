
public class MyThreadDemo {
	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		MyThread t2=new MyThread();
		t2.start();
		t2.setName("MyThread");
		t2.setPriority(1);
		
	}
}
