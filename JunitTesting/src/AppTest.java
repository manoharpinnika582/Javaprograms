import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		Sample sample=new Sample();
		int res=sample.add(10, 20);
		assertEquals(30, res);
	}
	@Test
	void test1() {
		Sample sample=new Sample();
		int res=sample.sub(20, 10);
		assertEquals(10, res);
	}

	@Test
	void test2() {
		Sample sample=new Sample();
		int res=sample.mul(10, 20);
		assertEquals(200, res);
	}

	@Test
	void test3() {
		Sample sample=new Sample();
		int res=sample.div(20, 10);
		assertEquals(2, res);
	}


}
