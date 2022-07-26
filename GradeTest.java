package training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradeTest {

	@Test
	void test() {
		Grades grd = new Grades();
		assertEquals('D',grd.retGrade(66, 66, 66));
	}
	@Test
	void testFail()
	{
		Grades grd = new Grades();
		assertEquals('D',grd.retGrade(64, 64, 64));
	}

}
