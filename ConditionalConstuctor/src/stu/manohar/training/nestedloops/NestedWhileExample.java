package stu.manohar.training.nestedloops;

public class NestedWhileExample {

	public static void main(String[] args) {
		int manu=1;
		while(manu<=4) {
			System.out.println("Manu Loop : "+manu);
			int keerthi=1;
			while(keerthi<=3) {
				System.out.println("     Keerthi Loop : "+keerthi);
				keerthi++;
			}
			manu++;
		}

	}

}
