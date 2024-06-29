/*A polygon is with N sides. The program must accept the length of the N sides and 
print the perimeter P of the polygon as the output. 
Input Format: 
    The first line denotes the value of N. 
    Next N lines contain the length of the N sides.
Output Format: 
    The first line contains the the perimeter P of the polygon 
Boundary Conditions: 
    3 <= N <= 100 
    The length of the side is an integer value from 1 to 999999. 
Example Input/Output 1: 
    Input: 3 100 60 70 
    Output: 230 
Example Input/Output 2: 
    Input: 5 300 100 100 200 200 
    Output: 900
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		int p = 0;
		for(int i=0;i<n;i++){
		    p+=a[i];
		}
		System.out.print(p);
	}
}