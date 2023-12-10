
public class CalsiCalculator {
	public void acceptCalculator(Calculator ref) {
		ref.add();
		ref.sub();
		ref.mul();
		int res=ref.div();
		System.out.println(res);
	}
}
