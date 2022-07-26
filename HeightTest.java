package training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeightTest {

	@Test
	void test() {
		HeightConvert h1 = new HeightConvert();
		HeightConvert h2 = new HeightConvert();
		h1.setHeight(5, 10);
		h2.setHeight(5, 11);
		assertEquals(352.5,h1.add(h2));
	}
	@Test
	void testFail() {
		HeightConvert h1 = new HeightConvert();
		HeightConvert h2 = new HeightConvert();
		h1.setHeight(5, 10);
		h2.setHeight(5, 11);
		assertEquals(350.5,h1.add(h2));
	}

}
