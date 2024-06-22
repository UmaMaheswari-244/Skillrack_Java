/*The program must accept a number N and print the sum of tenth and unit digits.
Input Format: The first line denotes the value of N.
Output Format: The first line contains the sum of tenth and unit digits.
Boundary Conditions: 10 <= N <= 9999999
Example Input/Output 1:
    Input: 231
    Output: 4
Example Input/Output 2:
    Input: 100
    Output: 0
Example Input/Output 3:
    Input: 192
    Output: 11
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int u = (n%10);
		int t = (n%100)/10;
		System.out.print(u+t);
	}
}
