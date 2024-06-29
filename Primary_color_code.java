/*The program must accept a character C and print the output based on the following conditions. - 
If C is r or R, the output must be RED - If C is g or G, the output must be GREEN - 
If C is b or B, the output must be BLUE - If C is any other value, the output must be UNDEFINED 
Input Format: 
    The first line denotes the value of C. 
Output Format: 
    The first line contains the value based on the given conditions. (The output is CASE SENSITIVE). 
Boundary Conditions: 
    C will be a single character. 
Example Input/Output 1: 
    Input: R 
    Output: RED 
Example Input/Output 2: 
    Input: + 
    Output: UNDEFINED 
Example Input/Output 3: 
    Input: Y 
    Output: UNDEFINED
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
	    if(c=='r'||c=='R') System.out.print("RED");
	    else if(c=='g'||c=='G') System.out.print("GREEN");
	    else if(c=='b'||c=='B') System.out.print("BLUE");
	    else System.out.print("UNDEFINED");
    }
}