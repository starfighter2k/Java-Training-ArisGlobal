package training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElevatorTest {

	@Test
	void test() {
		Elevator ele = new Elevator();
		assertEquals(2,ele.rideLift(10, 2));
	}
	@Test
	void testFail() {
		Elevator ele = new Elevator();
		assertEquals(-8,ele.rideLift(10, -8));
	}

}
