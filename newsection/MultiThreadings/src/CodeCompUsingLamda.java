public class CodeCompUsingLamda {
		public static void main(String[] args) {
			Runnable runnable=() ->{
					for(int i=1;i<=5;i++) {
						System.out.println("Hi");
						try {Thread.sleep(1000);}catch (Exception e) {}
					}
				};
			Runnable runnable2=() ->{
					for(int i=1;i<=5;i++) {
						System.out.println("Hello");
						try {Thread.sleep(1000);}catch (Exception e) {}
					}
				};
			Thread t1=new Thread(runnable);
			Thread t2=new Thread(runnable2);
			t1.start();
			try {Thread.sleep(10);}catch(Exception e){}
			t2.start();
		}
	}


