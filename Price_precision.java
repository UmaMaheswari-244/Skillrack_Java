/*The price P of an item is passed as the input. The program must print the value of P,
formatting it up to 2 places after decimal point. The output of the program must be "The price is P"
Example Input/Output 1:
    Input: 24.5912
    Output: The price is 24.59
Example Input/Output 2:
    Input: 34.1754
    Output: The price is 34.18
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		String n = String.format("%.2f",m);
		System.out.print("The price is "+n);

	}
}
