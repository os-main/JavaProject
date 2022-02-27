/**
 * @author: Uthman Ahmed
 * Unit 2
 *This program converts fehrenheit to celcius.
 **/
public class temperature {

	public static void main(String[] args) {
		double fahrenheit =	87.6;	
     // The data value is double in order to output the decimal.
		double celsius = (fahrenheit - 32) /1.8;
	// This converts fahrenheit to celsius.
		
		System.out.println("Fahrenheit Temperature: " + fahrenheit );
		System.out.println("Celsius Temperature: " + celsius );

	}

}
