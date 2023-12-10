
public class GetPriority {
	public static void main(String[] args) throws Exception {
		Thread obj1=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("Hi "+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		
		Thread obj2=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello "+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
//		t1.setName("Hi Thread");
//		t2.setName("Hello Thread");
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		//type: 1
//		t1.setPriority(1);//setpriority
//		t2.setPriority(10);
		//type: 2
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(t1.getPriority());//by deafult:5
//		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Bye...");
		System.out.println("current thread: "+Thread.currentThread().getPriority());
	}
}
