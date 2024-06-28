/*A number N is passed as the input. The program must print the numbers from N to 1 (inclusive of N). 
Input Format: 
    The first line denotes the value of N 
Output Format: 
    Numbers from N to 1, with each number separated by a space. 
Boundary Conditions: 
    1 < N <= 1000 
Example Input/Output 1: 
    Input: 5 
    Output: 5 4 3 2 1 
Example Input/Output 2: 
    Input: 10 
    Output: 10 9 8 7 6 5 4 3 2 1
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>=1;i--){
		    System.out.print(i+" ");
		}
	}
}