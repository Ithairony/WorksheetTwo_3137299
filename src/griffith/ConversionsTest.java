// Name: Igor Thairony Oliveira Martins
// Id : 3137299  

package griffith;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class ConversionsTest {
	// Assuming that 1€ = 0.96$
	/*
	@Test
	void testEuroToDollar( ) {	
		//			expected /	actual  / delta ( range of acceptance / message 					
		assertEquals(1.04, Conversions.euroToDollar(1), 0.02, "1€ should grant you 1.04$");	// Test for Positive values
		assertEquals(-1.04, Conversions.euroToDollar(-1), 0.02, "-1€ should grant you -1.04$");	// Test for Negative values
		assertEquals(0, Conversions.euroToDollar(0), 0.01, "0€ should be 0$");	// Test for 0
	}

	@Test
	void testDollarToEuro() {
		//		expected /	actual  / delta ( range of acceptance / message 					
		assertEquals(0.96, Conversions.dollarToEuro(1), 0.02, "1$ should grant you 0.96€");	// Test for Positive values
		assertEquals(-0.96, Conversions.dollarToEuro(-1), 0.02, "-0.96$ should grant you -1€");	// Test for Negative values
		assertEquals(0, Conversions.dollarToEuro(0), 0.01, "0$ should grant you €");	// Test for 0
	}	

	@Test
	void testStringToInteger () {

		assertEquals(123, Conversions.stringToInteger("123"), "String '123' should return 123"); // Convert a positive string
        assertEquals(-456, Conversions.stringToInteger("-456"), "String '-456' should return -456"); // Convert a negative string
        assertThrows(NullPointerException.class, () -> { Conversions.stringToInteger(null);}, "Passing null should throw NullPointerException"); // Test null

	}

	@Test
	void testIntegerToString() {

		// Test for positive values 
		String expected = "123";
		int actual = Conversions.integerToString(123).hashCode();
		assertEquals(expected.hashCode(),actual, " '123' expected but actual was " + actual);

		// Test for negative values
		String expectedTwo = "-123";
		int actualTwo = Conversions.integerToString(-123).hashCode();
		assertEquals(expectedTwo.hashCode(),actualTwo);

		// Test for 0
		String expectedThree = "0";
		int actualThree = Conversions.integerToString(0).hashCode();
		assertEquals(expectedThree.hashCode(),actualThree);


	}
	 */
	@Test
	void testSwitchCase() {

		// Testing for normal String
		Conversions converter = new Conversions();
		String conversion = converter.switchCase("HELL");
		assertEquals("hello".hashCode(),conversion.hashCode(), "HELLO should return hello");

		// Testing for empty String
		String conversionTwo = converter.switchCase("aaa");
		assertEquals("".hashCode(),conversionTwo.hashCode(), "'' should return ''");

	}

}

















