
public class JoinAndIsAliveMethod {
	public static void main(String[] args) throws Exception{
		Thread t1=new Thread(() ->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);}catch (Exception e) {}
			}
		});
		Thread t2=new Thread(() ->{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch (Exception e) {}
			}
		});
		t1.start();
		try {Thread.sleep(10);}catch(Exception e){}
		t2.start();
		
		//isAlive method is used to check the thread is 
		//alive or not
		System.out.println(t1.isAlive()); //o/p:true
		
		
		//join ()used to wait for a thread to complete its 
		//execution before the program continues to 
		//execute the remaining code. 
		t1.join();//in main method write throws exception
		t2.join();
		//join method put inside the comments u will find
		//the difference
		
		System.out.println(t1.isAlive()); //o/p:false
		System.out.println("Bye");
	}
}
