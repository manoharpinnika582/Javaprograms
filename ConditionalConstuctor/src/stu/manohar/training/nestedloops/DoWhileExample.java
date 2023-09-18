package stu.manohar.training.nestedloops;

public class DoWhileExample {

	public static void main(String[] args) {
		int manu=1;
		do {
			System.out.println("Manu Loop : "+manu);
			int keerthi=1;
			do {
				System.out.println("         Keerthi Loop : "+keerthi);
				keerthi++;
			}while(keerthi<=3);
				manu++;
			}while(manu<=4);
		}

	}


