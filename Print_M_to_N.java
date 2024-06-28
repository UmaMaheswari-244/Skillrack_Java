/*Two numbers M and N are passed as the input. The program must print the numbers from M to N (inclusive of M and N) 
Input Format: 
    The first line denotes the value of M The second line denotes the value of N 
Output Format: 
    Numbers from M to N, with each number separated by a space. 
Boundary Conditions: 
    1 <= M <= 9999999 M <= N <= 9999999 
Example Input/Output 1: 
    Input: 2 9 
    Output: 2 3 4 5 6 7 8 9 
Example Input/Output 2: 
    Input: 56 56 
    Output: 56
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i=m;i<=n;i++){
		    System.out.print(i+" ");
		}
	}
}