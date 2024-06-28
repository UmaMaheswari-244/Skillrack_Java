/*A number N is passed as the input. The program must print the numbers from 1 to N with each number separated by a space. 
Input Format: 
    The first line denotes the value of N. 
Output Format: 
    Numbers from 1 to N, with each number separated by a space. 
Boundary Conditions: 
    1 <= N <= 999 
Example Input/Output 1: 
    Input: 10 
    Output: 1 2 3 4 5 6 7 8 9 10 
Example Input/Output 2: 
    Input: 1 
    Output: 1
*/ 

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
		    System.out.print(i+" ");
		}
	}
}