/*A number N is passed as the input to the program. If the number is greater than zero, the program must print positive. 
If the number is less than zero, the program must print negative. 
If N is equal to zero, the program must print zero. 
Input Format: 
    The first line denotes the value of N. 
Output Format: 
    The first line contains one of the following values - positive, negative, zero 
Boundary Conditions: 
    -99999999 > N < 99999999 
Example Input/Output 1: 
    Input: 544 
    Output: positive 
Example Input/Output 2: 
    Input: -91 
    Output: negative 
Example Input/Output 3: 
    Input: 0 
    Output: zero
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0) System.out.print("positive");
		else if(n<0) System.out.print("negative");
		else System.out.print("zero");
	}
}