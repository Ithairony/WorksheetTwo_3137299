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
		//assertEquals(9.60, Conversions.euroToDollar(1), 0.02, "1€ should grant you 0.96$");	// Test for positive values
		assertEquals(-0.96, Conversions.euroToDollar(-1), 0.02, "-1€ should grant you -0.96$");	// Test for positive values
	}
	@Test
	void testDollarToEuro() {
		fail("Not yet implemented");		
	}	
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
}