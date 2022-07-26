import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddCalculator {

	@Test
	void test() {
		Calculator calc = new Calculator();
		assertEquals(30,calc.add(10, 20));
	}
	@Test
	void subtest()
	{
		Calculator calc = new Calculator();
		assertEquals(10,calc.subtract(20, 10));
	}

}
