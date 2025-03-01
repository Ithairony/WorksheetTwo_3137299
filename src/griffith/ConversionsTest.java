// Name: Igor Thairony Oliveira Martins
// Id : 3137299  

package griffith;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ConversionsTest {
	// Assuming that 1€ = 0.96$
	@Test
	void testEuroToDollar( ) {	
		//			expected /	actual  / delta ( range of acceptance / message 					
		assertEquals(0.960, Conversions.euroToDollar(1), 0.02, "1€ should grant you 0.96$");	// Test for Positive values
		assertEquals(-0.96, Conversions.euroToDollar(-1), 0.02, "-1€ should grant you -0.96$");	// Test for Negative values
        assertEquals(0, Conversions.euroToDollar(0), 0.01, "0€ should be 0$");	// Test for 0
	}
	
	@Test
	void testDollarToEuro() {
//		expected /	actual  / delta ( range of acceptance / message 					
	assertEquals(1, Conversions.dollarToEuro(0.96), 0.02, "0.96$ should grant you 1€");	// Test for Positive values
	assertEquals(-0.96, Conversions.dollarToEuro(-1), 0.02, "-0.96$ should grant you -1€");	// Test for Negative values
    assertEquals(0, Conversions.dollarToEuro(0), 0.01, "0$ should grant you €");	// Test for 0
	}	
	/*
	@Test
	void testStringToInteger () {
		fail("Not yet implemented");
	}
	@Test
	void testIntegerToString() {
		fail("Not yet implemented");
	}
	@Test
	void testSwitchCase() {
		fail("Not yet implemented");
	}
	*/
}