package beforeaftertesting;

public class Calculator {
	int res=0;
	public int adding(int x, int y) {
		res=x+y;
		return res;
	}
	public int substract(int x, int y) {
		res=x-y;
		return res;
	}
	public void reset() {
		res=0;
	}
}
