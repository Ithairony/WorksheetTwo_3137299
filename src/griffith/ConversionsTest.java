// Name: Igor Thairony Oliveira Martins
// Id : 3137299  

package griffith;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class ConversionsTest {
	// Assuming that 1€ = 0.96$
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
        // assertThrows(NullPointerException.class, () -> { Conversions.stringToInteger(null);}, "Passing null should throw NullPointerException"); // Test null
	}
	
	@Test
	void testIntegerToString() {
        assertEquals("123", Conversions.integerToString(123), "Integer 123 should be converted to '123'");
        assertEquals("-456", Conversions.integerToString(-456), "Integer -456 should be converted to '-456'");
        assertEquals("0", Conversions.integerToString(0), "Integer 0 should be converted to '0'");
	}
	
	/*
	@Test
	void testSwitchCase() {
		fail("Not yet implemented");
	}
	 */
}

















