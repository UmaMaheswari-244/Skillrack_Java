/*The program must accept N integers and print the second largest value among the N integers.
Input Format: The first line denotes the value of N. Next N lines will contain the N integer values.
Output Format: The first line contains the second largest integer.
Boundary Conditions: 2 <= N <= 100 The value of the integers will be from -999999 to 999999.
Example Input/Output 1:
    Input: 3 100 2200 345
    Output: 345
Example Input/Output 2:
    Input: 6 -23 -256 -87 -90 -11019 -2
    Output: -23
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
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i]<a[j]){
		            int t = a[i];
		            a[i] = a[j];
		            a[j] = t;
		        }
		    }
		}
	    System.out.print(a[1]);
	}
}
