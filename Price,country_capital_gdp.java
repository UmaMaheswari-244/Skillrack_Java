/*The name of a country, the name of it's capital and the GDP per capita in US Dollars are passed as input.
The program must print the output in the format given below. The GDP per capita must be rounded up to 2 decimal places.
CAUTION: Based on the programming language used, please be aware of the new line character being fed instead of the GDP value
(when accepting GDP as input after the string value for capital.)
Example Input/Output:
     Input: India
            Delhi
            1498.871
     Output: The capital of India is Delhi and it's GDP is 1498.87
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country = sc.nextLine();
		String capital = sc.nextLine();
		double gdp = sc.nextDouble();
		String n = String.format("%.2f",gdp);
		System.out.print("The capital of "+country+" is "+capital+" and it's GDP is "+n);
	}
}
