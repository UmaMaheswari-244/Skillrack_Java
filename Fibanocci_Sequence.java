/*An integer value N is passed as the input. The program must print the first N terms in the Fibonacci sequence.
Input Format: The first line denotes the value of N.
Output Format: The first N terms in the Fibonacci sequence (with each term separated by a space)
Boundary Conditions: 3 <= N <= 50
Example Input/Output 1:
    Input: 5
    Output: 0 1 1 2 3
Example Input/Output 2:
    Input: 10
    Output: 0 1 1 2 3 5 8 13 21 34
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
	    long a=0, b=1;
	    System.out.print(a+" "+b);
	    for(int i=2;i<n;i++){
	        long c=a+b;
	        System.out.print(" "+c);
	        a=b;
	        b=c;
	    }
	}
}
