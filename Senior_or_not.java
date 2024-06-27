/*The age A of a customer is passed as the input. If the age is greater than or equal to 60, 
the program must print senior else the program must print notsenior. 
Input Format: 
    The first line denotes the value of A. 
Output Format: 
    The first line contains the output value as per the conditions provided. 
Boundary Conditions: 
    0 < A <= 150 
Example Input/Output 1: 
    Input: 60 
    Output: senior 
Example Input/Output 2: 
    Input: 72
    Output: senior 
Example Input/Output 3: 
    Input: 34 
    Output: notsenior
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=60){
		    System.out.print("senior");
		}
		else{
		    System.out.print("notsenior");
		}
	}
}