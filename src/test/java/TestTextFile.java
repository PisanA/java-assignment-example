import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * 
 * Tests for file reading and exception
 */
public class TestTextFile {

	@Test
	public void testGetLine() throws FileNotFoundException {
		TextFile tf = new TextFile("input1.txt");
		assertEquals("Correct line recalled from text file",
				"Jahy-sama wa Kujikenai!", tf.getLine(214));
	}
	
	@Test(expected = FileNotFoundException.class)
	public void testGetLineNotFound() throws FileNotFoundException {
		new TextFile("notfound.txt");
	}

}
