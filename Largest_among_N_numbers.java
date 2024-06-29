/*Number N is passed as the input. The program must accept N integer values and 
print the largest number L among these N numbers. 
Input Format: 
    The first line denotes the value of N. 
    The next N lines denote the value of N numbers. 
Output Format: 
    The first line denotes the value of L. 
Boundary Conditions: 
    1 <= N <= 50 
Example Input/Output 1: 
    Input: 3 100 200 40 
    Output: 200 
Example Input/Output 2: 
    Input: 5 18 500 70 30 999 
    Output: 999
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
	    System.out.print(a[0]);
	}
}