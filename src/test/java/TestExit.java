import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.Assertion;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

/**
 * Tests for various method of exiting.
 */
public class TestExit {
	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none(); // Expects no exits by default

	@Test
	public void testExitWithCode() {
		exit.expectSystemExitWithStatus(142);
		Exit.exit(142); // should pass
	}
	
	@Test
	public void testExitWithMessage() {
		exit.expectSystemExitWithStatus(154);
		exit.checkAssertionAfterwards(new Assertion() {
			public void checkAssertion() {
				assertEquals("Exit with the correct message state", "Error!", Exit.message);
			}
	    });
		Exit.exit(154, "Error!");
	}
	
	@Test
	public void testNoExit() {
		Exit.noExit();
		assertTrue("Should pass as there are no expected exits", Exit.message.indexOf("no exit") >= 0);
	}

}
