
public class CalculatorApp {
	public static void main(String[] args) {
		CalsiCalculator cc=new CalsiCalculator();
		cc.acceptCalculator(new MyCalculator());
		cc.acceptCalculator(new MyCalculator1());
	}
}
