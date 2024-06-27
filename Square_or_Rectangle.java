/*The program take the values of length and breadth of a rectangle from user and check if it is square or not program.
Input Format: 
    The first line denotes the value of l. The second line denotes the value of b. 
Output Format: 
    The first line contains either SQUARE or RECTANGLE
Example Input/Output 1: 
    Input: 22 22 
    Output: SQUARE
Example Input/Output 2: 
    Input: 100 60 
    Output: RECTANGLE
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		if(l==b) System.out.print("SQUARE");
		else System.out.print("RECTANGLE");
	}
}