/*Two numbers M and N are passed as the input. The program must print the numbers divisible by 15 from M to N (inclusive of M and N) 
Input Format:  
    The first line denotes the value of M The second line denotes the value of N 
Output Format: 
    Numbers divisible by 15 from M to N, with each number separated by a space. Boundary Conditions: 1 <= M <= 9999999 M <= N <= 9999999 
Example Input/Output 1: 
    Input: 2 40 
    Output: 15 30 
Example Input/Output 2: 
    Input: 45 120 
    Output: 45 60 75 90 105 120
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i=m;i<=n;i++){
		    if(i%15==0){
		        System.out.print(i+" ");
		    }
		}
	}
}