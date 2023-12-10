class Q{
	int num;
	boolean valueset=false;
	public synchronized void setNum(int num) {
		while(valueset) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Put : "+num);
		this.num=num;
		valueset=true;
		notify();
	}
	
	public synchronized void getNum() {
		while(!valueset) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Get : "+num);
		valueset=false;
		notify();
	}
}

class Producer implements Runnable{
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t=new Thread(this);
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.setNum(i++);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class Consumer implements Runnable{
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run() {
		while(true) {
			q.getNum();
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
	}
	
}
public class InterThreadComm {
	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}
