import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

/**
 * Test printing and scanner.
 */
public class TestFizzBuzz {
	
	@Rule
	public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void testFizzbuzz() {
		systemOutRule.clearLog(); // Clears log to ensure empty log before testing
		FizzBuzz.fizzbuzz(15);
		String log = systemOutRule.getLog().trim(); // Don't forget trimming out trailing white spaces
		assertEquals("15 should print FizzBuzz", "FizzBuzz", log);
	}
	
	@Test
	public void testFizzbuzzScanner() {
		systemOutRule.clearLog();
		systemInMock.provideLines("4");
		FizzBuzz.fizzbuzzScanner();
		String log = systemOutRule.getLog().trim();
		assertEquals("4 should print 4", "4", log);
	}

}
