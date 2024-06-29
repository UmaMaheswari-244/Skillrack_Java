/*The lengths of the sides of a triangle X, Y and Z are passed as the input. 
The program must print the smallest side as the output. 
Input Format: 
    The first line denotes the value of X. 
    The second line denotes the value of Y. 
    The third line denotes the value of Z. 
Output Format: 
    The first line contains the length of the smallest side. 
Boundary Conditions: 
    1 <= X <= 999999 
    1 <= Y <= 999999 
    1 <= Z <= 999999 
Example Input/Output 1: 
    Input: 40 30 50 
    Output: 30 
Example Input/Output 2: 
    Input: 15 15 15 
    Output: 15
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x<=y && x<=z) System.out.print(x);
		else if(y<=x && y<=z) System.out.print(y);
		else System.out.print(z);
	}
}