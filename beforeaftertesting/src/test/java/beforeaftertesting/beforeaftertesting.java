package beforeaftertesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class beforeaftertesting {

	Calculator c;
	@Before
	public void initiate() {
		c=new Calculator();
	}
	
	@Test
	public void test() {
		int result=c.adding(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	public void test1() {
		int result=c.substract(20, 10);
		assertEquals(10, result);
	}
	@After
	public void resetting() {
		c.reset();
		System.out.println(c.res);
	}

}
