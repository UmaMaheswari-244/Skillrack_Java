/*Two numbers M and N are passed as input. The program must calculate the sum S of M and N. - 
If the sum S is an even number, then the program must print even. Else the program must print odd. 
Input Format: 
    The first line denotes the value of M. The second line denotes the value of N. 
Output Format: 
    The first line contains either even or odd 
Example Input/Output 1: 
    Input: 50 25 
    Output: odd 
Example Input/Output 2: 
    Input: 21 11 
    Output: even
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = m+n;
		if(sum % 2 == 0) System.out.print("even");
		else System.out.print("odd");
	}
}