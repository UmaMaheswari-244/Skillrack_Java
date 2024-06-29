/*Number N is passed as the input. The program must accept N integer values and print their sum as the output. 
Input Format: 
    The first line denotes the value of N. 
    The next N lines denote the value of N numbers. 
Output Format: 
    The sum of N numbers. 
Boundary Conditions: 
    1 <= N <= 99999 
Example Input/Output 1: 
    Input: 3 100 200 40 
    Output: 340 
Example Input/Output 2: 
    Input: 5 982 18 500 70 30 
    Output: 1600
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    sum+=a[i];
		}
		System.out.print(sum);
	}
}