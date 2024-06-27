/*Two numbers M and N are passed as input. The program must print YES if M is divisible by N. 
The program must print NO if M is not divisible by N. Note: The output is case sensitive and hence must be in upper case. 
Input Format: 
    The first line denotes the value of M. The second line denotes the value of N. 
Output Format: 
    The first line contains either YES or NO 
Example Input/Output 1: 
    Input: 60 15 
    Output: YES 
Example Input/Output 2: 
    Input: 90 25 
    Output: NO
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m%n==0) System.out.print("YES");
		else System.out.print("NO");
	}
}