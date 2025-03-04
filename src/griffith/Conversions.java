// Name: Igor Thairony Oliveira Martins
// Id : 3137299 

package griffith;

public class Conversions {

	// Method that converts from Euro to Dollar
	public static double euroToDollar( double euro) {
		double conversionRate = 1.04;
		return euro * conversionRate;
	}
	// Method that converts from Dollar to Euro
	public static double dollarToEuro( double dollar) {
		double conversionRate = 0.96;
		return dollar * conversionRate;
	}
	// Method that converts from String to integer
	public static int stringToInteger (String val) {
		return Integer.parseInt(val);
	}
	// Method that converts from integer to String
	public static String integerToString (int val) {
		return Integer.toString(val);
	}
	// Method that changes upper case to lower case and vice-versa
	public String switchCase(String string) {
		if(string == string.toLowerCase() ) {
			return string.toUpperCase();
		}
		else  {
			return string.toLowerCase();
			}
		
		
	}
}













