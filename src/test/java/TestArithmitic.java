import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests basic arithmitic static methods.
 */
public class TestArithmitic {

	@Test
	public void testAdd() {
		assertEquals("3 + 2 = 5", 5, Arithmitic.add(3, 2));
	}

	@Test
	public void testDistance() {
		assertEquals(
				"Distance between (-3, 2) and (3, 5) is 6.7082039325.",
				6.7082039325,
				Arithmitic.distance(-3, 2, 3, 5),
				0.0001);
		assertEquals(
				"Distance between (1, 1) and (1, 1) is 0.",
				0,
				Arithmitic.distance(1, 1, 1, 1),
				0.0001);
	}

	@Test
	public void testFactorial() {
		assertEquals("3! = 6", 6, Arithmitic.factorial(3));
		assertEquals("0! = 1", 1, Arithmitic.factorial(0));
	}

}
