/*Two numbers A and B are passed as input. The program must print the smaller number. 
If both A and B are equal, the print the output as the string value EQUAL 
Input Format: 
    The first line denotes the value of A. The first line denotes the value of B. 
Output Format: 
    The first line contains the output value as per the conditions provided. 
Boundary Conditions: 
    -99999999 > A < 99999999 -99999999 > B < 99999999 
Example Input/Output 1: 
    Input: 55 55 Output: EQUAL 
Example Input/Output 2: 
    Input: 901 122 Output: 122 
Example Input/Output 3: 
    Input: 4555 233901 Output: 4555
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==b) System.out.print("EQUAL");
		else System.out.print((a<b) ? a : b);
	}
}